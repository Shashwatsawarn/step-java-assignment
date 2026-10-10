import java.util.*;
interface SaverMode {double SAVER_FACTOR=0.75;}
abstract class Appliance {double hours;Appliance(double h){hours=h;}abstract double watts();double units(boolean saver){double u=watts()*hours/1000;return saver?u*SaverMode.SAVER_FACTOR:u;}}
class Fridge extends Appliance {Fridge(double h){super(h);}double watts(){return 150;}}
class AirConditioner extends Appliance implements SaverMode {AirConditioner(double h){super(h);}double watts(){return 1500;}}
class Television extends Appliance {Television(double h){super(h);}double watts(){return 100;}}
class Washer extends Appliance implements SaverMode {Washer(double h){super(h);}double watts(){return 500;}}
public class W9A5HomeApplianceEnergyReport {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=Integer.parseInt(sc.nextLine().trim());double total=0;for(int i=0;i<n;i++){String[] parts=sc.nextLine().trim().split("\s+");String type=parts[0];double hours=Double.parseDouble(parts[1]);boolean saver=parts.length>2&&parts[2].equals("SAVER");Appliance a;switch(type){case "FRIDGE":a=new Fridge(hours);break;case "AC":a=new AirConditioner(hours);break;case "TV":a=new Television(hours);break;case "WASHER":a=new Washer(hours);break;default:throw new IllegalArgumentException(type);}if(saver&&!(a instanceof SaverMode)){System.out.println(type+": saver mode not supported");continue;}double units=a.units(saver),cost=units*8;total+=cost;System.out.printf(Locale.US,"%s: Units=%.2f Cost=%.2f%n",type,units,cost);}System.out.printf(Locale.US,"Total Cost: %.2f%n",total);}}
