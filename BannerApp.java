/**
 * OOPS Banner App - UC6: Static Functions
 *
 * UC6 Goal: Replace hardcoded/inline array initialization with dedicated static
 * helper methods that build each character pattern (O, P, S).
 * This promotes:
 *  - Modularity: each method encapsulates one character's pattern
 *  - Reusability: repeated letters (like two O's in "OOPS") reuse the same method
 *  - DRY Principle: no duplicate pattern strings across the codebase
 */
public class BannerApp {

    // ─────────────────────────────────────────────────
    // Static helper methods — one per character
    // ─────────────────────────────────────────────────

    /**
     * Builds and returns the 5-line ASCII pattern for the letter 'O'.
     */
    static String[] buildO() {
        return new String[] {
            " OOO ",
            "O   O",
            "O   O",
            "O   O",
            " OOO "
        };
    }

    /**
     * Builds and returns the 5-line ASCII pattern for the letter 'P'.
     */
    static String[] buildP() {
        return new String[] {
            "PPP  ",
            "P  P ",
            "PPP  ",
            "P    ",
            "P    "
        };
    }

    /**
     * Builds and returns the 5-line ASCII pattern for the letter 'S'.
     */
    static String[] buildS() {
        return new String[] {
            " SSS ",
            "S    ",
            " SSS ",
            "    S",
            " SSS "
        };
    }

    // ─────────────────────────────────────────────────
    // Main method
    // ─────────────────────────────────────────────────

    public static void main(String[] args) {

        // Build each character's pattern by invoking the static helper methods.
        // UC6 key change: arrays are populated via method calls, not inline literals.
        String[] letterO1 = buildO();   // First  'O' in "OOPS"
        String[] letterO2 = buildO();   // Second 'O' in "OOPS"  ← reuses same method (DRY)
        String[] letterP  = buildP();   // 'P'
        String[] letterS  = buildS();   // 'S'

        // Render the banner line-by-line (same loop-based rendering as UC5)
        int totalLines = letterO1.length; // all arrays have 5 lines

        System.out.println("========== OOPS Banner (UC6 – Static Functions) ==========\n");

        for (int line = 0; line < totalLines; line++) {
            System.out.println(
                letterO1[line] + "  " +
                letterO2[line] + "  " +
                letterP[line]  + "  " +
                letterS[line]
            );
        }

        System.out.println("\n==========================================================");
    }
}