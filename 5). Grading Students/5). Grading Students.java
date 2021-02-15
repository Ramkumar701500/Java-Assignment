Q).Problem Statement Link: https://www.hackerrank.com/challenges/grading/problem

import java.util.*;

public class Solution 
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in); 
        int n = scan.nextInt();
        int grades[] = new int[n];
        
        for(int i=0; i<n; i++)  
        {  
            grades[i]=scan.nextInt();  
        }   
            
        
        List<Integer> ans = new ArrayList<Integer>();       
        
        for(int marks:grades)
        {
            if(marks < 38 || marks % 5 <= 2)
            {
                ans.add(marks);
            }
        
            else if(marks % 5 > 2)
            {
                int add = 5 -(marks % 5);
                ans.add(marks + add);
            }
        
        }   
        
        for(int marks:ans) 
        {
            System.out.println(marks);
        }    
        
    }
}
