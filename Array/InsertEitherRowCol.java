import java.util.*;
public class InsertEitherRowCol {
  public static void main(String[] args)
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
      System.out.println("Array before Update");
      for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
            System.out.print(arr[i][j]+" ");
          }
        System.out.println();
        }
        int newRows=n+1;
        int newCols=m+1;
        int[][] newArr=new int[newRows][newCols];
        for(int i=0;i<n;i++)
        {
          for(int j=0;j<m;j++)
          {
            newArr[i][j]=arr[i][j];
          }
        }
        System.out.println("Enter the row or column to be inserted");
        for(int i=0;i<newRows;i++)
        {
          for(int j=0;j<newCols;j++)
          {
            if(i>=n || j>=m)
            {
              newArr[i][j]=sc.nextInt();
            }
          }
        }
        System.out.println("Array after Update");
        for(int i=0;i<newRows;i++)
        {
          for(int j=0;j<newCols;j++)
          {
            System.out.print(newArr[i][j]+" ");
          }
        System.out.println();
        }
    }
  }
