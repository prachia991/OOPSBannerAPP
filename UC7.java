public class UC7 {
    public static class CharacterPatternMap{
        public String[] pattern;
    }
    public static CharacterPatternMap getCharacterPatternMap(Character character) {
        CharacterPatternMap characterPatternMap = new CharacterPatternMap();
        switch (character) {
            case 'O' -> characterPatternMap.pattern = get0pattern();
            case 'o' -> characterPatternMap.pattern = getopattern();
            case 'P' -> characterPatternMap.pattern = getPpattern();
            case 'S' -> characterPatternMap.pattern = getSpattern();
            default -> characterPatternMap.pattern = new String[]{};
        }
        return characterPatternMap;
    }
    
    private static String[] get0pattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }
    
    private static String[] getopattern() {
        return new String[]{
            "  ***** ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };
    }
    
    private static String[] getPpattern() {
        return new String[]{
            "  *****  ",
            " *     * ",
            " *     * ",
            "  *****  ",
            " *       ",
            " *       ",
            " *       "
        };
    }
    
    private static String[] getSpattern() {
        return new String[]{
            "  ***** ",
            " *      ",
            " *       ",
            "  *****",
            "       * ",
            "       * ",
            "  *****  "
        };
    }
    
    public static void main(String[] args) {
        // build banner using the character-pattern map
        char[] chars = {'O', 'o', 'P', 'S'};
        String[] lines = new String[7];

        // initialize lines with empty strings
        for (int i = 0; i < lines.length; i++) {
            lines[i] = "";
        }

        // concatenate patterns for each character
        for (char c : chars) {
            String[] pattern = getCharacterPatternMap(c).pattern;
            for (int i = 0; i < lines.length; i++) {
                lines[i] += pattern[i] + " ";
            }
        }

        // print the result
        for (String line : lines) {
            System.out.println(line);
        }
    }
}