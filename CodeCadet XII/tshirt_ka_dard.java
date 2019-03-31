import java.io.*;;
import java.util.*;
class tshirt_ka_dard
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer str=new StringTokenizer(br.readLine());
        int arr[][]=new int[n][2];
        int sum=0;
        for(int i=0;i<n;i++)
        {
            arr[i][0]=Integer.parseInt(str.nextToken());
            arr[i][1]=sum;
            sum=sum+arr[i][0];
        }
        boolean k=true;
        for(int i=0;(i<n)&&(k);i++)
        {
            int right=sum-arr[i][1]-arr[i][0];
            if(arr[i][1]==right)
            {
                System.out.println(i);
                k=false;
            }
        }
        if(k)System.out.println("-1");
    }
}