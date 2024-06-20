Given two numbers, print maximum of two numbers.z

Input Format

A B - Two space separated integers on one line.

Constraints

-1018 <= A, B <= 1018

Output Format

Print maximum of A and B.

Sample Input 0

4 5
Sample Output 0

5
Explanation 0

5 is greater than 4 so, Answer is 5

Submissions: 182
Max Score: 10
Difficulty: Medium
Rate This Challenge:

    
More
 
S
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
        int a,b;
9
        a=s.nextInt();
10
        b=s.nextInt();
11
        int max=Math.max(4,5);
12
        System.out.print(max);
13
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
14
    }
15
}
