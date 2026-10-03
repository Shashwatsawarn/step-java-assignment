import java.util.*;
public class W8P5TransportFare {
    static abstract class Transport { double d; String type; Transport(double d,String t){this.d=d;type=t;} abstract double fare(); }
    static class Bus extends Transport { Bus(double d){super(d,"BUS");} double fare(){return Math.min(10,2+.1*d);} }
    static class Train extends Transport { Train(double d){super(d,"TRAIN");} double fare(){return 3+.15*d;} }
    static class Metro extends Transport { double factor; Metro(double d,double f){super(d,"METRO");factor=f;} double fare(){return (1.5+.2*d)*factor;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++){String t=sc.next();double d=sc.nextDouble();Transport x;
            if(t.equals("BUS")) x=new Bus(d); else if(t.equals("TRAIN")) x=new Train(d); else x=new Metro(d,sc.nextDouble());
            double f=x.fare();total+=f;System.out.printf("%s: %.2f%n",x.type,f);
        } System.out.printf("Total: %.2f%n",total);
    }
}
