package pers.liuliang.bean;

import pers.liuliang.anno.Bean;
import pers.liuliang.anno.Di;

import java.io.File;
import java.io.IOException;
import java.lang.reflect.Field;
import java.net.URL;
import java.net.URLDecoder;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 20:06
 */
public class AnnotationApplicationContext implements ApplicationContext {
    private Map<Class, Object> beanFactory = new HashMap<>();
    private static String rootPath;

    @Override
    public Object getBean(Class clazz) {
        return beanFactory.get(clazz);
    }

    public AnnotationApplicationContext(String basePackage) {
        String packagePath = basePackage.replaceAll("\\.", "\\\\");
        try {
            Enumeration<URL> urls = Thread.currentThread().getContextClassLoader().getResources(packagePath);
            while (urls.hasMoreElements()) {
                URL url = urls.nextElement();
                String filePath = URLDecoder.decode(url.getFile(), "utf-8");
                rootPath = filePath.substring(0, filePath.lastIndexOf(packagePath));
                loadBean(new File(filePath));
            }
        }  catch (Exception e) {
            throw new RuntimeException(e);
        }
        
        loadDi();
    }



    private void loadBean(File file) throws Exception {
        if (file.isDirectory()) {
            File[] childrenFiles = file.listFiles();
            if (childrenFiles == null || childrenFiles.length == 0) {
                return;
            }

            for (File childFile : childrenFiles) {
                if (childFile.isDirectory()) {
                    loadBean(childFile);
                } else {
                    String pathWithClass = childFile.getAbsolutePath().substring(rootPath.length() - 1);
                    if (pathWithClass.contains(".class")) {
                        String allName = pathWithClass.replaceAll("\\\\", ".").replace(".class", "");
                        Class<?> clazz = Class.forName(allName);
                        if (!clazz.isInterface()) {
                            Bean annotation = clazz.getAnnotation(Bean.class);
                            if(annotation != null) {
                                Object instance = clazz.getConstructor().newInstance();
                                if(clazz.getInterfaces().length > 0) {
                                    beanFactory.put(clazz.getInterfaces()[0], instance);
                                } else {
                                    beanFactory.put(clazz, instance);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    private void loadDi() {
        Set<Map.Entry<Class, Object>> entries = beanFactory.entrySet();
        for (Map.Entry<Class, Object> entry : entries) {
            Object obj = entry.getValue();
            Class<?> clazz = obj.getClass();
            Field[] declaredFields = clazz.getDeclaredFields();
            for (Field field : declaredFields) {
                Di annotation = field.getDeclaredAnnotation(Di.class);
                if(annotation != null ) {
                    field.setAccessible(true);
                    try {
                        field.set(obj, beanFactory.get(field.getType()));
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
