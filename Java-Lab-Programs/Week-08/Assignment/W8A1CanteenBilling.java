import java.util.*;
public class W8A1CanteenBilling {
    static abstract class Customer { double amount; String type; Customer(double a,String t){amount=a;type=t;} abstract double bill(); }
    static class Student extends Customer { Student(double a){super(a,"STUDENT");} double bill(){return amount*.90;} }
    static class Staff extends Customer { Staff(double a){super(a,"STAFF");} double bill(){return amount*.95;} }
    static class Guest extends Customer { Guest(double a){super(a,"GUEST");} double bill(){return amount+10;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;
        for(int i=0;i<n;i++){String t=sc.next();double a=sc.nextDouble();Customer c=t.equals("STUDENT")?new Student(a):t.equals("STAFF")?new Staff(a):new Guest(a);
            double b=c.bill();total+=b;System.out.printf("%s: %.2f%n",c.type,b);}
        System.out.printf("Total: %.2f%n",total);
    }
}
