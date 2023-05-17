package pers.liuliang.spring6.junit.junit5;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class) // Junit4
@ContextConfiguration("classpath:bean.xml")
public class SpringTestJunit4 {
    @Autowired
    private User user;

    @Test
    public void testUser() {
        System.out.println(user);
        user.run();
    }
}
