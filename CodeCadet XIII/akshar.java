import java.io.*;
import java.util.*;
class akshar
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str = (br.readLine());
        int len=str.length();
        str=str+" ";
        String inal="";
        for(int i=0;i<len;i++)
        {
            if(str.charAt(i)==str.charAt(i+1))
            i++;
            else
            inal+=str.charAt(i);
        }
        System.out.println(inal);
    }
}