import java.io.*;;
import java.util.*;
class sahil_samose_wala
{
    public static void main(String args[])throws IOException
    {
        BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
        String str1="",str2="";
        StringTokenizer in1=new StringTokenizer(str1=br.readLine());
        StringTokenizer in2=new StringTokenizer(str2=br.readLine());
        System.out.println(str1+"\n"+str2);
        int ass=Integer.parseInt(in1.nextToken());
        int stu=Integer.parseInt(in1.nextToken());
        int page[]=new int[ass];
        int sum=0;
        for(int i=0;i<ass;i++)
        {
            page[i]=Integer.parseInt(in2.nextToken());
            sum+=page[i];
        }
        for(int i=0;i<ass-1;i++)
        {
            int min=i;
            for(int j=i+1;j<ass;j++)
            {
                if(page[min]>page[j])
                {
                    min=j;
                }
            }
            int temp=page[min];
            page[min]=page[i];
            page[i]=temp;
        }
        if(stu>=ass)
        {
            System.out.println(page[ass-1]);
        }

        else if(stu==1)
        {
            System.out.println(sum);
        }
        
        else
        {
            int student[]=new int[stu];
            for(int i=0;i<stu;i++)
            student[i]=0;
            ass--;
            int min=0;
            while(ass>=0)
            {
                student[min]+=page[ass];
                ass--;
                for(int i=0;i<stu;i++)
                {
                    if(student[min]>student[i])
                    min=i;
                }
            }
            int max=0;
            for(int i=0;i<stu;i++)
            {
                if(max<student[i])
                {
                    max=student[i];
                }
            }
            System.out.println(max);
        } 
    }
}
