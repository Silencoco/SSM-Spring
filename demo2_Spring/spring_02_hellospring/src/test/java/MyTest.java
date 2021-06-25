import com.laj.pojo.Hello;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MyTest {
    public static void main(String[] args) {
        //获取Spring的上下文对象
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        //我们的对象现在都在Spring中的管理了
        Hello hello = (Hello) context.getBean("hello");
        System.out.println(hello.toString());
    }
}
