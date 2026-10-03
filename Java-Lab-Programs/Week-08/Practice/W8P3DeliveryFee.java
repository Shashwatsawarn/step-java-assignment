import java.util.*;
public class W8P3DeliveryFee {
    static abstract class Delivery { double w,d; String type; Delivery(double w,double d,String t){this.w=w;this.d=d;type=t;} abstract double fee(); }
    static class Standard extends Delivery { Standard(double w,double d){super(w,d,"STANDARD");} double fee(){return 5+.5*w+.1*d;} }
    static class Express extends Delivery { Express(double w,double d){super(w,d,"EXPRESS");} double fee(){return 15+w+.2*d;} }
    static class International extends Delivery { double c; International(double w,double d,double c){super(w,d,"INTERNATIONAL");this.c=c;} double fee(){return 25+2*w+.5*d+c;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in); int n=sc.nextInt(); double total=0;
        for(int i=0;i<n;i++){String t=sc.next(); double w=sc.nextDouble(),d=sc.nextDouble(); Delivery x;
            if(t.equals("STANDARD")) x=new Standard(w,d);
            else if(t.equals("EXPRESS")) x=new Express(w,d);
            else x=new International(w,d,sc.nextDouble());
            double f=x.fee(); total+=f; System.out.printf("%s: %.2f%n",x.type,f);
        } System.out.printf("Total: %.2f%n",total);
    }
}
