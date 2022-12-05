import java.util.Scanner;
public class maxmin {
static void swap(int a,int b, int arr[]){
    int temp=a;
    a=b;
    b=temp;
}
public static void main(String args[]){
    int arr[] = new int[20];
    System.out.println("enter the array size");
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    if(n==0){
        System.out.println("Array is empty");
    }
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    int min=arr[0];
    int max=arr[0];
    for(int i=0;i<n;i++){
        if(arr[i]<min)
            min=arr[i];
        else if(arr[i]>max)
            max=arr[i];
    }

    System.out.println("Min= "+min+"\nMax= "+max);

}
}
