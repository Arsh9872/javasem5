package Sem5;

import java.util.*;
public class MooreVoting 
{
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        n=sc.nextInt();
        int []arr=new int[n];
        int count=0;
        for(int i=0;i<n;i++)
        arr[i]=sc.nextInt();
        int x=arr[0];
     for(int i=0;i<n;i++)
     {
         if(count==0)
         {
             x=arr[i];
             count=1;
         }
         else if(x==arr[i])
         count++;
         else
         count--;
     }

    
    System.out.println(x);
}}