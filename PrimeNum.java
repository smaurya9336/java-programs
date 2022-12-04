import java.util.*;
public class PrimeNum {
    public static void main(String args[]){
       int num,temp=0,i;
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter a number:--");
       num=sc.nextInt();
       for(i=2;i<=num-1;i++){
        if(num%i==0){
            temp=temp+1;
        }
       }
       if(temp==0){
        System.out.print(num+" is a prime number");
    }
    else{
       System.out.print(num+" not a prime number");
    }
    
    }}
