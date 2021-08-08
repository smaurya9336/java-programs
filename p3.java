public class p3 {
    static int a=20;//static variable
    void fun(){
    int b=10;//instance variable
    System.out.println(a + " "+ b);
    a++;
    b++;
    }
    
    public static void main(String[] args) {
        p3 obj=new p3();
        obj.fun();
        obj.fun();
        obj.fun();
    }
}
