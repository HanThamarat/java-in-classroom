public class Main
{
    public static void main(String[] args) {
        int a=37,b=30;
        Findsum(a,b);
        Findsum(a,b,50);
        Findsum(39,40,50,25);
    }
    
    public static void Findsum(int x,int y){
        int a = x+y;
        System.out.println("total 2 value = "+a);
    }
    
    public static void Findsum(int x,int y,int z){
        int a = x+y+z;
        System.out.println("total 3 value= "+a);
    }
    
    public static void Findsum(int w,int x,int y,int z){
        int a = w+x+y+z;
        System.out.println("total 4 value= "+a);
    }
}
