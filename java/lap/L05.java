public class Main//class1 
{
    public static void main(String[] args) { //mathod/function    function Main ทำงานเป็นตัวแรก runได้ด้วยตัวมันเอง
        Student x=new Student();
        x.getDAta("Thana","Information Technology",2.00);
        x.result();
    }
}

class Student{ //class2
    private static String name , depart;
    private static double gpa;
    void getDAta(String n1 ,String n2 ,double n3){ //function/mathod ที่ใช้ชื่อเดียวกับclass   constuctor
         //System.out.println("Hello constuctor");
        name=n1; 
        depart=n2;
        gpa=n3;
    }
    
    void result(){ //mathod/function
        //double com = b*0.1;
        System.out.println("Name : "+name);
        System.out.println("Department : "+depart);
        System.out.println("GPA : "+gpa);
        if(gpa<2.00){
            System.out.println("Fail");
        }
        else{
            System.out.println("Pass");
        }
    }
}
