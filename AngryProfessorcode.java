import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            int t,count=0,rcount=0;
            
            
            int totalstudent;
            
            
            int compulsarystudent;
            
            t=scanner.nextInt();
            
            int[] students=new int[1000];
            for(int i=0;i<t;i++)
            {
               
               totalstudent =scanner.nextInt();
                
                compulsarystudent=scanner.nextInt();
                for(int j=0;j<totalstudent;j++)
                {
                    students[j]=scanner.nextInt();
                    if(students[j]<=0)
                    {
                        count++;
                    }
                    
                }
               
              if(count >= compulsarystudent)
                {
                    System.out.println("NO");
                   count=0;
                }
                else{
                    System.out.println("YES");
                     
                     count=0;
                }

            }
              

        
    }
}
