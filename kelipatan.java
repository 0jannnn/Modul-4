/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasipl;

/**
 *
 * @author Ojan
 */
import java.io.*;
public class kelipatan {
{
    public static int findSum(int n, int a, int b)
    {
        int sum = 0;
        for (int i = 0; i < n; i++)
 
            // If i is a multiple of a or b
            if (i % a == 0 || i % b == 0)
                sum += i;
 
        return sum;
    }
    public static void main(String[] args)
    {
        int n = 1000, a = 3, b = 5;
        System.out.println(findSum(n, a, b));
    }
}
}  


   


    