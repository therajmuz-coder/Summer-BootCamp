import java.util.*;

public class FindVowel {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        char[] arr=new char[m];
        for(int i=0;i<m;i++)
        {
            arr[i]=sc.next().charAt(0);
        }
        for(int i=0;i<m;i++)
        {
            if(arr[i]=='a' || arr[i]=='e' || arr[i]=='i' || arr[i]=='o' || arr[i]=='u' || arr[i]=='A' || arr[i]=='E' || arr[i]=='I' || arr[i]=='O' || arr[i]=='U')
            {
                System.out.print(arr[i]+" ");
            }
        }
    }
    
}
