import java.util.Arrays;

public class HW8_2 {
    //8.2.1
    // https://www.codewars.com/kata/53369039d7ab3ac506000467/train/java
    public static String boolToWord(boolean b) {
        if (b == true) {
            return "Yes";
        } else {
            return "No";
        }
    }

    //8.2.2
    // https://www.codewars.com/kata/57356c55867b9b7a60000bd7/train/java
    public static Integer basicMath(String op, int v1, int v2) {
        int result = 0;
        if (op.equals("+")) {
            result = v1 + v2;
        } else if (op.equals("-")) {
            result = v1 - v2;
        } else if (op.equals("/")) {
            result = v1 / v2;
        } else if (op.equals("*")) {
            result = v1 * v2;
        }
        return result;
    }

    //8.2.3
    // https://www.codewars.com/kata/5a00e05cc374cb34d100000d/train/java
    public static int[] reverse(int n) {
        int[] newArr = new int[n];

        for (int i = 0, j = n; i < n; i++, j--) {
            newArr[i] = j;
        }

        return newArr;
    }

    //8.2.4
    // https://www.codewars.com/kata/57e76bc428d6fbc2d500036d/train/java
    public static String[] stringToArray(String s) {
        String[] str = s.split(" ");
        return str;
    }

    //8.2.5
    // https://www.codewars.com/kata/577bd026df78c19bca0002c0/train/java

    public static String correct(String string) {
          string = string.replace('5', 'S');
          string = string.replace('0', 'O');
          string = string.replace('1', 'I');
        return string;
    }
}