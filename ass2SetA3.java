public class ass2SetA3 {
   public static void main(String[] args) {
      int a[] = new int[20];
      int j, temp, i;
      for (i = 0; i < args.length; i++) {
         a[i] = Integer.parseInt(args[i]);
      }
      for (i = 0; i < args.length; i++) // SORTING THE ELEMENTS IN ARRAY
      {
         for (j = 0; j < args.length - i - 1; j++) {
            if (a[j] > a[j + 1]) {
               temp = a[j];
               a[j] = a[j + 1];
               a[j + 1] = temp;
            }
         }
      }
      System.out.println("Sorted array elements are: ");
      for (i = 0; i < args.length; i++) {
         System.out.println(a[i] + "\t"); //// PRINTING SORTED ELEMENTS
      }
   }
}
