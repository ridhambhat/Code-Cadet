import java.io.*;
import java.util.*;
class number
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer str=new StringTokenizer(br.readLine());
        int a[]=new int[n];
        for(int i=0;i<n;i++)
        a[i]=Integer.parseInt(str.nextToken());
        int max=0;
        int temp=1;
        for(int i=0;i<n;i++)
        {         
            int r=a[i];
            temp=1;
            int tempi=i-1;
            while((tempi>=0)&&((a[tempi]==r-1)||(a[tempi]==r)))
            {
                temp++;
                tempi--;
            }
            tempi=i+1;
            while((tempi<n)&&((a[tempi]==r-1)||(a[tempi]==r)))
            {
                temp++;
                tempi++;
            }
            if(max<temp)
            {
                max=temp;
            }
            tempi=i-1;
            temp=1;
            while((tempi>=0)&&((a[tempi]==r)||(a[tempi]==r+1)))
            {
                temp++;
                tempi--;
            }
            tempi=i+1;
            while((tempi<n)&&((a[tempi]==r)||(a[tempi]==r+1)))
            {
                temp++;
                tempi++;
            }
            if(max<temp)
            {
                max=temp;
            }
        }
        System.out.println(max);
    }
    
}
