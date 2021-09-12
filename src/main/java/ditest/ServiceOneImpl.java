package ditest;

import com.google.inject.Inject;

public class ServiceOneImpl implements ServiceOne {
  //  private final ServiceTwo serviceTwo;
  //
  //  @Inject
  //  public ServiceOneImpl(ServiceTwo serviceTwo) {
  //    this.serviceTwo = serviceTwo;
  //  }

  @Override
  public void print() {
    // serviceTwo.test();
    System.out.println("From Service one: " + this.hashCode());
  }
}
