import java.io.*;
class repeat
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str=br.readLine();
        str=str.trim();
        int len=str.length();
        long n=Long.parseLong(br.readLine());
        long left=(n%len);
        int count1=0;
        int count2=0;
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)=='a')
            {
                count1++;
                if(i<left)
                count2++;
            }
        }
        System.out.println((long)(count1*(long)(n/len))+count2);
    }
}