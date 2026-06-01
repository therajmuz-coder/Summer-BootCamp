import java.util.*;
public class DiffLastFirst {
    public static void main(String[] args)
    {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int[] arr=new int[n];
      int sum=0;
      for(int i=0;i<n;i++)
      {
        arr[i]=sc.nextInt();
      }
      sum=arr[0]-arr[n-1];
      System.out.println(sum);

    }
    
}
