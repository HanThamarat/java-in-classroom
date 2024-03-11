public class Main 
{
    public static void main(String[] args) 
    {
        test a=new test(10,30);
        a.total();
    }
}

class test
{
    static int x,y;
    test(int a ,int b){//contructor
        x=a; y=b;
    }
    public static void total()
    {
        //int sum=a+b;
        System.out.println("Value = "+(x+y)/*sum*/);
    }
}