import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        // Получаем два бина HelloWorld
        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld bean2 = (HelloWorld) applicationContext.getBean("helloworld");

        // Сравнение по ссылке для HelloWorld (должно быть true)
        System.out.println("HelloWorld бин1 равен бин2? " + '\n'+(bean1 == bean2));

        // Получаем два бина Cat
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        Cat cat2 = (Cat) applicationContext.getBean("cat");

        // Сравнение по ссылке для Cat (должно быть false, так как бин prototype)
        System.out.println("Cat бин1 равен бин2? " + '\n'+(cat1 == cat2));
    }
}