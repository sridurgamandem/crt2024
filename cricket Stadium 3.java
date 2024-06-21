There was a large ground in center of the city which is rectangular in shape. The Corporation decides to build a Cricket stadium in the area for school and college students, But the area was used as a car parking zone. In order to protect the land from using as an unauthorized parking zone , the corporation wanted to protect the stadium by building a fence. In order to help the workers to build a fence, they planned to place a thick rope around the ground. They wanted to buy only the exact length of the rope that is needed. They also wanted to cover the entire ground with a carpet during rainy season. They wanted to buy only the exact quantity of carpet that is needed. They requested your help. Can you please help them by writing a program to find the exact length of the rope and the exact quantity of carpet that is required?

Input Format

Input consists of 2 integers. The first integer corresponds to the length of the ground and the second integer corresponds to the breadth of the ground.

Constraints

1<=n<=10^7

Output Format

Output Consists of two integers. The first integer corresponds to the perimeter. The second integer corresponds to the quantity of carpet required.

Sample Input 0

50
20
Sample Output 0

140
1000
Submissions: 240
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
        int a=s.nextInt();
9
        int b=s.nextInt();
10
        int l=2*(a+b);
11
        int br=(a*b);
12
        System.out.printf("%d\n%d\n",l,br);
13
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
14
    }
15
}
