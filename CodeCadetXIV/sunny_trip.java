import java.io.*;
import java.util.*;
class sunny_trip
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer str=new StringTokenizer(br.readLine());
        int n=Integer.parseInt(str.nextToken());
        int v=Integer.parseInt(str.nextToken());
        int temp=n;
        int cap=0;
        int cost=0;
        if(n>v)
        {
            for(int i=1;(i<n);i++)
            {
                if((n-i)>cap)
                {
                    cost+=(v-cap)*i;
                    cap+=v-cap;
                }
                cap--;
            }
            System.out.println(cost);
        }
        else
        System.out.println(n);
    }
}