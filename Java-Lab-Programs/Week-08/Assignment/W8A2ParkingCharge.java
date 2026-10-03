import java.util.*;
public class W8A2ParkingCharge {
    static abstract class Vehicle { int h; String type; Vehicle(int h,String t){this.h=h;type=t;} abstract double charge(); }
    static class Bike extends Vehicle { Bike(int h){super(h,"BIKE");} double charge(){return h*10;} }
    static class Car extends Vehicle { Car(int h){super(h,"CAR");} double charge(){return 30+(h-1)*20;} }
    static class Truck extends Vehicle { Truck(int h){super(h,"TRUCK");} double charge(){return Math.max(100,h*50);} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;
        for(int i=0;i<n;i++){String t=sc.next();int h=sc.nextInt();Vehicle v=t.equals("BIKE")?new Bike(h):t.equals("CAR")?new Car(h):new Truck(h);
            double c=v.charge();total+=c;System.out.printf("%s: %.2f%n",v.type,c);}
        System.out.printf("Total: %.2f%n",total);
    }
}
