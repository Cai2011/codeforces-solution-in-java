
import java.util.Scanner;
public class Again {
    public static void main(String [] args){
      int  y, i = 0;
      String z = "";
      Scanner s = new Scanner(System.in);
      
      
      int x = s.nextInt();
      double sc = Math.pow(5, x);
      int pow = (int)sc;

      while(i < 2)
      {
          y = pow % 10;
          y = y/10;
          z = y + "" +z;
          x = pow / 10;
          i++;
      }
     if(x == 2){
      System.out.println(25);
     }
     else{
      System.out.println(z);
     }
  }

      
        
       
        
    }

