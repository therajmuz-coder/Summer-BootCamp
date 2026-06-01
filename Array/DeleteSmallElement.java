import java.util.*;
public class DeleteSmallElement 
{
    public static void main(String[] arg)
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int[][] arr=new int[n][m];
        for(int i=0;i<n;i++)
          {
           for(int j=0;j<m;j++)
            {
             arr[i][j]=sc.nextInt();
            }
          }
        int min=arr[0][0];
        int row=0,col=0;
         for(int i = 0; i < arr.length; i++)
         {
            for(int j = 0; j < arr[i].length; j++)
             {
                if(arr[i][j] < min)
                 {
                    min = arr[i][j];
                    row = i;
                    col = j;
                }
            }
        }
        arr[row][col] = 0;
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
