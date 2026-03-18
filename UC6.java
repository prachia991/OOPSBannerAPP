public class UC6 {
    
    public static String[] get0pattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };}

    public static String[] getopattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            " *     * ",
            "  *****  "
        };}

    public static String[] getPpattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *     * ",
            " ******  ",
            " *       ",
            " *       ",
            " *       "
        };}

    public static String[] getSpattern() {
        return new String[] {
            "  *****  ",
            " *     * ",
            " *       ",
            "  *****  ",
            "       * ",
            " *     * ",
            "  *****  "
        };}

    public static void main(String[] args) {
        String[] lines = new String[7];
        String[] OPattern = get0pattern();
        String[] oPattern = getopattern();
        String[] pPattern = getPpattern();
        String[] sPattern = getSpattern();

        for (int i = 0; i < lines.length; i++) {
            lines[i] = OPattern[i] + " " + oPattern[i] + " " + pPattern[i] + " " + sPattern[i];
        }

        for (String line : lines) {
            System.out.println(line);
        }
    }


}
