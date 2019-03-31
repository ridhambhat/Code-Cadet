import java.io.*;
import java.util.*;
class transpose
{
    public static int arr[][][],m,n;
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer size=new StringTokenizer(br.readLine());
        n=Integer.parseInt(size.nextToken());
        m=Integer.parseInt(size.nextToken());
        arr=new int[2][n][m];
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<n;j++)
            {
                StringTokenizer inp=new StringTokenizer(br.readLine());
                for(int k=0;k<m;k++)
                {
                    arr[i][j][k]=Integer.parseInt(inp.nextToken());
                }
            }
        }
        boolean k=true;
        for(int i=0;(i<n)&&k;i++)
        {
            for(int j=0;(j<m)&&k;j++)
            {
                k=check(i,j,arr[0][i][j]);
            }
        }
        if(k)
        {
            System.out.println("YES");
        }
        else
        {
            System.out.println("NO");
        }
    }
    
    public static boolean check(int a,int b,int r)
    {
        int tempa=a;
        int tempb=b;
        if(arr[1][a][b]==r)
        return true;
        while(((--a)>=0)&&((++b)<n))
        {
            if(arr[1][a][b]==r)
            return true;
        }
        a=tempa;
        b=tempb;
        while(((++a)<m)&&((--b)>=0))
        {
            if(arr[1][a][b]==r)
            return true;
        }
        return false;
    }
}