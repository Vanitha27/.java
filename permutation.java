import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class Permutation {
public static List&lt;String&gt; permutationsWithoutRepetition(String s) {
List&lt;String&gt; permutations = new ArrayList&lt;&gt;();
backtrack(s.toCharArray(), new boolean[s.length()], new StringBuilder(), permutations);
return permutations;
}
private static void backtrack(char[] chars, boolean[] used, StringBuilder current, List&lt;String&gt;
permutations) {
if (current.length() == chars.length) {
permutations.add(current.toString());
return;
}
for (int i = 0; i &lt; chars.length; i++) {
if (!used[i]) {
used[i] = true;
current.append(chars[i]);
backtrack(chars, used, current, permutations);
current.deleteCharAt(current.length() - 1);
used[i] = false;

}
}
}
public static void main(String[] args) {
Scanner scan = new Scanner(System.in);
System.out.print(&quot;Enter the string: &quot;);
String inputString = scan.nextLine();
List&lt;String&gt; result = permutationsWithoutRepetition(inputString);
for (String permutation : result) {
System.out.println(permutation);
}
}
}
