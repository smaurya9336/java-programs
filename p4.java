public class p4 {
    static int b=20;//static variable
    int c=30;//instance variable
    public static void main(String[] args) {
        int a=10;//local variable
        System.out.println("The Value of a is:--"+a);
        System.out.println("The Value of b is:--"+p4.b);
        p4 obj=new p4();
        System.out.println("The Value of c is:--"+obj.c);
    }
}
