package ditestspring;

import org.springframework.stereotype.Component;

@Component
public class ServiceTwoImpl implements ServiceTwo {
  @Override
  public void test() {
    System.out.println("Service Two: " + this.hashCode());
  }
}
