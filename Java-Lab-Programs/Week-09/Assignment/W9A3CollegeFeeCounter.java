import java.util.*;
interface BusUser {double TRANSPORT_FEE=12000;}
abstract class StudentFee {String name;StudentFee(String n){name=n;}abstract double tuitionAndOtherFees();double totalFee(){return tuitionAndOtherFees()+(this instanceof BusUser?BusUser.TRANSPORT_FEE:0);}}
class DayScholar extends StudentFee implements BusUser {DayScholar(String n){super(n);}double tuitionAndOtherFees(){return 40000;}}
class Hosteller extends StudentFee {Hosteller(String n){super(n);}double tuitionAndOtherFees(){return 40000+60000;}}
class Scholar extends StudentFee implements BusUser {Scholar(String n){super(n);}double tuitionAndOtherFees(){return 20000;}}
public class W9A3CollegeFeeCounter {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next(),name=sc.next();StudentFee s;switch(type){case "DAY_SCHOLAR":s=new DayScholar(name);break;case "HOSTELLER":s=new Hosteller(name);break;case "SCHOLAR":s=new Scholar(name);break;default:throw new IllegalArgumentException(type);}double fee=s.totalFee();total+=fee;System.out.printf(Locale.US,"%s: %.2f%n",name,fee);}System.out.printf(Locale.US,"Total Collected: %.2f%n",total);}}
