package testNG;

import org.testng.annotations.Test;

public class sampleTest {
	
  @Test(groups = {"g1"})
  public void a() {
	  System.out.println("123");
  }
  
  @Test(groups = {"g2"})
  public void b() {
	  System.out.println("456");
  }
  
  @Test(groups = {"g1"})
  public void c() {
	  System.out.println("789");
  }
}
