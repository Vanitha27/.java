import java.util.Scanner;
public class Palindrome {
public static boolean isPalindrome(String str) {
int left = 0;
int right = str.length() - 1;
while (left &lt; right) {
char leftChar = str.charAt(left);
char rightChar = str.charAt(right);
if (!Character.isLetterOrDigit(leftChar)) {
left++;
continue;
}
if (!Character.isLetterOrDigit(rightChar)) {
right--;
continue;
}
if (Character.toLowerCase(leftChar) != Character.toLowerCase(rightChar)) {
return false;
}
left++;
right--;
}
return true;
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a string: &quot;);
String input = scanner.nextLine();

scanner.close();
if (isPalindrome(input)) {
System.out.println(&quot;True.&quot;);
} else {
System.out.println(&quot;False.&quot;);
}
}
}
