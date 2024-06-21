Write a program to get a float value from the user and display it in the below-mentioned format. HINT: Use ceil() and floor() functions.

Input Format

Input consists of one float value.

Constraints

1<=n<10^7

Output Format

Output consists of one integer, its highest round off value and its lowest round off value.

Sample Input 0

54.5
Sample Output 0

54
55.0
54.0
Submissions: 245
Max Score: 20
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
       float a=s.nextFloat();
9
        System.out.printf("%d\n",(int)a);
10
        System.out.printf("%.1f\n",(float)Math.ceil(a));
11
        System.out.printf("%.1f\n",(float)Math.floor(a));
12
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
13
    }
14
}
