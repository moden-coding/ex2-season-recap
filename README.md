# Exercise 2: Season Recap

About 25–30 minutes. You'll use real game-by-game scores for six teams: the full 2025 season and 2026 so far.

## What to do
1. Open `src/Exercise2.java`.
2. Fill in the four methods under **YOUR WORK**. Each has a description, a small example and a hint.
3. Run `main`. Compare your output to the `// Expected:` comments under each line.
4. Don't change anything below the **DO NOT EDIT** line. That's where the data lives.
   You get it by calling `getPointsScored(team, season)` and `getPointsAllowed(team, season)`.
   The two lists line up: index `i` is the same game in both.

## Checking your work with the tests
- Open `test/Exercise2Test.java` and run it, just like you run `main`. It prints PASS or FAIL for each method.
- Or, in the terminal: `javac -d out src/*.java test/*.java` then `java -cp out Exercise2Test`
- Each failing test prints a message. **Read the failure message first.** It names the team and season that went wrong, gives the right answer, and adds a hint.
- At the start, every test fails. That's normal. Each method you finish should change from FAIL to PASS.
