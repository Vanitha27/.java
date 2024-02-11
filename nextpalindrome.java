import java.util.Scanner;
public class NextPalindrome {
public static int nextPalindrome(int num) {
while (true) {
num++;
if (isPalindrome(num)) {
return num;
}
}
}
private static boolean isPalindrome(int num) {
String strNum = String.valueOf(num);
int left = 0;
int right = strNum.length() - 1;
while (left &lt; right) {
if (strNum.charAt(left) != strNum.charAt(right)) {
return false;
}
left++;
right--;
}
return true;
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print(&quot;Enter the number: &quot;);
int givenNumber = scan.nextInt();

int nextPalin = nextPalindrome(givenNumber);
System.out.println(&quot;Output:&quot; + nextPalin);
}
}
