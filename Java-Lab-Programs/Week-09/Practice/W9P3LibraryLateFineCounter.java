import java.util.*;
abstract class LibraryItem {String title;int days;LibraryItem(String t,int d){title=t;days=d;}abstract double fine();}
class BookItem extends LibraryItem {BookItem(String t,int d){super(t,d);}double fine(){return days*2;}}
class DVDItem extends LibraryItem {DVDItem(String t,int d){super(t,d);}double fine(){return Math.min(50,days*5);}}
class MagazineItem extends LibraryItem {MagazineItem(String t,int d){super(t,d);}double fine(){return days;}}
public class W9P3LibraryLateFineCounter {public static void main(String[] args){Scanner sc=new Scanner(System.in);int n=sc.nextInt();double total=0;for(int i=0;i<n;i++){String type=sc.next(),title=sc.next();int days=sc.nextInt();LibraryItem item;switch(type){case "BOOK":item=new BookItem(title,days);break;case "DVD":item=new DVDItem(title,days);break;case "MAGAZINE":item=new MagazineItem(title,days);break;default:throw new IllegalArgumentException(type);}double fine=item.fine();total+=fine;System.out.printf(Locale.US,"%s: %.2f%n",title,fine);}System.out.printf(Locale.US,"Total Fines: %.2f%n",total);}}
