public class StringDemo
 {
   public static void main(String []args)
 {
      String str = "testdemo";
      System.out.println("String: "+str);
      int index = str.indexOf("demo");
      System.out.printf("Substring 'demo' is at index %d", index);
   }
}