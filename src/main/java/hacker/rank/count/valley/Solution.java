package hacker.rank.count.valley;

import java.util.Scanner;

/**
 * Created by Shehan on 6/8/16.
 */
public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String s = sc.next();

        int v = 0;     // # of valleys
        int lvl = 0;   // current level
        for (char c : s.toCharArray()) {
            if (c == 'U') ++lvl;
            if (c == 'D') --lvl;

            // if we just came UP to sea level
            if (lvl == 0 && c == 'U')
                ++v;
        }
        System.out.print(v);
    }

}