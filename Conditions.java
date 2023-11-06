import java.util.*;

public class Conditions{
    public static void main(String args[]){
    Scanner sc=new Scanner(System.in);
    System.out.println("Enter your age:");
    int age=sc.nextInt();

    if(age>=18){
        System.out.println("You are valid voter");
    }
    else {
        System.out.println("Not Adult");
    } 
  }
}