import java.util.Scanner;

public class pattern1 {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i  = 1;
        int j = 1;
        int k = n;
        int minus = 1;
        if(n%2==0){
            minus = 2;
        }
       
        while(i<=n){
            int end;
            if(j<n){
               end = j*n;
               j = j+2;
            }else
            {
                if(k>0){
                    end = k*n;
                    k = k-minus;
                    minus = minus + 1;
                }
                else{
                    break;
                }
            } 
            int start = (end - n)+1;
            
            while(start<=end){
                System.out.print(start+" ");
                start++;
            }
            System.out.println();
            i++;
        }
    }
    
}
