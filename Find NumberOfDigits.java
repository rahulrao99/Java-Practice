import java.util.*;
public class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("Inputs :");
        int num=sc.nextInt();
        int count=0;
        if(num==0)
        System.out.println(++count);
        while(num!=0){
            num/=10;
            count++;
        }
        System.out.println(count);
    }
}
