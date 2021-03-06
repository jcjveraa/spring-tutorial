package cyou.jelle.springruntimeconfigtest;

import java.util.concurrent.TimeUnit;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        while (true) {
            ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContextRuntimeTest.xml");
            Foo bean = context.getBean("myBean", Foo.class);
            bean.SayHello();
            context.close();
            sleepOneSecond();
        }
    }

    private static void sleepOneSecond() {
        try {
            TimeUnit.SECONDS.sleep(1);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
