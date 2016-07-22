import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

/**
 * Created by matthewtduffin on 21/07/2016.
 */
public class Method {

  public static void main(String args[]) {

    System.out.print(fibonacci(2)+",");
    System.out.print(fibonacci(3)+",");
    System.out.print(fibonacci(4)+",");
    System.out.print(fibonacci(5)+",");
    System.out.print(fibonacci(6)+",");
    System.out.print(fibonacci(7)+",");
    System.out.println(fibonacci(8));
    System.out.println();
    System.out.println(reverseString("backwards"));
    System.out.println();
    System.out.println(isPalindrome("asdfghjkllkjhgfdsa"));


  }

  public static String reverseString(String s) {
    if (s==null) {
      return null;
    } else if (s .length() < 2) {
      return s;
    }

    String currentLastLetter = ""+s.charAt(s.length()-1);
    String nextString = s.substring(0,s.length()-1);

    return currentLastLetter + reverseString(nextString);

  }

  public static int fibonacci(int n) {

    if (n==-1 || n==0) {
      return 0;
    } else if (n==1) {
      return 1;
    }

    return fibonacci(n-2) + fibonacci(n-1);

  }

  public static boolean isPalindrome(String s, int i) {

    if (s == null) {
      return false;
    } else if (s.length() < 2) {
      return true;
    }

    if (i > s.length() / 2) {
      return true;
    }

    String s1 = s.substring(i, i+1);
    String s2 = s.substring(s.length() - i - 1, s.length() - i);

    if (s1.equals(s2)) {
      return isPalindrome(s, i + 1);
    } else {
      return false;
    }


  }

  public static boolean isPalindrome(String s) {
    return  isPalindrome(s,0);
  }



}
