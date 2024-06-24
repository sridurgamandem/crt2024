Write a program to check whether the person is eligible to donate blood. Age must be 18 or above. Weight must be 45 or above. Hemoglobin must be 5.5 or above.

Input Format

First input consists of age Second Input consists of weight Third Input consists of hemoglobin level.

Constraints

1<=n<=10^7

Output Format

Eligible then display He or She can donate blood Not eligible then display He or She unable to donate blood

Sample Input 0

15
44
5.4
Sample Output 0

He or She unable to donate blood
Submissions: 266
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
        int x=s.nextInt();
9
        int y=s.nextInt();
10
        float z=s.nextFloat();
11
      if(x>=18 && y>=45 && z>=5.5)
12
      {
13
          System.out.println("He or She can donate blood");
14
      }
15
        else
16
        {
17
            System.out.println("He or She unable to donate blood");
18
        }
19
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
20
    }
21
}
