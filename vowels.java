import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
public class VowelCount {
public static Map&lt;Character, Integer&gt; countVowels(String str) {
Map&lt;Character, Integer&gt; vowelCountMap = new HashMap&lt;&gt;();
str = str.toLowerCase();
for (char c : str.toCharArray()) {
if (isVowel(c)) {
vowelCountMap.put(c, vowelCountMap.getOrDefault(c, 0) + 1);
}
}
return vowelCountMap;
}
private static boolean isVowel(char c) {
c = Character.toLowerCase(c);
return c == &#39;a&#39; || c == &#39;e&#39; || c == &#39;i&#39; || c == &#39;o&#39; || c == &#39;u&#39;;
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print(&quot;Enter the string: &quot;);
String inputString = scan.nextLine();
Map&lt;Character, Integer&gt; vowelsCountMap = countVowels(inputString);
char[] vowels = {&#39;a&#39;, &#39;e&#39;, &#39;i&#39;, &#39;o&#39;, &#39;u&#39;};
for (char vowel : vowels) {
System.out.println(vowel + &quot;-&quot; + vowelsCountMap.getOrDefault(vowel, 0));

}
}
}
