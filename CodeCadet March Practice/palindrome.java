import java.io.*;
import java.util.*;
import java.math.*;
class palindrome
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        BigInteger modu=new BigInteger("1000000007");;
        while(test>0)
        {
            int n=Integer.parseInt(br.readLine());
            
            BigInteger zero=new BigInteger("0");
            BigInteger two=new BigInteger("2");
            BigInteger one=new BigInteger("1");
            BigInteger ts=new BigInteger("26");
            BigInteger tf=new BigInteger("25");
            BigInteger power=new BigInteger("0");
            power=ts.pow((int)(n/2));
            power=power.subtract(one);
            power=power.multiply(ts);
            power=power.divide(tf);
            power=power.multiply(two);
            //BigInteger value=(2*((26*(Math.pow(26,n/2)-1))/25);
            if(n%2==0)
            {
                power=power.mod(modu);
                if(n>1)
                System.out.println(power);
                else
                System.out.println("0");
                
            }
            else
            {
                BigInteger temp=new BigInteger("0");
                temp=ts.pow((int)((n/2)+1));
                power=power.add(temp);
                power=power.mod(modu);
                System.out.println(power);
            }
            test--;
            
        }
    }
}
    
    