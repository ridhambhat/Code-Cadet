import java.io.*;
import java.util.*;
class chetan
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            StringTokenizer st=new StringTokenizer(br.readLine());
            arr[i]=Integer.parseInt(st.nextToken());
            arr[i]+=Integer.parseInt(st.nextToken());
        }
        long s=Long.parseLong(br.readLine());
        long count=0;
        boolean rs=false;
        if(s==0)
        {
            count=n;
            rs=true;
        }
        for(int i=0;i<n;i++)
        {
            int p1=arr[i];
            for(int j=i+1;j<n;j++)
            {
                int p2=arr[j];
                int diff=p1-p2;
                if((diff==s)||((diff*-1)==s))
                {
                    if(rs)count+=2;
                    else count+=1;
                }
            }
        }
        System.out.println(count);    
    }
}