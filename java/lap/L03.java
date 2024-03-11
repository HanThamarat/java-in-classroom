public class Main//class1 
{
    public static void main(String[] args) { //mathod/function    function Main ทำงานเป็นตัวแรก runได้ด้วยตัวมันเอง
        Value x=new Value(10,20,15);
        x.result();
    }
}

class Value{ //class2
    public static int a,b,c;
    Value(int n1 ,int n2 ,int n3){ //function/mathod ที่ใช้ชื่อเดียวกับclass   constuctor
         //System.out.println("Hello constuctor");
        a=n1; 
        b=n2;
        c=n3;
    }
    
    public static void result(){ //mathod/function
        int x=a*b*c;
        System.out.println("width : "+a);
        System.out.println("length : "+b);
        System.out.println("depth : "+c);
        System.out.println("Value = "+x);
    }
}
