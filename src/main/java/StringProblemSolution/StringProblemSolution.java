package StringProblemSolution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class StringProblemSolution {

    public static boolean areTwoStringsSame(String a, String b) { // First Question
        return a.equals(b);
    }

    public static int areDifferentFromPosition(String a, String b) { // Second Question
        int ans = 0;
        //Assuming -1 if the strings are same
        if (areTwoStringsSame(a, b)) {
            ans = -1;
            return ans;
        } else {
            char[] inA = a.toCharArray();
            char[] inB = b.toCharArray();
            int sizeOfInB = inB.length;

            for (int i = 0; i < inA.length; i++) {
                if (sizeOfInB <= 0) {
                    ans = i - 1;
                    return ans;
                } else if (inA[i] != inB[i]) {
                    ans = i;
                    break;
                }
                sizeOfInB -= 1;
            }
            if (sizeOfInB > 0 && ans == 0) {
                ans = inA.length - 1;
                return ans; // Discrepancy started after the size of a.
            }
        }
        return ans;
    }

    public static String stringContains(String a, String b) {
        StringBuilder sol = new StringBuilder();
        StringBuilder ans = new StringBuilder();
        Set<Character> set1 = new HashSet<Character>();
        Set<Character> set2 = new HashSet<Character>();

        for (char c : a.toCharArray()) {
            set1.add(c);
        }
        for (char c : b.toCharArray()) {
            set2.add(c);
        }

        // Stores the intersection of set1 and set2 inside set1
        set1.retainAll(set2);

        for (char c : set1) {
            //System.out.print(" " + c);
            sol.append(c);
        }


        char tempArray[] = sol.toString().toCharArray();
        Arrays.sort(tempArray);

        //System.out.println(sol);
        for (int i = 0; i < tempArray.length; i++) {
            if (i == tempArray.length - 1) {
                ans.append(String.valueOf(tempArray[i]));
            } else {
                ans.append(String.valueOf(tempArray[i])).append(",");
            }

        }


        System.out.println("\nTotal number of common characters: " + ans);
        return ans.toString();
    }

}
