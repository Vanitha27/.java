public class TextJustification {
public static void main(String[] args) {
String text = &quot;Zoho_Corp_Madurai&quot;;
int desiredLength = 25;
String justifiedText = justifyText(text, desiredLength);
System.out.println(&quot;Input: &quot; + text);
System.out.println(&quot;Output: &quot; + justifiedText);
}
private static String justifyText(String text, int desiredLength) {
String[] words = text.split(&quot;_&quot;);
int numberOfSpaces = words.length - 1;
int totalSpacesToAdd = desiredLength - text.length();
if (numberOfSpaces == 0) {
return text;
}
int spacesToAddPerWord = totalSpacesToAdd / numberOfSpaces;
int extraSpaces = totalSpacesToAdd % numberOfSpaces;
StringBuilder justifiedText = new StringBuilder(words[0]);
for (int i = 1; i &lt; words.length; i++) {
for (int j = 0; j &lt; spacesToAddPerWord; j++) {
justifiedText.append(&#39; &#39;);
}
if (extraSpaces &gt; 0) {
justifiedText.append(&#39; &#39;);
extraSpaces--;
}
justifiedText.append(words[i]);
}
return justifiedText.toString();
}

}
