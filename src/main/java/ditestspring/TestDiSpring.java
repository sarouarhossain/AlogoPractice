package ditestspring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestDiSpring {
  public static void main(String[] args) {
    //
    ApplicationContext context = new AnnotationConfigApplicationContext(SpringMainConfig.class);
    ServiceOne serviceOne = context.getBean(ServiceOne.class);
    serviceOne.print();

    System.out.println("--------------------------------------");
    ServiceTwo serviceTwo = context.getBean(ServiceTwo.class);
    serviceTwo.test();
  }
}
