import java.util.Scanner;

/**
 * GFG
 */
public class GFG {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=84;
        // int a[][]=new int[n][n];
        int b[]=new int[n];
        for (int i = 0; i < n; i++) {
            b[i]=sc.nextInt();
        }
        
        int greater=0;
        for(int i=0;i<n;i++){
           
               if(greater<b[i])
               greater=b[i];
               System.out.println(i+" "+greater);
           
        }
        System.out.println(greater);
        sc.close();
    
    }
}