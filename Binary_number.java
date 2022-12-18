//program to print binary of a number

import java.util.Scanner;
public class Binary_number{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number: ");
        int bin = sc.nextInt();

        String bi="", c="", rev="";

        //calculate reversed binary
        while(bin!=0){

            if(bin%2==0){
                bi= bi+"0";
            }else{
                bi = bi+"1";
            }
            bin/=2;
        }

        if(bi.length()<6){
            for(int i = 1;i<=6-bi.length();i++){
                c+="0";
            }
        }

        bi+=c;
        //reverse the reversed binary
        for(int i = bi.length(); i>=1; i--){
            rev+=bi.charAt(i-1);
        }

        //printing the binary
        System.out.println(rev);
    }
}