import java.time.*;
import java.util.*;
public class W8A5StreamingRenewal {
    static abstract class Plan { String name; LocalDate start; Plan(String n,String d){name=n;start=LocalDate.parse(d);} abstract int days(); LocalDate renewal(){return start.plusDays(days());} }
    static class Basic extends Plan { Basic(String n,String d){super(n,d);} int days(){return 30;} }
    static class Standard extends Plan { Standard(String n,String d){super(n,d);} int days(){return 90;} }
    static class Premium extends Plan { Premium(String n,String d){super(n,d);} int days(){return 365;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();
        for(int i=0;i<n;i++){String t=sc.next(),name=sc.next(),date=sc.next();Plan p=t.equals("BASIC")?new Basic(name,date):t.equals("STANDARD")?new Standard(name,date):new Premium(name,date);
            System.out.println(p.name+": "+p.renewal());}
    }
}
