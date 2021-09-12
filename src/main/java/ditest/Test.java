package ditest;

import com.google.inject.*;
import com.google.inject.Module;

public class Test {

  public static void main(String[] args) throws InterruptedException {
    // Dependency injector
    Injector injector = Guice.createInjector(new BasicModule());
    // Reflection
    ServiceOne serviceOne = injector.getInstance(ServiceOne.class);
    serviceOne.print(); // service one hash, service two hash

    System.out.println("------------------------------------------");
    ServiceOne serviceOne1 = injector.getInstance(ServiceOne.class);
    serviceOne1.print();

    //    ServiceTwo ser = injector.getInstance(ServiceTwo.class);
    //    serviceTwo.test(); // service two hash
  }
}
