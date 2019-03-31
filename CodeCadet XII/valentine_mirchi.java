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
    }
}