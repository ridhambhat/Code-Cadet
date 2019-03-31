import java.io.*;;
import java.util.*;
class zulmi_neha
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer str=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        int test[]=new int[1000001];
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str.nextToken());
        }
        int query=Integer.parseInt(br.readLine());
        for(int m=0;m<query;m++)
        {
            for(int i=0;i<1000001;i++)
            { 
                test[i]=0;
            }
            int distinct=0;
            StringTokenizer pair=new StringTokenizer(br.readLine());
            int i=Integer.parseInt(pair.nextToken());
            int j=Integer.parseInt(pair.nextToken());
            for(int ss=i-1;ss<j;ss++)
            {
                if(test[arr[ss]]==0)
                {
                    test[arr[ss]]=1;
                    distinct++;
                }
            }
            System.out.println(distinct);
        }
    }
}