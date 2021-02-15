Q).Problem Statement Link: https://www.hackerrank.com/challenges/java-exception-handling-try-catch/problem

import java.io.*;
import java.util.*;

public class Solution 
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        try 
        {
        int n1 = scan.nextInt();
        int n2 = scan.nextInt();
        System.out.println(n1/n2);
        }
        
        catch(InputMismatchException ex)
        {
            System.out.println(ex.getClass().getName());
        }
        
        catch(ArithmeticException ex)
        {
            System.out.println(ex);
        }
        scan.close();
    }
}
