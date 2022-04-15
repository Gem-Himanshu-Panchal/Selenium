import org.testng.annotations.Test;
public class Main {

    @Test(groups = {"Himu"})
    public void func1()
    {
        System.out.println("Function 1 is running");
    }
    @Test(groups={"Himanshu","Him"})
    public void func2()
    {
        System.out.println("Function 2 is running");
    }
    @Test(groups={"Him"})
    public void func3()
    {
        System.out.println("3rd Function");
    }


}