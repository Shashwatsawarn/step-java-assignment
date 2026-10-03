import java.time.*;
import java.util.*;
public class W8P2LibraryDueDate {
    static abstract class LibraryItem {
        String title; LibraryItem(String t){title=t;} abstract int days();
        LocalDate due(){return LocalDate.of(2023,10,26).plusDays(days());}
    }
    static class Book extends LibraryItem { Book(String t){super(t);} int days(){return 14;} }
    static class DVD extends LibraryItem { DVD(String t){super(t);} int days(){return 7;} }
    static class Magazine extends LibraryItem { Magazine(String t){super(t);} int days(){return 3;} }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in); int n=Integer.parseInt(sc.nextLine());
        for(int i=0;i<n;i++){
            String line=sc.nextLine(); int sp=line.indexOf(' ');
            String type=line.substring(0,sp), title=line.substring(sp+1).replace("\"","");
            LibraryItem x=type.equals("BOOK")?new Book(title):type.equals("DVD")?new DVD(title):new Magazine(title);
            System.out.println(x.title+": "+x.due());
        }
    }
}
