public class Main
{
    public static void main(String[] args) {
        double a=FindAverage(10,21);
        System.out.println("Average = "+a);
    }
    
    public static float FindAverage(int a,int b){//หรือ(float a,float b)
        float x=(float)(a+b)/2; //x=(a+b)/2; casting บังคับให้เปลี่ยนเป็นชนิดตัวแปรที่ต้องการเช่น int เปลี่ยนเป็น float
        return x;
    }
}
