import java.util.*;
interface NightService {double NIGHT_MULTIPLIER=1.20;}
abstract class Cab {double km;Cab(double km){this.km=km;}abstract double rate();double dayFare(){return Math.max(100,km*rate());}}
class MiniCab extends Cab {MiniCab(double k){super(k);}double rate(){return 10;}}
class SedanCab extends Cab implements NightService {SedanCab(double k){super(k);}double rate(){return 14;}}
class SUVCab extends Cab implements NightService {SUVCab(double k){super(k);}double rate(){return 18;}}
public class W9A4CityCabFareMeter {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();double km=sc.nextDouble();String time=sc.next();Cab c;switch(type){case "MINI":c=new MiniCab(km);break;case "SEDAN":c=new SedanCab(km);break;case "SUV":c=new SUVCab(km);break;default:throw new IllegalArgumentException(type);}if(time.equals("NIGHT")&&!(c instanceof NightService)){System.out.println(type+": night service not available");continue;}double fare=c.dayFare()*(time.equals("NIGHT")?NightService.NIGHT_MULTIPLIER:1);total+=fare;System.out.printf(Locale.US,"%s: %.2f%n",type,fare);}System.out.printf(Locale.US,"Total: %.2f%n",total);}}
