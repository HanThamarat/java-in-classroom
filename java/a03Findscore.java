public class Main
{
    public static void main(String[] args) {
        int m=67;
        Findscore(m);
    }
    
    public static void Findscore(int a){
        
        System.out.println("score = "+a);
        
        if(a<50){
            System.out.println("Fail");
        }
        
        else{
            System.out.println("Pass");
        }
    }
}
