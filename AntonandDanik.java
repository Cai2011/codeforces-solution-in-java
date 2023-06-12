import java.util.Scanner;


public class AntonandDanik {
    public static void main(String[] args){
        Scanner nah = new Scanner(System.in);
        int n = nah.nextInt();
       String s = nah.next();
       int d=0;
       int a=0;
       for(int l =0; l<n; l++){
        char ch = s.charAt(l);
        if(ch == 'D'){
            d++;
       }
       else if(ch =='A'){
        a++;
       }

    }
    if(d>a){
        System.out.println("Danik");
    }
    else if(a>d){
        System.out.println("Anton");
    }
    else if(a==d){
        System.out.println("Friendship");
    }
}
}
