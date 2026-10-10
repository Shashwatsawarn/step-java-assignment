import java.util.*;
interface Insurable {double insurance();}
abstract class Parcel {double weight,value;Parcel(double w,double v){weight=w;value=v;}abstract double charge();}
class StandardParcel extends Parcel {StandardParcel(double w,double v){super(w,v);}double charge(){return 40+10*weight;}}
class ExpressParcel extends Parcel implements Insurable {ExpressParcel(double w,double v){super(w,v);}double charge(){return 80+15*weight;}public double insurance(){return value*0.02;}}
class FragileParcel extends Parcel implements Insurable {FragileParcel(double w,double v){super(w,v);}double charge(){return 40+10*weight+50;}public double insurance(){return value*0.02;}}
public class W9A2ParcelShippingDesk {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double grand=0;for(int i=0;i<n;i++){String type=sc.next();double w=sc.nextDouble(),v=sc.nextDouble();Parcel p;switch(type){case "STANDARD":p=new StandardParcel(w,v);break;case "EXPRESS":p=new ExpressParcel(w,v);break;case "FRAGILE":p=new FragileParcel(w,v);break;default:throw new IllegalArgumentException(type);}double c=p.charge(),ins=p instanceof Insurable?((Insurable)p).insurance():0;grand+=c+ins;System.out.printf(Locale.US,"%s: Charge=%.2f Insurance=%.2f Total=%.2f%n",type,c,ins,c+ins);}System.out.printf(Locale.US,"Grand Total: %.2f%n",grand);}}
