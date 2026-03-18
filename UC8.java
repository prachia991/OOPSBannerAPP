
import java.util.HashMap;

public class UC8 {
    public static HashMap<Character, String[]> characterPatternMap = new HashMap<>();
    
    public static String[] get0pattern() {
        return new String[] {
            " ||| ",
            "|| ||",
            "|| ||",
            "|| ||",
            "|| ||",
            " ||| "
        };
    }
    
    public static String[] getopattern() {
        return new String[] {
            " ||| ",
            "|| ||",
            "|| ||",
            "|| ||",
            "|| ||",
            " ||| "
        };
    }
    
    public static String[] getPpattern() {
        return new String[] {
            " |||| ",
            "||  ||",
            "||  ||",
            "||||| ",
            "||    ",
            "||    "
        };
    }
    
    public static String[] getSpattern() {
        return new String[] {
            " |||| ",
            "||    ",
            " |||| ",
            "    ||",
            "    ||",
            "||||| "
        };
    }
    
    public static void main(String[] args) {
        characterPatternMap.put('O', get0pattern());
        characterPatternMap.put('o', getopattern());
        characterPatternMap.put('P', getPpattern());
        characterPatternMap.put('S', getSpattern());

        String[] lines = new String[6];
        for (int i = 0; i < lines.length; i++) {
            lines[i] = characterPatternMap.get('O')[i] + " " + characterPatternMap.get('o')[i] + " " + characterPatternMap.get('P')[i] + " " + characterPatternMap.get('S')[i];
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }
}
