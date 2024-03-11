public class jj
{
        public static void main (String[] args) {
            test m=new test(123,56);
            m.F_max();              //แสดงMaximum = 56
            m.F_min();
            m.F_sum();
    }
}

class test
{
    static int n1,n2; /*static int x,y;*/
    
    test(int x , int y){//contructor test(int a , int b){
    /*    if(x>y)
        x=a;
        else
        x=b;*/
        
        n1=x;
        n2=y;
    }
    
    public static void F_max()
    {
        /*System.out.println("Maximum = "+x);*/
        
        if(n1>n2)
        System.out.println("Maximum = "+n1);
        else
        System.out.println("Maximum = "+n2);
    }
    
        public static void F_min()
    {
            System.out.println("------------------");
            if(n1<n2)
        System.out.println("Min = "+n1);
        else
        System.out.println("Min = "+n2);
    }
        
         public static void F_sum()
    {
            System.out.println("------------------");
            System.out.println("Sum = "+(n1+n2));
    }
}