package com.mycompany.assignment04_2;
import java.util.Stack;

public class Assignment04_2 {

    public static void main(String[] args) 
    {
        Stack<String> myStack1 = new Stack();
        Stack<String> myStack2 = new Stack();
        String name1 = "madam";
        for(int i=0; i<name1.length();i++)
        {
            myStack1.push(name1.substring(i, i+1));
        }
        for(int i=name1.length(); i>0;i--)
        {
            myStack2.push(name1.substring(i-1, i));
        }
        
        int flag =0;
        
        for(int i=0; i<name1.length();i++)
        {
            if(myStack1.peek().equals(myStack2.peek()))
            {
                myStack1.pop();
                myStack2.pop();
            }
            else
            {
                flag = 1;
            }
        }
        if(flag==1)
        {
            System.out.println("The word " + name1 + " is NOT a palindrome!");
        }
        else 
        {
            System.out.println("The word " + name1 + " IS a palindrome!");
        }
    }
}
