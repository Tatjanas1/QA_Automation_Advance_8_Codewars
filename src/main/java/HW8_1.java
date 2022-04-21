import java.util.Arrays;
import java.util.stream.IntStream;

public class HW8_1 {
    //8.1.1
    //https://www.codewars.com/kata/57eadb7ecd143f4c9c0000a3/train/java


    public static String abbrevName(String name) {
        String subName1;
        String subName2;
        subName1 = String.valueOf(name.charAt(0));
        int n = 0;
        for (int i = 0; i < name.length(); i++){
            if (name.charAt(i) == ' '){
               n = i+1;
            }
        }
        subName2 = String.valueOf(name.charAt(n));
        name = subName1.toUpperCase() + "." + subName2.toUpperCase();

        /*Write a function to convert a name into initials. This kata strictly takes two words with one space in between them.
The output should be two capital letters with a dot separating them.
It should look like this:
Sam Harris => S.H
patrick feeney => P.F*/

        return name;
    }

//Сначала разбивать на части (2 элемента массива стринг, разделитель запятая, потом вывод на экран первых букв кажного
    //элемента массива
        public static String abbrevName2(String name) {
            String[] names = name.split(" ");
            return (names[0].charAt(0) + "." + names[1].charAt(0)).toUpperCase();
        }

    public static String abbrevName3(String name) {
        name = name.toUpperCase();
        return name.charAt(0) + "." + name.charAt(name.indexOf(" ") + 1);
    }
//8.1.2
    //https://www.codewars.com/kata/5aa736a455f906981800360d/train/java
    public static boolean feast(String beast, String dish) {
        if (beast.charAt(0) == dish.charAt(0)
                && beast.charAt(beast.length()-1) == dish.charAt(dish.length()-1)){
           return true;
        } else {
            return false;
        }
    }
//8.1.3
    //    https://www.codewars.com/kata/5704aea738428f4d30000914/train/java
public static String tripleTrouble(String one, String two, String three) {
    // Solution
    String result = "";
    for (int i = 0; i < one.length(); i++){
      result += String.valueOf(one.charAt(i)) + String.valueOf(two.charAt(i)) + String.valueOf(three.charAt(i));
    }
    return result;
}
//8.1.4
    //    https://www.codewars.com/kata/5808e2006b65bff35500008f/train/java
    public static String position(char alphabet) {
        String abc = "abcdefghijklmnopqrstuvwxyz";
        String result = "Position of alphabet: ";
      result += (abc.indexOf(alphabet)+1);
    return result;
    }
    public static String position2(char alphabet)
    {
        return "Position of alphabet: " + ((int) alphabet - 96);
    }
//8.1.5
    //    https://www.codewars.com/kata/5a2be17aee1aaefe2a000151/train/java
    public static int arrayPlusArray(int[] arr1, int[] arr2) {
    int sum = 0;
        for (int i=0; i < arr1.length; i++){
        sum += arr1[i];
        }
        for (int i = 0; i < arr2.length; i++){
            sum += arr2[i];
        }
    return sum;
    }
    public static int arrayPlusArray2(int[] arr1, int[] arr2) {
        return IntStream.of(arr1).sum() + IntStream.of(arr2).sum();
    }

    public static void main(String[] args) {
      /* Задача 8.1
        System.out.println(abbrevName2("Smit Volf"));
        System.out.println(abbrevName2("smit volf"));
        String name = "Ser Gey";
        String[] names = name.split(" ");
        System.out.println(Arrays.toString(names));*/
       // System.out.println(feast("jiraf", "juf"));
        //System.out.println(tripleTrouble("aa", "bb", "cc"));
        System.out.println(position('a'));
    }

}
