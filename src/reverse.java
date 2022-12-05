public class reverse {

 public static void main(String args[]) {
     int arr[] = {1, 2, 3, 4, 5};

     for (int i = 0; i < 2;i++) {
         int temp;
         temp=arr[i];
         arr[i]=arr[4-i];
         arr[4-i]=temp;//swap(arr[i], arr[4 - i]);
     }
     for (int i = 0; i < 5; i++) {
         System.out.println(arr[i]);
     }
 }
}
