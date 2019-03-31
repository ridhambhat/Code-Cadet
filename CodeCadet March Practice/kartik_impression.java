import java.io.*;
class kartik_impression
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        long test=Long.parseLong(br.readLine());
        while(test>0)
        {
            long n=Long.parseLong(br.readLine());
            String bin=binary(n);
            int count=0;
            int location=0;
            long len=bin.length();
            while((count<2)&&(location<len))
            {
                char ch=bin.charAt(location);
                location++;
                if((ch-48)==1)count++;
            }
            if(count==0)
            System.out.println("3");
            else if(count==1)
            {
                if(len==1)
                System.out.println("2");
                else
                System.out.println("1");
            }
            else
            {
                String left=bin.substring(location);
                long y=left.length();
                if(y>0)
                {
                    
                    y=(long)(Math.pow(2,y));
                    long le=decimal(left);
                    long a1=y-le;
                    long a2=le-0;
                    System.out.println(Math.min(a1,a2));
                }
                else
                System.out.println("2");
            }
            
            test--;
        }
    }
    
    public static String binary(long n)
    {
        String k="";
        while(n>0)
        {
            char ch=(char)((n%2)+48);
            k=ch+k;
            n=n/2;
        }
        return k;
    }
    
    public static long decimal(String k)
    {
        int len=k.length();
        len--;
        int t=0;
        long fin=0;
        while(len>=0)
        {
            long r=k.charAt(len)-48;
            fin=fin+(long)(r*Math.pow(2,t));
            t++;
            len--;
        }
        return fin;
    }
}
