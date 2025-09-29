import java.util.Scanner;


public class Main
{
  public static void main(String[] args)
  {
    Scanner sc = new Scanner(System.in);
   System.out.println("Output: \n" + lastFirstN("cream", "butter", 3));
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: 0 <= n <= min(s1.length(), s2.length()
  */
  public static String lastFirstN(String s1, String s2, int n)
  {
    String sub1 = new String();
    sub1 = s1.substring(s1.length() - n, s1.length());
    String sub2 = new String();
    sub2 = s2.substring(0, n);
    String fin = new String(sub1 + sub2);

    return fin;
  }

  /** Precondition: s1 and s2 are not null
  */
  public static void stringManip(String s1, String s2)
  {
  
  }

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    String output = null;
    return output;
  }
}
