public class ProbabilityTest {
    public static void main(String[] args) {
        runTests(); // Call the tests from the main method
    }

    public static void runTests() {
        testCoinToss();
        testRollingDie();
        testDrawingCards();
        testZeroCoinToss();
        testHighNumFlipsCompoundEvents();
        testDrawingMoreThanDeckSize();
    }
    //Normal test cases
    public static void testCoinToss() {
        System.out.println();
        System.out.println("Test Case 1: Normal Coin Toss Simulation");
        System.out.println("Expected: Approximately equal heads and tails (around 50 each in 100 tosses).");
        System.out.println();
        Probability.coinToss();
    }

    public static void testRollingDie() {
        System.out.println("Test Case 2: Normal Rolling Die Simulation");
        System.out.println("Expected: Approximately equal frequency across all six sides (in 60 rolls).");
        System.out.println();
        Probability.rollingDie();
    }

    public static void testDrawingCards() {
        System.out.println();
        System.out.println("Test Case 3: Normal Drawing Cards Simulation");
        System.out.println("Expected: Roughly equal number of red and black cards (around 10 each in 20 draws).");
        Probability.drawingCards();
    }

    //Edge test cases
    public static void testZeroCoinToss() {
        System.out.println();
        System.out.println("Edge Test Case 1: Zero Coin Tosses");
        System.out.println("Expected: Heads = 0, Tails = 0.");
        System.out.println();
        Probability.coinToss();
    }

    public static void testHighNumFlipsCompoundEvents() {
        System.out.println("Edge Test Case 2: High Number of Flips in Compound Events");
        System.out.println("Expected: All combinations (HH, HT, TT) appear.");
        Probability.compoundEvents();
    }

    public static void testDrawingMoreThanDeckSize() {
        System.out.println();
        System.out.println("Edge Test Case 3: Drawing More Cards Than Deck Size");
        System.out.println("Expected: Handles drawing more than 52 cards, with potential re-shuffling.");
        Probability.drawingCards();
    }
}
