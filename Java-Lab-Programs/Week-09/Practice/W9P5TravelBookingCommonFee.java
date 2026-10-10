import java.util.*;
abstract class TravelBooking {double distance;static final double BOOKING_FEE=50;TravelBooking(double d){distance=d;}abstract double fare();double total(){return fare()+BOOKING_FEE;}}
class BusBooking extends TravelBooking {BusBooking(double d){super(d);}double fare(){return 2*distance;}}
class TrainBooking extends TravelBooking {TrainBooking(double d){super(d);}double fare(){return 1.5*distance;}}
class FlightBooking extends TravelBooking {FlightBooking(double d){super(d);}double fare(){return 2500+4*distance;}}
public class W9P5TravelBookingCommonFee {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();for(int i=0;i<n;i++){String type=sc.next();double d=sc.nextDouble();TravelBooking b;switch(type){case "BUS":b=new BusBooking(d);break;case "TRAIN":b=new TrainBooking(d);break;case "FLIGHT":b=new FlightBooking(d);break;default:throw new IllegalArgumentException(type);}System.out.printf(Locale.US,"%s: %.2f%n",type,b.total());}}}
