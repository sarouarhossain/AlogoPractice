package ditest;

import com.google.inject.AbstractModule;

public class BasicModule extends AbstractModule {
  // Dependency injection configuration
  @Override
  protected void configure() {
    bind(ServiceOne.class).to(ServiceOneImpl.class);
    // bind(ServiceTwo.class).to(ServiceTwoImpl.class);
  }
}
