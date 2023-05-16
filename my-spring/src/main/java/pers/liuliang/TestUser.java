package pers.liuliang;

import pers.liuliang.bean.AnnotationApplicationContext;
import pers.liuliang.bean.ApplicationContext;
import pers.liuliang.service.UserService;

/**
 * <p>Description: </p>
 *
 * @author <a href="mail to: lliang@outlook.com" rel="nofollow">liu liang</a>
 * @version v1.0, 2023/5/16 - 20:55
 */
public class TestUser {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationApplicationContext("pers.liuliang");
        UserService userService = (UserService)context.getBean(UserService.class);
        System.out.println(userService);
        userService.add();
    }
}
