/* 
Q).Problem Statement Link: https://www.hackerrank.com/challenges/electronics-shop/problem
*/


import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int budget = scan.nextInt();
        int keyboards = scan.nextInt();
        int drives = scan.nextInt();
        
        int keyboardArray[] = new int[keyboards];
        for(int i=0; i<keyboards; i++)  
        {  
            keyboardArray[i]=scan.nextInt();  
        } 
        
        int driveArray[] = new int[drives];
        for(int i=0; i<drives; i++)  
        {  
            driveArray[i]=scan.nextInt();  
        } 
        
        Cost c = new Cost();
        c.totalCost(budget,keyboardArray,driveArray);
    }    
}

class Cost
{
    public void totalCost(int budget, int keyboardArray[], int driveArray[])
    {
        int max = 0;
        for(int i = keyboardArray.length-1; i >= 0; i--)
        {
            int sum = 0;
            for(int j = driveArray.length-1; j >= 0; j--)
            {
                sum = keyboardArray[i]+driveArray[j];
                if(sum > max && sum <= budget)
                    max = sum;
            }
        }
        if(max == 0)
            System.out.println(-1);
        else
            System.out.println(max);
    }
}

