Q).Problem Statement Link: https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem

import java.io.*;
import java.util.*;

public class Solution 
{
    
public static void main(String[] args) 
{
    Scanner scan = new Scanner(System.in); 
    int n = scan.nextInt();
    int score[] = new int[n];
        
    for(int i=0; i<n; i++)  
    {  
        score[i]=scan.nextInt();  
    }   
    
    int highest, lowest;
    highest = lowest = score[0];
    int result[] = new int[2];
    
    for(int i=1;i<score.length;i++)
    {
        if (score[i] > highest)
        {
            highest = score[i];
            ++result[0];
        }
        
        else if (score[i] < lowest)
        {
            lowest = score[i];
            ++result[1];
        }
    }
    
    for(int i:result) 
    {
        System.out.print(i+ " ");
    }          
}

}
