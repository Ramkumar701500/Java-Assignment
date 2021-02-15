Q).Problem Statement Link: https://www.hackerrank.com/challenges/bon-appetit/problem

import java.io.*;
import java.util.*;

public class Solution 
{

    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int k = scan.nextInt();
        int total = 0;
        
        int billArray[] = new int[n];
        for(int i=0; i<n; i++)  
        {  
            billArray[i]=scan.nextInt();  
        } 
        
        int charged = scan.nextInt();
        
        Bill b = new Bill();
        b.bonAppetit(n,k,total,billArray,charged);
    }    
}

class Bill
{
    public void bonAppetit(int n,int k,int total,int bill[],int charged)
    {
        for(int i = 0; i < n; i++) 
        {
            if (i != k) 
                total = total + bill[i];  
        }
        
        if(total/2==charged)
            System.out.println("Bon Appetit");
        else
            System.out.println(charged - (total/2));    
    }
}
