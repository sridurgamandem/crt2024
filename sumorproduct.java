Accept two integer values from the user and return their product. If the product is greater than 1000, then return their sum

Input Format

Line 1: 1st Number value Line 2: 2nd Number value

Constraints

1<=num1<=10^7 1<=num2,=10^7

Output Format

Line 1: Result of the operation

Sample Input 0

10
20
Sample Output 0

200
Sample Input 1

40
30
Sample Output 1

70
Sample Input 2

50
20
Sample Output 2

1000
Sample Input 3

100
200
Sample Output 3

300
Submissions: 600
Max Score: 0
Difficulty: Medium
Rate This Challenge:

    
More
 
x*y
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
        int x=s.nextInt();
9
        int y=s.nextInt();
10
        double r=(x*y);
11
        if(r>1000)
12
        {
13
            System.out.printf("%d",x+y);
14
        }
15
        else
16
        {
17
           System.out.printf("%d",x*y);
18
        }
19
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
20
    }
21
}
