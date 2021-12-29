import java.util.Scanner;

public class AdminUser {
    Scanner s = new Scanner(System.in);
    public void VerifyDrivers(UserManger m)
    {
        for(int i=1;i<=m.d.getDrivercount()-1;i++)
        {
            System.out.println((i)+" "+m.d.getDriver(i));
        }
        System.out.println("please choose the driver you want to approve");
        int x=s.nextInt();
        if(m.d.getDriver(x).contains("approved"))
        {
            System.out.println("this Driver is already approved");
        }
        else {
            m.d.getDriver(x).add("approved");
        }
    }
}