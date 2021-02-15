/* 
Q).Problem Statement Link: https://www.hackerrank.com/challenges/phone-book/problem
*/


import java.util.*;
import java.io.*;

class Solution
{
   public static void main(String []argh)
    {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt(); 
        scan.nextLine();
        
        HashMap<String, Integer> phonebook = new HashMap<>();
        for(int i=0;i<n;i++)              
        {
            String name = scan.nextLine();
            int phone = scan.nextInt();
            phonebook.put(name, phone);
            scan.nextLine();
        }
      
        while(scan.hasNext())               
        {
            String key = scan.nextLine();
            if(phonebook.containsKey(key))          
                System.out.println(key + "=" + phonebook.get(key));
            else
                System.out.println("Not found");
        }
    }
}
