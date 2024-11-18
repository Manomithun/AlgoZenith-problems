/*Given a number 
N
N. Determine whether 
N
N is power of 2 or not.

Input Format
Only one line contains a number 
N
N.

Output Format
Print "
YES
YES" if 
N
N is power of 2 otherwise, print "
NO
NO".*/

import java.util.Scanner;
class Main{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        Long n=sc.nextLong();
        if (n > 0 && (n & (n - 1)) == 0) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }
}