import java.io.*;
import java.math.*;
class birthday_chess
{
    static int arr[][];
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str="";
        while((str=br.readLine())!=null)
        {
            BigInteger in=new BigInteger(str);
            BigInteger t=new BigInteger("2");
            in=in.multiply(t);
            in=in.subtract(t);
            System.out.println(in);
        }
    }
}    
