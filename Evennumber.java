
package evennumber;
public class Evennumber {
    public static void main(String[] args) {
        System.out.println("even number 1 to 50 :");
        int i=1;
        do{
            if(i%2==0)
            {
                System.out.println(i);
            }
            i++;
        }
      while(i<=50);
    }
    
}
