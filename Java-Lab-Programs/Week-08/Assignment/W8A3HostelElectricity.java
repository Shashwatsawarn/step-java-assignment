import java.util.*;
public class W8A3HostelElectricity {
    static abstract class Room { int units; String type; Room(int u,String t){units=u;type=t;} abstract double bill(); }
    static class Single extends Room { Single(int u){super(u,"SINGLE");} double bill(){return units*8.0;} }
    static class Shared extends Room { int people; Shared(int u,int p){super(u,"SHARED");people=p;} double bill(){return units*6.0/people;} }
    static class AC extends Room { AC(int u){super(u,"AC");} double bill(){return units*10.0+200;} }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;
        for(int i=0;i<n;i++){String t=sc.next();int u=sc.nextInt();Room r=t.equals("SINGLE")?new Single(u):t.equals("SHARED")?new Shared(u,sc.nextInt()):new AC(u);
            double b=r.bill();total+=b;System.out.printf("%s: %.2f%n",r.type,b);}
        System.out.printf("Total: %.2f%n",total);
    }
}
