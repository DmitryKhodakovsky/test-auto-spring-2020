package lesson04.dp;

import lesson04.dp.singelton.Singleton;
import org.testng.annotations.Test;

public class Singleton1Test {

    @Test
    public void testName1() {
        Singleton.getInstance().setValue("val");
        System.out.println(Singleton.getInstance().getValue());
    }

    @Test
    public void testName2() {
        System.out.println(Singleton.getInstance().getValue());
        Singleton.getInstance().setValue("lav");
        System.out.println(Singleton.getInstance().getValue());
    }

    @Test
    public void testName3() {
        System.out.println(Singleton.getInstance().getValue());
        Singleton.getInstance().setValue("aseeeea");
        System.out.println(Singleton.getInstance().getValue());
    }

    @Test
    public void testName4() {
        System.out.println(Singleton.getInstance().getValue());
        Singleton.getInstance().setValue("val");
        System.out.println(Singleton.getInstance().getValue());
    }
}
