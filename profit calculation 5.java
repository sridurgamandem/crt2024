Each Sunday, a newspaper agency sells x copies of a certain newspaper for Rs.a per copy. The cost to the agency of each newspaper is Rs.b. The agency pays a fixed cost for storage, delivery and so on of Rs.100 per Sunday. The newspaper agency wants to calculate the profit obtained on Sundays. Can you please help them out by writing a program to compute the profit given x, a and b.

Input Format

Input consists of 3 integers --- x, a and b. X is the number of copies sold, a is the cost per copy and b is the cost the agency spends per copy

Constraints

1<=no of copies<=10**9 1<=cost of copy<=10**9 1<=cost of agency<=10**9

Output Format

Refer Sample Input and Output for exact formatting specifications

Sample Input 0

1000
2
1
Sample Output 0

900
Submissions: 261
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More
 
f
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
        int a=s.nextInt();
10
        int b=s.nextInt();
11
        int r=(x*a)-(x*b)-100;
12
        System.out.printf("%d",r);
13
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
14
    }
15
}
