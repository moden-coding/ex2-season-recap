import java.util.ArrayList;

public class Exercise2 {

    // ===================== main: run this to see your output =====================
    public static void main(String[] args) {
        // This is what the data looks like - one number per game, in week order:
        System.out.println("49ers 2026 points scored:  " + getPointsScored("49ers", 2026));
        System.out.println("49ers 2026 points allowed: " + getPointsAllowed("49ers", 2026));
        // Expected: [27, 35, 36, 24, 32, 23]
        // Expected: [7, 13, 30, 14, 29, 17]
        System.out.println();

        System.out.println("Chiefs 2025 total points scored: " + totalPointsScored("Chiefs", 2025));
        // Expected: 362

        System.out.println("Eagles 2025 wins: " + numberOfWins("Eagles", 2025));
        // Expected: 11

        System.out.println("Cowboys 2025 point differential: " + pointDifferential("Cowboys", 2025));
        // Expected: -40

        System.out.println("Packers 2026 biggest win margin: " + biggestWinMargin("Packers", 2026));
        // Expected: 24
    }

    // ===================== YOUR WORK: fill in these methods =====================
    // Teams: "Patriots", "Cowboys", "Chiefs", "Eagles", "Packers", "49ers"   Seasons: 2025, 2026
    // getPointsScored(team, season) and getPointsAllowed(team, season) are lined up game by game:
    // index 0 in both lists is the same game, index 1 is the next game, and so on.

    // Return the total number of points the team scored across all its games that season.
    // Example: scored [10, 24, 3] -> 37
    // Hint: start a running sum at 0 and add every number from getPointsScored(team, season).
    public static int totalPointsScored(String team, int season) {
        // TODO: your code here
        return 0;
    }

    // Return how many games the team won. A win means the team scored MORE points than the opponent.
    // A tie (same score) is NOT a win.
    // Example: scored [10, 24, 3], allowed [7, 24, 20] -> 1 win (only the first game; the second was a tie)
    // Hint: use an index loop so you can look at the scored and allowed numbers for the SAME game i.
    public static int numberOfWins(String team, int season) {
        // TODO: your code here
        return 0;
    }

    // Return the team's point differential: total points scored minus total points allowed.
    // It can be negative if the team gave up more points than it scored.
    // Example: scored [10, 24, 3], allowed [7, 24, 20] -> 37 - 51 = -14
    // Hint: you need two running totals - or you could reuse a method you already wrote.
    public static int pointDifferential(String team, int season) {
        // TODO: your code here
        return 0;
    }

    // Return the biggest winning margin (scored minus allowed) among the games the team WON.
    // If the team has no wins, return 0.
    // Example: scored [10, 24, 30], allowed [7, 24, 20] -> wins by 3 and by 10, so the answer is 10
    // Hint: keep a "biggest so far" variable starting at 0, and only check it in games the team won.
    public static int biggestWinMargin(String team, int season) {
        // TODO: your code here
        return 0;
    }

    // ===================== DATA: loaded for you — DO NOT EDIT BELOW THIS LINE =====================
    // Regular-season points, one number per game played, in week order (bye weeks skipped).
    // 2025: full regular season. 2026 data through Week 6, retrieved 2026-10-21.
    // Source: ESPN scoreboards, cross-checked with CBS Sports scoreboards.

    public static ArrayList<Integer> getPointsScored(String team, int season) {
        if (team.equals("Patriots") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    13, 33, 14, 42, 23, 25, 31, 32, 24, 28, 27, 26, 33, 31, 28, 42, 38));
        }
        if (team.equals("Cowboys") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    20, 40, 14, 40, 37, 27, 44, 24, 17, 33, 24, 31, 30, 26, 17, 30, 17));
        }
        if (team.equals("Chiefs") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    21, 17, 22, 37, 28, 30, 31, 28, 21, 19, 23, 28, 10, 13, 9, 13, 12));
        }
        if (team.equals("Eagles") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    24, 20, 33, 31, 17, 17, 28, 38, 10, 16, 21, 15, 19, 31, 29, 13, 17));
        }
        if (team.equals("Packers") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    27, 27, 10, 40, 27, 27, 35, 13, 7, 27, 23, 31, 28, 26, 16, 24, 3));
        }
        if (team.equals("49ers") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    17, 26, 16, 21, 26, 19, 20, 15, 34, 26, 41, 20, 26, 37, 48, 42, 3));
        }
        if (team.equals("Patriots") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    10, 20, 6, 29, 45, 26));
        }
        if (team.equals("Cowboys") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    20, 37, 31, 34, 16, 13));
        }
        if (team.equals("Chiefs") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    31, 33, 24, 30, 22));
        }
        if (team.equals("Eagles") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    24, 24, 7, 20, 17, 14));
        }
        if (team.equals("Packers") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    22, 20, 14, 17, 31, 23));
        }
        if (team.equals("49ers") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    27, 35, 36, 24, 32, 23));
        }
        return new ArrayList<>();
    }

    public static ArrayList<Integer> getPointsAllowed(String team, int season) {
        if (team.equals("Patriots") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    20, 27, 21, 13, 20, 19, 13, 13, 23, 23, 14, 20, 15, 35, 24, 10, 10));
        }
        if (team.equals("Cowboys") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    24, 37, 31, 40, 22, 30, 22, 44, 27, 16, 21, 28, 44, 34, 34, 23, 34));
        }
        if (team.equals("Chiefs") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    27, 20, 9, 20, 31, 17, 0, 7, 28, 22, 20, 31, 20, 16, 26, 20, 14));
        }
        if (team.equals("Eagles") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    20, 17, 26, 25, 21, 34, 22, 20, 7, 9, 24, 24, 22, 0, 18, 12, 24));
        }
        if (team.equals("Packers") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    13, 18, 13, 40, 18, 23, 25, 16, 10, 20, 6, 24, 21, 34, 22, 41, 16));
        }
        if (team.equals("49ers") && season == 2025) {
            return new ArrayList<>(java.util.List.of(
                    13, 21, 15, 26, 23, 30, 10, 26, 24, 42, 22, 9, 8, 24, 27, 38, 13));
        }
        if (team.equals("Patriots") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    13, 3, 35, 26, 17, 19));
        }
        if (team.equals("Cowboys") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    28, 20, 34, 30, 24, 23));
        }
        if (team.equals("Chiefs") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    10, 30, 10, 27, 6));
        }
        if (team.equals("Eagles") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    22, 20, 27, 24, 19, 25));
        }
        if (team.equals("Packers") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    39, 17, 35, 14, 7, 13));
        }
        if (team.equals("49ers") && season == 2026) {
            return new ArrayList<>(java.util.List.of(
                    7, 13, 30, 14, 29, 17));
        }
        return new ArrayList<>();
    }
}
