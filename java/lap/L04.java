public class Main//class1 
{
    public static void main(String[] args) { //mathod/function    function Main ทำงานเป็นตัวแรก runได้ด้วยตัวมันเอง
        Sale x=new Sale("Thana","Information Technology",1.85);
        x.result();
    }
}

class Sale{ //class2
    public static String a,b;
    public static double c;
    Sale(String n1 ,String n2 ,double n3){ //function/mathod ที่ใช้ชื่อเดียวกับclass   constuctor
         //System.out.println("Hello constuctor");
        a=n1; 
        b=n2;
        c=n3;
    }
    
    public static void result(){ //mathod/function
        //double com = b*0.1;
        System.out.println("Name : "+a);
        System.out.println("Department : "+b);
        System.out.println("GPA : "+c);
        if(c<2.00){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
