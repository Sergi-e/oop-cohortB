import java.util.Scanner;
public class Average{
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("enter four numbers of your choice");
        int num1=scan.nextInt();
        int num2=scan.nextInt();
        int num3=scan.nextInt();
        int num4=scan.nextInt();
        int av=(num1+num2+num3+num4)/4;
        System.out.println("The average of the numbers is" + av);

    }
}