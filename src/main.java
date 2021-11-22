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
            System.out.println("1:Register User");
            System.out.println("2:Register Driver");
            System.out.println("3: User Login");
            System.out.println("4: Driver Login");
            System.out.println("5: User RequestRide");
            System.out.println("6: Driver AddfavoriteAreas");
            System.out.println("7: Driver SetOffer");
            System.out.println("8: exit");
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
                    a.VerifyDrivers(m);
                    break;
                }
                case 3: {
                    System.out.println("User login");
                    System.out.println("Plz enter your Username");
                    Username = s.nextLine();
                    System.out.println("Plz enter your Password");
                    Password = s.nextLine();
                    if(UserList.size()>1)
                    {
                        System.out.println("Plz enter your which User you want to login with");
                        int z = Integer.parseInt(s.nextLine());
                        UserList.get(z).Login(Username, Password);
                    }
                    else
                    {
                        UserList.get(0).Login(Username, Password);
                    }
                    System.out.println("//*************************************************//");
                    break;
                }
                case 4: {
                    System.out.println("Driver login");
                    System.out.println("Plz enter your Username");
                    String DUsername = s.nextLine();
                    System.out.println("Plz enter your Password");
                    String DPassword = s.nextLine();
                    if(DriverList.size()>1)
                    {
                        System.out.println("Plz enter your which User you want to login with");
                        int z = Integer.parseInt(s.nextLine());
                        DriverList.get(z).Login(DUsername, DPassword,m);
                    }
                    else
                    {
                        DriverList.get(0).Login(DUsername, DPassword,m);
                    }
                    System.out.println("//*************************************************//");
                    break;
                }
                case 5: {
                    if(UserList.size()>1)
                    {
                        System.out.println("Plz enter your which User you want to Request with");
                        int z = Integer.parseInt(s.nextLine());
                        tempu=z-1;
                        System.out.println("Plz enter SourceArea");
                        String sourcearea = s.nextLine();
                        System.out.println("Plz enter Destination");
                        String Destination = s.nextLine();
                        UserList.get(z-1).r.RequestRide(sourcearea,Destination);
                        rm.AddRide(UserList.get(z-1));
                    }
                    else if(UserList.size()==1)
                    {
                        System.out.println("sourceArea");
                        String sourcearea = s.nextLine();
                        System.out.println("destination");
                        String Destination = s.nextLine();
                        UserList.get(0).r.RequestRide(sourcearea,Destination);
                        rm.AddRide(UserList.get(0));
                    }
                    else
                    {
                        System.out.println("the system has no registered users you can't request ride");
                    }
                    break;
                }
                case 6: {
                    if(DriverList.size()>1)
                    {
                        System.out.println("please choose which driver you want to add his favorite areas");
                        temp = Integer.parseInt(s.nextLine());
                    }

                    System.out.println("enter number of favorite areas");
                    int x = Integer.parseInt(s.nextLine());
                    System.out.println("enter favorite areas");

                    for (int i = 0; i < x; i++) {
                        String Favoritearea = s.nextLine();
                        DriverList.get(temp).AddFavoriteArea(Favoritearea);
                    }

                    break;
                }
                case 7: {
                    rm.checkDriverFavoriteAreas(DriverList.get(temp));
                    System.out.println("//*************************************************//");
                    for (int i = counter; i < rm.keys.size(); i++) {
                        System.out.println("Do you want to add an offer to this Ride :" + rm.data.Rides.get(rm.keys.get(i)));
                        String t = s.nextLine();
                        if (t.equals("yes")) {
                            System.out.println("Please enter the offer");
                            Integer o = Integer.valueOf(s.nextLine());
                            DriverList.get(temp).p.registerObserver(UserList.get(tempu));
                            System.out.println("Ride " + rm.data.Rides.get(rm.keys.get(i)) + " had an offer");
                            DriverList.get(temp).p.SetOffer(o);
                            DriverList.get(temp).r.Offers.add(o);
                            counter++;
                        } else {
                            continue;
                        }

                    }
                    break;
                }
                case 8: {
                    System.exit(0);
                }
            }
        }while(true);

    }


}
