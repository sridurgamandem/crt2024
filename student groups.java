Accept total number of participants in class. A group of four divisions has to be created from registered participants. Total no of participants “P” 100>=p<=200 Note: If number of participants entered by user is less than 100 or greater than 200 display “INVALID INPUT” and quit.

Input Format

Take number of students in a class

Constraints

100>=p<=200

Output Format

Print Stidents in group wise

Sample Input 0

104
Sample Output 0

26
26
26
26
Sample Input 1

127
Sample Output 1

31
31
31
34
Sample Input 2

320
Sample Output 2

INVALID INPUT
Sample Input 3

102
Sample Output 3

25
25
25
27
Submissions: 545
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
        int a=s.nextInt();
9
        if(a>=100&&a<=200)
10
        {
11
            System.out.printf("%d\n%d\n%d\n%d\n",a/4,a/4,a/4,a/4+a%4);
12
        }
13
        else
14
        {
15
            System.out.printf("INVALID INPUT");
16
        }
17
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
18
    }
19
}
