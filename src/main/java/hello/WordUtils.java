/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hello;

import java.util.ArrayList;
import org.springframework.util.StringUtils;

/**
 *
 * @author pbabar
 */
public class WordUtils {

    public Boolean isPaliondrome(String input) {
        Boolean isPalindrome = false;
        if (!StringUtils.isEmpty(input)) {
            String trimmed = input.trim();
            StringBuilder sb = new StringBuilder(trimmed);
            if (trimmed.equals(sb.reverse().toString())) {
                isPalindrome = true;
            }
        }
        return isPalindrome;
    }

    public Boolean isAngram(String input) {
        Boolean isAngram = true;
        if (!StringUtils.isEmpty(input)) {
            ArrayList<Character> a = new ArrayList<Character>();

            for (int i = 0; i < input.length(); i++) {
                if (a.contains(input.charAt(i))) {
                    a.remove((Object) input.charAt(i));
                } else {
                    a.add(input.charAt(i));
                }
            }
            if (a.size() > 1) {
                isAngram = false;
            }
        }
        return isAngram;
    }

}
