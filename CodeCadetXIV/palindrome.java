import java.io.*;
class palindrome
{
     public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        int test=Integer.parseInt(br.readLine());
        while(test>0)
        {
            int len=Integer.parseInt(br.readLine());
            len=len;
            String str=br.readLine();
            boolean k=true;
            for(int i=0;(i<(len/2))&&k;i++)
            {
                char ch1=str.charAt(i);
                char ch2=str.charAt(len-1-i);
                int less=ch1-2;
                char le=(char)less;
                int more=ch1+2;
                char mo=(char)more;
                if(ch1==ch2)
                continue;
                else if((less>96)&&(le==ch2))
                continue;
                else if((more<123)&&((mo)==ch2))
                continue;
                else
                k=false;
            }
            if(k)
            System.out.println("YES");
            else
            System.out.println("NO");
            test--;
        }      
    }
}
