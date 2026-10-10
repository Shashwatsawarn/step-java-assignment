import java.util.*;
abstract class Connection {double units;Connection(double u){units=u;}abstract double bill();}
class HomeConnection extends Connection {HomeConnection(double u){super(u);}double bill(){return Math.min(100,units)*5+Math.max(0,units-100)*7;}}
class ShopConnection extends Connection {ShopConnection(double u){super(u);}double bill(){return units*8+100;}}
class FactoryConnection extends Connection {FactoryConnection(double u){super(u);}double bill(){return Math.max(1000,units*6);}}
public class W9P4ElectricityConnectionBilling {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next();double units=sc.nextDouble();Connection c;switch(type){case "HOME":c=new HomeConnection(units);break;case "SHOP":c=new ShopConnection(units);break;case "FACTORY":c=new FactoryConnection(units);break;default:throw new IllegalArgumentException(type);}double bill=c.bill();total+=bill;System.out.printf(Locale.US,"%s: %.2f%n",type,bill);}System.out.printf(Locale.US,"Total: %.2f%n",total);}}
