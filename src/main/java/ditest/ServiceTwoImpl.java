package ditest;

public class ServiceTwoImpl implements ServiceTwo {
  @Override
  public void test() {
    System.out.println("From Service two: " + this.hashCode());
  }
}
