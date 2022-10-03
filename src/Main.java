import java.util.Scanner;
public class Main {
    public static void main(String[] args)
    {
        double measurement = 0;
        double miles = 0;
        double feet = 0;
        double inches = 0;
        String trash = "";

        Scanner in = new Scanner(System.in);

        System.out.print("Enter your measurement to convert");
        if(in.hasNextDouble())
        {
            measurement = in.nextDouble();
            in.nextLine();
        }
        else
        {
            trash = in.nextLine();
            System.out.println("/n You said your measurement was " + trash);
            System.out.println("Run the program again and enter a valid amount");
            System.exit(0);
        }
        miles = measurement / 1609;
        feet = measurement * 3.281;
        inches = measurement * 39.37;
        System.out.println("Your measurement converted to miles is " + miles + " miles");
        System.out.println("Your measurement converted to feet is " + feet + " feet");
        System.out.println("Your measurement converted to inches is " + inches + " inches");
    }
}