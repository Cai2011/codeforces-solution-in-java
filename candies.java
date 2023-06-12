import java.util.Scanner;
public class candies {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int can[] = new int[n];
            int e =0;
            int o =0;
            for(int i =0; i<n; i++){
                can[i] = sc.nextInt();
                if(can[i] % 2==0){
                    e+=can[i];
                }
                else{
                    o+=can[i];
                }
            }
            if(e>o){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
