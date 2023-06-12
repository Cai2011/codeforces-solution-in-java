import java.util.Scanner;
public class directions {
    public static void main(String[] args){
        Scanner nah = new Scanner(System.in);
        int t= nah.nextInt();
        while(t-->0){
            int n =nah.nextInt();
            String k = nah.next();
            int u =0;
            int r =0;
            
            for(int i =0; i<k.length(); i++){
                char ch = k.charAt(i);
            
                if(ch =='U'){
                    u++;
                }
               else if(ch == 'D'){
                u--;
               }
               else if(ch == 'R'){
                r++;
               }
               else if(ch == 'L'){
                r--;
               }
             if(u ==1 && r== 1){
                break;
             }
           

                
        }
        if(u==1 && r==1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
       
        

            
        }
    }
}

