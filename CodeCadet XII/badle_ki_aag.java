import java.io.*;;
import java.util.*;
import java.math.*;
class badle_ki_aag
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int n=Integer.parseInt(br.readLine());
        StringTokenizer str=new StringTokenizer(br.readLine());
        int arr[]=new int[n];
        long c=1000000007;
        BigInteger product=new BigInteger("1");
        for(int i=0;i<n;i++)
        {
            arr[i]=Integer.parseInt(str.nextToken());
            product=product.multiply(BigInteger.valueOf(arr[i]));
        }
        for(int i=0;i<n;i++)
        {
            BigInteger k=new BigInteger("1");
            k=product.divide(BigInteger.valueOf(arr[i]));
            k=k.remainder(BigInteger.valueOf(c));
            System.out.print(k+" ");
        }
    }
}