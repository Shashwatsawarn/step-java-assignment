import java.util.*;
public class W8A4FestivalBonus {
    static abstract class Employee { String name; double salary; Employee(String n,double s){name=n;salary=s;} abstract double bonus(); }
    static class FullTime extends Employee { FullTime(String n,double s){super(n,s);} double bonus(){return salary*.10;} }
    static class PartTime extends Employee { PartTime(String n,double s){super(n,s);} double bonus(){return salary*.05;} }
    static class Intern extends Employee { Intern(String n,double s){super(n,s);} double bonus(){return 2000;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;
        for(int i=0;i<n;i++){String t=sc.next(),name=sc.next();double s=sc.nextDouble();Employee e=t.equals("FULLTIME")?new FullTime(name,s):t.equals("PARTTIME")?new PartTime(name,s):new Intern(name,s);
            double b=e.bonus();total+=b;System.out.printf("%s: %.2f%n",e.name,b);}
        System.out.printf("Total Bonus: %.2f%n",total);
    }
}
