import java.util.*;
class Main {
    public static void main(String[] args) {
 
    Scanner sc=new Scanner(System.in);
    int num=sc.nextInt();
    int a=0;
    int b=1;
    if(num<=0)
    System.out.println("Number cannot be negative::");
    
    if(num==0)
    System.out.println(a);
    if(num==1)
    System.out.println(b);
    int c=0;
    for(int i=2;i<=num;i++){
        c=a+b;
        a=b;
        b=c;
    }
   System.out.println(c);
    }
}
