import java.io.*;
import java.util.*;
class bhai
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = (br.readLine());
        int len=str.length();
        int n=Integer.parseInt(br.readLine());
        int kn[]=new int[26];
        for(int i=0;i<26;i++)
        {
            kn[i]=0;
        }
        for(int i=0;i<len;i++)
        {
            int ch=str.charAt(i)-97;
            kn[ch]++;
        }
        
        for(int i=0;i<n;i++)
        {
            String s=br.readLine();
            int l=s.length();
            boolean k=true;
            for(int j=0;(j<l)&&k;j++)
            {
                if(kn[s.charAt(j)-97]==0)
                {
                    k=false;
                }
            }
            if(k)
            System.out.println("Yes");
            else
            System.out.println("No");
        }
        
    }
}