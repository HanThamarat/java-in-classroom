public class Main
{
    public static void main(String[] args) {
        int g=FindGrade(60);
        System.out.println("Grade = "+g);
    }
    
    public static int FindGrade(int a){
        int g;
        if(a<50){
             g=0;
        }
        else if(a<60){
             g=1;
        }
        else if(a<70){
             g=2;
        }
        else if(a<80){
             g=3;
        }
        else{
             g=4;
        }
        return g;
    }
}
