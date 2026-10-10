import java.util.*;
abstract class Plot { String owner; Plot(String owner){this.owner=owner;} abstract double area(); }
class CirclePlot extends Plot { double r; CirclePlot(String n,double r){super(n);this.r=r;} double area(){return Math.PI*r*r;} }
class RectanglePlot extends Plot { double l,w; RectanglePlot(String n,double l,double w){super(n);this.l=l;this.w=w;} double area(){return l*w;} }
class TrianglePlot extends Plot { double b,h; TrianglePlot(String n,double b,double h){super(n);this.b=b;this.h=h;} double area(){return b*h/2;} }
public class W9P1GardenPlotAreaReport {
 public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next(),name=sc.next();Plot p;switch(type){case "CIRCLE":p=new CirclePlot(name,sc.nextDouble());break;case "RECTANGLE":p=new RectanglePlot(name,sc.nextDouble(),sc.nextDouble());break;case "TRIANGLE":p=new TrianglePlot(name,sc.nextDouble(),sc.nextDouble());break;default:throw new IllegalArgumentException(type);}double a=p.area();System.out.printf(Locale.US,"%s (%s): %.2f%n",name,type,a);total+=a;}System.out.printf(Locale.US,"Total Area: %.2f%n",total);}
}
