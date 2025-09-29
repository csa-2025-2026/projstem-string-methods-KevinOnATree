import java.util.Scanner;


public class Main
{
  public static void main(String[] args)
  {
  Scanner sc = new Scanner(System.in);
    System.out.println("Sample inputs: ");
    String str1 = sc.nextLine();
    String str2 = sc.nextLine();
    int num = sc.nextInt();

    sc.nextLine(); // scanner buffer

    System.out.println("Output: \n" + lastFirstN(str1,str2,num));
    System.out.println("Input: ");
  
    String str3 = sc.nextLine(); 
    String str4 = sc.nextLine();

   stringManip(str3, str4);
   System.out.println("Removed Input: ");
    String str5 = sc.nextLine(); 
     System.out.println("Za Removed Input: ");
    String str6 = sc.nextLine();
  System.out.println("Removed Output: ");
   System.out.println(removeStr(str5, str6));
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
  String fin1 = new String(s1.toUpperCase());
  String sub3 = s2.substring(0,1);
  String sub4 = s2.substring(1,s2.length());
  String fsub3 = sub3.toUpperCase();
  String fin2 = new String(fsub3 + sub4);
  System.out.println("toUpperCase Full Output: \n" + fin1);
  System.out.println("First toUpperCase Output: \n" + fin2);
  return;
  }  

  /** Precondition: s1 and s2 are not null
  * Precondition: s2 is a substring of s1 and can be found at least one time in s1
  */
  public static String removeStr(String s1, String s2)
  {
    int sindx = s1.indexOf(s2);
    String s3 = s1.substring(0, sindx);
    String s4 = s1.substring(s2.length() + 1, s1.length());
    String fin5 = s3 + s4;
  return fin5;
}
}