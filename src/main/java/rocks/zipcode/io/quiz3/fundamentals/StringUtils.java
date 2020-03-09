package rocks.zipcode.io.quiz3.fundamentals;

import java.util.ArrayList;

/**
 * @author leon on 09/12/2018.
 */
public class StringUtils {
    public static String capitalizeNthCharacter(String str, Integer indexToCapitalize) {
        char character;
        String result = "";
        character = str.charAt(indexToCapitalize);
        result = str.substring(0, indexToCapitalize) + Character.toUpperCase(character) + str.substring(indexToCapitalize + 1, str.length());

        return null;
    }

    public static Boolean isCharacterAtIndex(String baseString, Character characterToCheckFor, Integer indexOfString) {
        for (int i = 0; i < baseString.length(); i++) {
            if (baseString.charAt(indexOfString) == characterToCheckFor) {
                return true;
            }
        }
        return false;
    }


    public static String[] getAllSubStrings(String string) {
        ArrayList<String> temp = new ArrayList<>();
        String[] str = string.split("");
        String holding = "";
        String[] result;
        for (int i = 0; i < str.length; i++) {
            int counter = 0;
            holding = "";
            temp.add(str[i]);
            holding = str[i];
            counter++;
            for(int j = i + 1; j < str.length; j++) {
                holding = holding.concat(str[j]);
                temp.add(holding);
                counter++;
            }
        }
        result = new String[temp.size()];
        return temp.toArray(result);

    }

    public static Integer getNumberOfSubStrings(String input) {
        int counter = 0;
        String[] temp = input.split( " ");
        for(String each : temp) {
            getAllSubStrings(each);
        }
        return counter;
    }
}
