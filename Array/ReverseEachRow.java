import java.util.*;
public class ReverseEachRow {
     public static void main(String[] args)
     {
        Scanner sc =new Scanner(System.in);
        int m=sc.nextInt();
        int[][] arr=new int[m][m];
        for(int i=0;i<m;i++)
        {
            for(int j=0;j<m;j++)

             {
                arr[i][j]=sc.nextInt();
             }
          
       }
       for(int i = 0; i < arr.length; i++) {
            int start = 0;
            int end = arr[i].length - 1;

            while(start < end)
                 {
                int temp = arr[i][start];
                arr[i][start] = arr[i][end];
                arr[i][end] = temp;

                start++;
                end--;
            }
        }
        System.out.println("Reversed Each Row:");
        for(int i = 0; i < arr.length; i++)
             {
            for(int j = 0; j < arr[i].length; j++) 
                {
                System.out.print(arr[i][j] + " ");
                }
            System.out.println();
            }

        }
    
}