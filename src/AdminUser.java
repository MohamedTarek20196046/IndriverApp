public class AdminUser {
    int counter=1;
    public void VerifyDrivers(UserManger m)
    {
        for(int i=counter;i<m.DriverCount;i++)
        {
            if(m.data.Drivers.get(i).contains("approved"))
            {
                System.out.println("this Driver is already approved");

            }
            else
            {
                m.data.Drivers.get(i).add("approved");
                counter++;
            }
        }
    }
}