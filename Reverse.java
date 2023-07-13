package reverse;
import java.util.Scanner;
public class Reverse {
    public static void main(String[] args) {
       
        Scanner sc=new Scanner(System.in);
        System.out.println("Read a number :");
        int num=sc.nextInt();
        int rem=0,r;
        while(num!=0){
            r=num%10;
            rem=rem*10+r;
            num=num/10;
        }
        System.out.println(rem);
    }
    }
    

