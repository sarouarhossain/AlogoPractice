package ditestspring;

import org.springframework.stereotype.Component;

@Component
public class ServiceOneImpl implements ServiceOne {
  private final ServiceTwo serviceTwo;

  public ServiceOneImpl(ServiceTwo serviceTwo) {
    this.serviceTwo = serviceTwo;
  }

  @Override
  public void print() {
    serviceTwo.test();
    System.out.println("Service one: " + this.hashCode());
  }
}
