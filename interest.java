Alice wanted to start a business and she was looking for a venture capitalist. Through her friend Bob, she met the owner of a construction company who is interested to invest in an emerging business. Looking at the business proposal, the owner was very much impressed with Alice's work. So he decided to invest in Alice's business and hence gave a green signal to go ahead with the project. Alice bought Rs.X for a period of Y years from the owner at R% interest per annum. Find the rate of interest and the total amount to be given by Alice to the owner. The owner impressed by proper repayment of the financed amount decides to give a special offer of 2% discount on the total interest at the end of the settlement. Find the amount given back by Alice and also find the total amount. (Note: All rupee values should be in two decimal points).

Input Format

Input consists of 3 integers. The first integer corresponds to the principal amount borrowed by Alice. The second integer corresponds to the rate of interest The third integer corresponds to the number of years.

Constraints

1<=n<=10^7

Output Format

The output consists of 4 floating point values. The first value corresponds to the interest. The second corresponds to the amount. The third value corresponds to the discount. The last value corresponds to the final settlement. All floating point values are to be rounded off to two decimal places

Sample Input 0

100
1
10
Sample Output 0

10.00
110.00
0.20
109.80
Sample Input 1

10000
10
5
Sample Output 1

5000.00
15000.00
100.00
14900.00
Submissions: 783
Max Score: 0
Difficulty: Medium
Rate This Challenge:

    
More
 
1
import java.io.*;
2
import java.util.*;
3
​
4
public class Solution {
5
​
6
    public static void main(String[] args) {
7
        Scanner s=new Scanner(System.in);
8
        int a,r,n;
9
        a=s.nextInt();
10
        r=s.nextInt();
11
        n=s.nextInt();
12
        double r1=(float)a*r*n/100;
13
        System.out.printf("%.2f\n",r1);
14
        double r2=(float)a+r1;
15
        System.out.printf("%.2f\n",r2);
16
        double r3=(float)r1*2/100;
17
        System.out.printf("%.2f\n",r3);
18
        double r4=(float)r2-r3;
19
        System.out.printf("%.2f\n",r4);
20
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
21
    }
22
}
