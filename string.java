import java.util.Scanner;
public class ExpansionOfString {
public String printfreq(String s) {
StringBuilder str = new StringBuilder();
int count_occ = 1;
char let;
for (int i = 0; i &lt; s.length(); i += 2) {
let = s.charAt(i);
count_occ = Character.getNumericValue(s.charAt(i + 1));
for (int j = 0; j &lt; count_occ; j++) {
str.append(let);
}
}
String result = str.toString();
return result;
}
public static void main(String[] args) {
ExpansionOfString Exp = new ExpansionOfString();
Scanner scan = new Scanner(System.in);
System.out.print(&quot;Enter the string: &quot;);
String str = scan.nextLine();
String output = Exp.printfreq(str);
System.out.println(&quot;Output: &quot; + output);
scan.close();
}
}
