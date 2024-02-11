import java.util.Scanner;
public class StringCompression {
public static String compress(String input) {

StringBuilder compressedString = new StringBuilder();
int count = 1;
for (int i = 0; i &lt; input.length(); i++) {
char currentChar = input.charAt(i);
if (i + 1 &lt; input.length() &amp;&amp; input.charAt(i + 1) == currentChar) {
count++;
} else {
compressedString.append(currentChar);
compressedString.append(count);
count = 1;
}
}
return compressedString.toString();
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter the string: &quot;);
String input = scanner.nextLine();
scanner.close();
String compressed = compress(input);
System.out.println(&quot;Compressed string: &quot; + compressed);
}
}
