Though there have been more successful pirates, Blackbeard is one of the best-known and widely-feared of his time. He commanded four ships and had a pirate army of 300 at the height of his career and defeated the famous warship, HMS “Scarborough” in sea-battle. He was known for barreling into battle clutching two swords with several knives and pistols at the ready. He captured over forty merchant ships in the Caribbean and without flinching killed many prisoners. Now, Blackbeard and his three pirates found a treasure of gold coins. Long Ben too joined them. They decided to share the treasure. Blackbeard agreed to give x% share for Long Ben. He then decided to take y% share from the remaining treasure. His other pirates will share the remaining gold coins equally. Write a program to compute their share's.

Input Format

Input consists of 3 integers. The first input corresponds to the number of gold coins in the treasure. The second input corresponds to Ben's share percentage and the last input is Blackbeard's share percentage.

Constraints

1<=n<=10^7

Output Format

The output consists of three integers. The first output integer corresponds to Long Ben's share. The second integer corresponds to Blackbeard's share. The last integer corresponds to other pirates share.

Sample Input 0

729
65
87
Sample Output 0

473
222
11
Submissions: 206
Max Score: 20
Difficulty: Medium
Rate This Challenge:

    
More
 
ear
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
        int c=s.nextInt();
11
        int longben=a*b/100;
12
        a=a-longben;
13
        int blackbeard=a*c/100;
14
        a=a-blackbeard;
15
        int other=a/3;
16
        System.out.printf("%d\n%d\n%d",longben,blackbeard,other);
17
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
18
    }
19
}
