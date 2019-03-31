import java.io.*;
import java.util.*;
class shivam
{
    static String pattern,text;
    static int plen,tlen;
    static int min,pop,change;
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test>0)
        {
            StringTokenizer str=new StringTokenizer(br.readLine());
            text=str.nextToken();
            text=text.toUpperCase();
            pattern=str.nextToken();
            pattern=pattern.toUpperCase();
            tlen=text.length();
            plen=pattern.length();
            String temp="";
            pop=0;
            min=tlen+1;
            change=0;
            char ch5=pattern.charAt(0);
            for(int i=0;i<tlen;i++)
            {
                change=0;
                char ch4=text.charAt(i);
                int p=1;
                if((ch5==ch4))
                {
                    for(int j=i+1;(j<tlen)&&(p<plen);j++)
                    {
                        char ch6=text.charAt(j);
                        char ch7=pattern.charAt(p);
                        if(ch6==ch7)
                        p++;
                        else
                        change++;
                    }
                }
                if((p==(plen))&&(change<min))
                min=change;
            }
            if(min==tlen+1)
            System.out.println("NO");
            else
            System.out.println("YES "+min);
            test--;
        }
    }    

}