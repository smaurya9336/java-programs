import java.util.*;
public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int button = sc.nextInt();
        switch (button){
            case 1:System.out.println("Hello");
            break;
            case 2:System.out.println("Namaste"); 
            break;
            case 3:System.out.println("JAY Shree Ram"); 
            break;
            default:System.out.println("invalid button");
            break;
        }
        
    }
    
}


