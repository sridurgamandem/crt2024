Mr.Kumar went to purchase stationary items for his office. He asked the shopkeeper for a discount. The shopkeeper said that if he purchases more than 200 quantity of the item, then a discount of 20% can be applied on the total bill amount, excluding the GST. Get the Quantity and price per item as an input and calculate and tell whether Mr.Kumar is eligible for the discount and what would be the net amount he has to pay after the discount. Take the GST at 18%. Net Amount = Total bill amount after discount + GST

Input Format

Enter quantity Enter price per unit

Constraints

1<=n<=10^7

Output Format

Print the output

Sample Input 0

100
5
Sample Output 0

Quantity Ordered 100
Price per item is Rs.5
Total Amount = Rs.500
GST - Rs.90.0
Net Amount Payable is Rs.590.0
Sample Input 1

350
20
Sample Output 1

Quantity Ordered 350
Price per item is Rs.20
Total Amount = Rs.7000
Discount Earned = Rs.1400.0
Amount after Discount - Rs.5600.0
GST - Rs.1008.0
Net Amount Payable is Rs.6608.0
import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int q=s.nextInt();
        int p=s.nextInt();
       
        System.out.printf("Quantity Ordered %d\n",q);
        System.out.printf("Price per item is Rs.%d\n",p);
        if(q>100)
        {
              int t=q*p;
                 int d=t*20/100;
                 int af=t-d;
                 int g=af*18/100;
                 int n=af+g;
         System.out.printf("Total Amount = Rs.%d\n",t);
        System.out.printf("Discount Earned =Rs.%.1f\n",d);
        System.out.printf("Amount after Discount - Rs%.1f\n",af);
        System.out.printf("GST Rs%.1f\n",g);
        System.out.printf("Net Amount Payable is Rs%.1f\n",n);
             
             
               
        } 
            else
            {
               
             int t=q*p;
        float d=t%20;
        float af=t-d;
        float g=(float)(0.18)*af;
        float n=af+g;
                System.out.printf("Total Amount = Rs.%d\n",t);
        System.out.printf("GST - Rs.%.1f\n",g);
        System.out.printf("Net Amount Payable is Rs.%.1f\n",n);
            
            
       
            }
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    
}
}
