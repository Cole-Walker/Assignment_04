package com.mycompany.assignment04_3;

public class Assignment04_3 
{
    public static void main(String[] args)
    {
        System.out.println(isBalanced());
    }
    
    public static boolean isBalanced()
    {
        String equation = "(((8*8-2) + 9 - (12*5)) - 2)";
        int track = 0;
        
        for (int i = 0; i < equation.length(); i++)
        {
            char myChar = equation.charAt(i);
            
            if (myChar == '(' || myChar == '[' || myChar == '{')
            { 
                track ++;
            }
            
            else
         
            if(myChar == ')'|| myChar == ']' || myChar == '}')
            {
                track --;
            }
        }
        
        if (track == 0)
            { 
                return true;
            }
        
        return false;
    }
}
