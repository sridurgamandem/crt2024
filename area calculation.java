Sheela has three things in her bag. She wants to compute the area of 3 things but 3 things are in different shapes. The three things are in a square shape, rectangular shape, and circular shape respectively. Write a program to help Sheela to calculate the area of different shapes.

Input Format

First input: a side of a square in integer Second input: length of a rectangle in integer Third input: breadth of a rectangle in integer Fourth input: radius of a circle in float

Constraints

1<=side of square <=10**9 1<=length of rectangle<=10**9 1<=breadth of rectangle<=10**9 1<=radius<=10**9

Output Format

The first output should be the area of a square in integer The second output should be the area of a rectangle in integer The third output should be the area of a circle in float with 2 decimal places

Sample Input 0

5
5
4
2.0    
Sample Output 0

25
20
12.56
Sample Input 1

10
15
15
4.5
Sample Output 1

100
225
63.58
Sample Input 2

2
3
6
5.0
Sample Output 2

4
18
78.50
Submissions: 872
Max Score: 0
Difficulty: Medium
Rate This Challenge:

    
More
 
(float)
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
        int S,l,b;
9
        float r;
10
        S=s.nextInt();
11
        l=s.nextInt();
12
        b=s.nextInt();
13
        r=s.nextFloat();
14
        int r1=S*S;
15
        System.out.println(r1);
16
        int r2=l*b;
17
        System.out.println(r2);
18
        float r3=(float)3.14*r*r;
19
        System.out.printf("%.2f",r3);
20
            
21
        
22
    }
23
}
