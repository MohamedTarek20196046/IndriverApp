import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        UserManger m = new UserManger();
        AdminUser a = new AdminUser();
        RideManger rm = new RideManger();
        List<User> UserList = new ArrayList<User>(3);
        User U = null;
        List<Driver> DriverList = new ArrayList<Driver>(3);
        Driver D = null;
        String Username ,Password,Mobileno,Email;
        int counter=0;
        int temp=0;
        int tempu=0;
        do {
            System.out.println("choose From following functions  ");
            System.out.println("1: Register User");
            System.out.println("2: Register Driver");
            System.out.println("3: User Login");
            System.out.println("4: verify driver");
            System.out.println("5: Driver Login");
            System.out.println("6: User RequestRide");
            System.out.println("7: Driver AddfavoriteAreas");
            System.out.println("8: Driver SetOffer");
            System.out.println("9: exit");
            int k = Integer.parseInt(s.nextLine());
            switch (k) {
                case 1: {
                    System.out.println("Register  User");
                    System.out.println("enter Username");
                    Username = s.nextLine();
                    System.out.println("enter Password");
                    Password = s.nextLine();
                    System.out.println("enter MobileNumber");
                    Mobileno = s.nextLine();
                    System.out.println("enter Email");
                    Email = s.nextLine();
                    U = new User(Username, Password, Mobileno, Email);
                    UserList.add(U);
                    m.RegisterUser(U);
                    System.out.println("//*************************************************//");
                    break;
                }
                case 2: {
                    System.out.println("Register Driver");
                    System.out.println("enter Username");
                    Username = s.nextLine();
                    System.out.println("enter Password");
                    Password = s.nextLine();
                    System.out.println("enter MobileNumber");
                    Mobileno = s.nextLine();
                    System.out.println("enter Email");
                    Email = s.nextLine();
                    System.out.println("enter nationalID");
                    String nationalID = s.nextLine();
                    System.out.println("enter liscense");
                    String liscense = s.nextLine();
                    D = new Driver(Username, Password, Mobileno, Email, nationalID, liscense);
                    DriverList.add(D);
                    m.RegisterDriver(D);
                    System.out.println("//*************************************************//");
                    break;
                }
                case 3: {

                    if(UserList.size()>1)
                    {

                        System.out.println("Plz enter your which User you want to login with");
                        int z = Integer.parseInt(s.nextLine());
                        System.out.println("User login");
                        System.out.println("Plz enter your Username");
                        Username = s.nextLine();
                        System.out.println("Plz enter your Password");
                        Password = s.nextLine();
                        UserList.get(z-1).Login(Username, Password,m);

                    }
                    else
                    {
                        System.out.println("User login");
                        System.out.println("Plz enter your Username");
                        Username = s.nextLine();
                        System.out.println("Plz enter your Password");
                        Password = s.nextLine();
                        UserList.get(0).Login(Username, Password,m);

                    }
                    System.out.println("//*************************************************//");
                    break;
                }
                case 4:
                {
                    a.VerifyDrivers(m);
                    break;
                }
                case 5: {

                    if(DriverList.size()>1)
                    {
                        System.out.println("Plz enter your which Driver you want to login with");
                        int z = Integer.parseInt(s.nextLine());
                        System.out.println("Driver login");
                        System.out.println("Plz enter your Username");
                        String DUsername = s.nextLine();
                        System.out.println("Plz enter your Password");
                        String DPassword = s.nextLine();
                        DriverList.get(z-1).Login(DUsername, DPassword,m);
                    }
                    else
                    {
                        System.out.println("Driver login");
                        System.out.println("Plz enter your Username");
                        String DUsername = s.nextLine();
                        System.out.println("Plz enter your Password");
                        String DPassword = s.nextLine();
                        DriverList.get(0).Login(DUsername, DPassword,m);
                    }
                    System.out.println("//*************************************************//");
                    break;
                }
                case 6: {
                    int z=0;
                    if(UserList.size() > 1)
                    {
                        System.out.println("Plz enter your which User you want to Request with");
                        z = Integer.parseInt(s.nextLine());
                        tempu = z - 1;
                    }
                    if(UserList.get(tempu).b==true)
                    {
                            System.out.println("Plz enter SourceArea");
                            String sourcearea = s.nextLine();
                            System.out.println("Plz enter Destination");
                            String Destination = s.nextLine();
                            UserList.get(tempu).r.RequestRide(sourcearea, Destination);
                            rm.AddRide(UserList.get(tempu));

                    }
                    else
                    {
                        System.out.println("User must login first");
                    }
                    break;
                }
                case 7: {
                    if(DriverList.size()>1)
                    {
                        System.out.println("please choose which driver you want to add his favorite areas");
                        temp = Integer.parseInt(s.nextLine())-1;
                    }
                    if(DriverList.get(temp).b==true)
                    {

                        System.out.println("enter number of favorite areas");
                        int x = Integer.parseInt(s.nextLine());
                        System.out.println("enter favorite areas");

                        for (int i = 0; i < x; i++) {
                            String Favoritearea = s.nextLine();
                            DriverList.get(temp).AddFavoriteArea(Favoritearea);
                        }


                    }
                    else
                    {
                        System.out.println("Driver must login first");
                    }
                    break;
                }
                case 8: {
                    if(DriverList.size()>1)
                    {
                        System.out.println("please choose which driver you want to set offer");
                        temp = Integer.parseInt(s.nextLine())-1;
                    }
                    if(DriverList.get(temp).b==true)
                    {

                        rm.checkDriverFavoriteAreas(DriverList.get(temp));
                        System.out.println("//*************************************************//");
                        for (int i = counter; i < rm.keys.size(); i++) {
                            System.out.println("Do you want to add an offer to this Ride :" + rm.d.getRide(rm.keys.get(i)));
                            String t = s.nextLine();
                            if (t.equals("yes")) {
                                System.out.println("Please enter the offer");
                                Integer o = Integer.valueOf(s.nextLine());
                                DriverList.get(temp).r.registerObserver(UserList.get(tempu));
                                System.out.println("Ride " + rm.d.getRide(rm.keys.get(i)) + " had an offer");
                                DriverList.get(temp).r.SetOffer(o);
                                DriverList.get(temp).r.Offers.add(o);
                                counter++;
                            } else {
                                continue;
                            }

                        }

                    }
                    else
                    {
                        System.out.println("Driver must login first");
                    }
                    break;
                }
                case 9: {
                    System.exit(0);
                }
            }
        }while(true);

    }


}
