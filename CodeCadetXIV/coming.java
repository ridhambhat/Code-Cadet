import java.io.*;
import java.util.*;
class coming
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test>0)
        {      
            int n=Integer.parseInt(br.readLine());
            int arr[]=new int[n+1];
            arr[0]=1;
            StringTokenizer size=new StringTokenizer(br.readLine());
            for(int i=1;i<=n;i++)
            arr[i]=Integer.parseInt(size.nextToken());
            int day=0;
            int know=1;
            int canknow=0;
            while(know<n)
            {
                canknow=0;
                for(int i=1;i<=know;i++)
                canknow+=arr[i];
                know+=canknow;
                day++;
            }
            System.out.println(day);
            test--;
        }
    }
}