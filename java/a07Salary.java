import java.text.*;
public class Main1 {
    public static void main(String[] args) {
        double salary ,ot , bonus;
        salary = 20000; ot=2300; bonus=300.65;
        Func_Salary(salary,ot);
        Func_Salary(salary,ot,bonus);
    }   
    
    public static void Func_Salary (double s,double o) {
        NumberFormat f=NumberFormat.getNumberInstance();
        f.setMaximumFractionDigits(2);
        System.out.println("---------------------");
        System.out.println("Salary = "+f.format(s));
        System.out.println("OverTime = "+f.format(o));
        
        double tax = s*0.10, sum= ((s+o)-tax) ;
        
        System.out.println("ภาษี = "+f.format(tax));   
        System.out.println("Total = "+f.format(sum));        
    }
    
       public static void Func_Salary (double s,double o,double b) {
        NumberFormat f=NumberFormat.getNumberInstance();
        f.setMaximumFractionDigits(2);
        System.out.println("---------------------");
        System.out.println("Salary = "+f.format(s));
        System.out.println("OverTime = "+f.format(o));
        System.out.println("Bonus = "+f.format(b));
        
        double tax = s*0.10, sum= ((s+o)-tax)+b ;
        
        System.out.println("ภาษี = "+f.format(tax));   
        System.out.println("Total = "+f.format(sum));        
    }
} 