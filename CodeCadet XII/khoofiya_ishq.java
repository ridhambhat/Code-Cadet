import java.io.*;;
import java.util.*;
class khoofiya_ishq
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test>0)
        {
            StringTokenizer input=new StringTokenizer(br.readLine());
            int len=Integer.parseInt(input.nextToken());
            int key=Integer.parseInt(input.nextToken());
            int keya=key,keyd=key;
            while(keya>25)
            {
                keya-=26;
            }
            while(keyd>9)
            {
                keyd-=10;
            }
            String str=br.readLine();
            len=str.length();
            for(int i=0;i<len;i++)
            {
                char ch=str.charAt(i);
                int r=(int)ch;
                if((r>=65)&&(r<=90))
                {
                    r=r+keya;
                    if(r>90)r=r-26;
                    System.out.print((char)r);
                }
                else if((r>=97)&&(r<=122))
                {
                    r=r+keya;
                    if(r>122)r=r-26;
                    System.out.print((char)r);
                }
                else if((r>=48)&&(r<=57))
                {
                    r=r+keyd;
                    if(r>57)r=r-10;
                    System.out.print((char)r);
                }
                else
                {
                    System.out.print((char)r);
                }
            }
            System.out.println();
            test--;
        }
        
    }
}
    