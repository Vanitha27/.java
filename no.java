import java.util.Scanner;
public class NumberToName {
private static final String[] ones = {&quot;&quot;, &quot;One&quot;, &quot;Two&quot;, &quot;Three&quot;, &quot;Four&quot;, &quot;Five&quot;, &quot;Six&quot;, &quot;Seven&quot;, &quot;Eight&quot;,
&quot;Nine&quot;};
private static final String[] tens = {&quot;&quot;, &quot;&quot;, &quot;Twenty&quot;, &quot;Thirty&quot;, &quot;Forty&quot;, &quot;Fifty&quot;, &quot;Sixty&quot;, &quot;Seventy&quot;,
&quot;Eighty&quot;, &quot;Ninety&quot;};
private static final String[] teens = {&quot;Ten&quot;, &quot;Eleven&quot;, &quot;Twelve&quot;, &quot;Thirteen&quot;, &quot;Fourteen&quot;, &quot;Fifteen&quot;,
&quot;Sixteen&quot;, &quot;Seventeen&quot;, &quot;Eighteen&quot;, &quot;Nineteen&quot;};

public static String numberToName(int number) {
if (number == 0) {
return &quot;Zero&quot;;
}
return convertToWords(number);
}
private static String convertToWords(int number) {
if (number &lt; 10) {
return ones[number];
} else if (number &lt; 20) {
return teens[number - 10];
} else if (number &lt; 100) {
return tens[number / 10] + (number % 10 != 0 ? &quot; &quot; + ones[number % 10] : &quot;&quot;);
} else if (number &lt; 1000) {
return ones[number / 100] + &quot; Hundred&quot; + (number % 100 != 0 ? &quot; &quot; +
convertToWords(number % 100) : &quot;&quot;);
} else if (number &lt; 10000) {
return ones[number / 1000] + &quot; Thousand&quot; + (number % 1000 != 0 ? &quot; &quot; +
convertToWords(number % 1000) : &quot;&quot;);
} else {
return &quot;Number out of range&quot;;
}
}
public static void main(String[] args) {
Scanner scanner = new Scanner(System.in);
System.out.print(&quot;Enter a number: &quot;);
int number = scanner.nextInt();
scanner.close();
String name = numberToName(number);
System.out.println(&quot;Output: &quot; + name);
}
}
