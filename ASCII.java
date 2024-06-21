Write a program to find whether a given character is an uppercase, lowercase, number or symbol. If it is an alphabet find whether it is an Uppercase or Lowercase. If it is a number display Number else display Symbol.

Input Format

Input consists of 1 character

Constraints

1<=ch<=65535

Output Format

Print Upper if upper case letter Print Lower if lower case letter Print Number if number Print Symbol if symbol

Sample Input 0

A
Sample Output 0

Upper
Sample Input 1

d
Sample Output 1

Lower
Sample Input 2

8
Sample Output 2

Number
Sample Input 3

$
Sample Output 3

Symbol
Submissions: 607
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
        char a=s.next().charAt(0);
9
        if(a>=65&&a<=90)
10
            System.out.println("Upper");
11
        else if(a>=97&&a<=122)
12
            System.out.println("Lower");
13
        else if(a>=48&&a<=57)
14
            System.out.println("Number");
15
        else
16
            System.out.println("Symbol");
17
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
18
    }
19
}
