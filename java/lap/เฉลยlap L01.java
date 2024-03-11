public class Main
{
    public static void main(String[] args) {
        int g=FindGrade(60);
        System.out.println("Grade = "+g);
    }
    
    public static int FindGrade(int a){
        if(a<50) return 0;
        else if(a<60) return 1;
        else if(a<70) return 2;
        else if(a<80) return 3;
        else return 4;
    }
}
