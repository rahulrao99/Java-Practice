import java.util.*;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the size of array:");
        int n =sc.nextInt();
        int []arr=new int [n];
        
        System.out.println("Enter array elements:");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        System.out.println("Enter the target value:");
        int target=sc.nextInt();
        int fIndex=-1, lIndex=-1;
        boolean found=false;
        
        for(int i=0;i<n;i++){
            if(arr[i]==target){
                if(!found){
                    fIndex=i;
                    lIndex=i;
                    found=true;
                }else{
                    lIndex=i;
                }
            }
        }
        if(found==false){
            System.out.println("the element does not exist in the array");
        }else{
            System.out.println("First Index= " + fIndex + "Last Index=" + lIndex);
        }
    }
}
