public class W8P4ExaminationGrader {
    static abstract class Question { double points; Question(double p){points=p;} abstract double grade(String correct,String answer); }
    static class MCQ extends Question { MCQ(double p){super(p);} double grade(String c,String a){return c.equals(a)?points:0;} }
    static class TF extends Question { TF(double p){super(p);} double grade(String c,String a){return c.equals(a)?points:0;} }
    static class Essay extends Question {
        Essay(double p){super(p);}
        double grade(String c,String a){
            int found=0; String low=a.toLowerCase();
            for(String k:c.split(",")) if(low.contains(k.trim().toLowerCase())) found++;
            return found>=2?points*.75:found==1?points*.50:0;
        }
    }
    public static void main(String[] args) {
        Question q=new Essay(20);
        System.out.printf("ESSAY: %.2f%n",q.grade("Inheritance, Polymorphism, Encapsulation","Polymorphism is one."));
    }
}
