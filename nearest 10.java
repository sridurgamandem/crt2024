Write a program to return the nearest 10 multiple of any given number

Input Format

Read a number

Constraints

1<=n<=10^7

Output Format

Print nearest 10 multiple no

Sample Input 0

18
Sample Output 0

20
Sample Input 1

134
Sample Output 1

130
Sample Input 2

155
Sample Output 2

160
Submissions: 551
Max Score: 0
Difficulty: Medium
Rate This Challenge:

    
More
 
;
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
        int a=s.nextInt();
9
        int n=a%10;
10
        int h=10-n;
11
        if(h<=5)
12
        {
13
            System.out.printf("%d",a+h);
14
        }
15
        else
16
        {
17
            System.out.printf("%d",a-n);
18
        }
19
        
20
        
21
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
22
    }
23
}
