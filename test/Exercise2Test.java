import java.util.Objects;

// Run this file to check your work. It prints PASS or FAIL for each method, plus a hint when something is wrong.
// Expected values below come from the verified game-by-game scores (see instructor/DATA_SOURCES.md).
// They are typed in here on purpose, so the tests do not depend on your file.
public class Exercise2Test {

    public static void main(String[] args) {
        System.out.println("Checking Exercise 2...\n");
        run("totalPointsScored", Exercise2Test::totalPointsScored);
        run("numberOfWins", Exercise2Test::numberOfWins);
        run("pointDifferential", Exercise2Test::pointDifferential);
        run("biggestWinMargin", Exercise2Test::biggestWinMargin);
        finish();
    }

    static void totalPointsScored() {
        checkTotal("Chiefs", 2025, 362);
        checkTotal("Patriots", 2025, 490);
        checkTotal("Packers", 2025, 391);
        checkTotal("Cowboys", 2026, 151);
        checkTotal("Eagles", 2026, 106);
        checkTotal("49ers", 2026, 177);
        checkTotal("Chiefs", 2026, 140);
    }

    static void checkTotal(String team, int season, int expected) {
        int actual = Exercise2.totalPointsScored(team, season);
        expect(expected, actual, team + " " + season + ": expected " + expected + " total points but got " + actual
                + ". Make sure your loop adds EVERY game from getPointsScored, starting from a sum of 0.");
    }

    static void numberOfWins() {
        checkWins("Eagles", 2025, 11);
        checkWins("Patriots", 2025, 14);
        checkWins("Cowboys", 2025, 7);
        checkWins("Packers", 2025, 9);
        checkWins("49ers", 2026, 6);
        checkWins("Chiefs", 2026, 5);
        checkWins("Eagles", 2026, 2);
    }

    static void checkWins(String team, int season, int expected) {
        int actual = Exercise2.numberOfWins(team, season);
        String tieNote = (season == 2025 && (team.equals("Cowboys") || team.equals("Packers")))
                ? " (This team played a 40-40 tie in 2025 - a tie is not a win.)" : "";
        expect(expected, actual, team + " " + season + ": expected " + expected + " wins but got " + actual
                + ". Check that you only count games where your score is GREATER than theirs, and that you compare the two"
                + " numbers for the SAME game index." + tieNote);
    }

    static void pointDifferential() {
        checkDiff("Cowboys", 2025, -40);
        checkDiff("Patriots", 2025, 170);
        checkDiff("Chiefs", 2025, 34);
        checkDiff("49ers", 2025, 66);
        checkDiff("Eagles", 2026, -31);
        checkDiff("Packers", 2026, 2);
        checkDiff("Patriots", 2026, 23);
    }

    static void checkDiff(String team, int season, int expected) {
        int actual = Exercise2.pointDifferential(team, season);
        expect(expected, actual, team + " " + season + ": expected a point differential of " + expected + " but got "
                + actual + ". Add up ALL points scored, add up ALL points allowed, then subtract: scored - allowed.");
    }

    static void biggestWinMargin() {
        checkMargin("Packers", 2026, 24);
        checkMargin("Chiefs", 2025, 31);
        checkMargin("Patriots", 2025, 32);
        checkMargin("Eagles", 2025, 31);
        checkMargin("Cowboys", 2026, 17);
        checkMargin("Eagles", 2026, 4);
        checkMargin("49ers", 2026, 22);
        int actual = Exercise2.biggestWinMargin("Jets", 2025);
        expect(0, actual, "Jets 2025 is not in our data, so both lists are empty and there are no wins. "
                + "Expected 0 but got " + actual + ". Start your \"biggest so far\" at 0.");
    }

    static void checkMargin(String team, int season, int expected) {
        int actual = Exercise2.biggestWinMargin(team, season);
        expect(expected, actual, team + " " + season + ": expected a biggest win margin of " + expected + " but got "
                + actual + ". For each game i, the margin is scored.get(i) - allowed.get(i) - same i for both lists! "
                + "Only look at games the team won, and keep the largest margin you have seen so far.");
    }

    // ===================== test runner (you don't need to read below here) =====================

    private static int passed = 0;
    private static int failed = 0;
    private static int crashed = 0;

    private static class Failure extends RuntimeException {
        Failure(String message) {
            super(message);
        }
    }

    private static void expect(Object expected, Object actual, String message) {
        if (!Objects.equals(expected, actual)) {
            throw new Failure(message);
        }
    }

    private static void run(String name, Runnable test) {
        try {
            test.run();
            passed++;
            System.out.println("PASS   " + name);
        } catch (Failure f) {
            failed++;
            System.out.println("FAIL   " + name);
            System.out.println("         " + f.getMessage());
        } catch (RuntimeException e) {
            crashed++;
            System.out.println("CRASH  " + name);
            System.out.println("         Your method stopped with an error: " + e);
            System.out.println("         Check your list indexes - the last valid index is size() - 1.");
        }
    }

    private static void finish() {
        int total = passed + failed + crashed;
        System.out.println();
        System.out.println(passed + " of " + total + " methods passed." + (passed == total ? " Great work!" : ""));
        System.exit(passed == total ? 0 : 1);
    }
}
