import java.util.*;

public class Largsmall {
      public static void main(String[] args)
       {
          Scanner sc=new Scanner(System.in);
          int n=sc.nextInt();
          int[] arr=new int[n];
          for(int i=0;i<n;i++)
          {
             arr[i]=sc.nextInt();
          }
         int lar=arr[0];
         int small=arr[0];
         for(int i=0;i<n;i++)
            {
                if(arr[i]>lar)
                {
                    lar=arr[i];
                }
                if(arr[i]<small)
                {
                    small=arr[i];
                }
            } 
            System.out.println("Largest element is: "+lar);
            System.out.println("Smallest element is: "+small);

       }

}