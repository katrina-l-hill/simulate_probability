import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Probability {
    public static void main(String[] args) {
        coinToss();
        rollingDie();
        drawingCards();
        compoundEvents();

        ProbabilityTest.runTests();
    }

    public static void coinToss() {
        Random rand = new Random();
        int tossCoin = 100;
        int heads = 0;
        int tails = 0;

        for (int i = 0; i < tossCoin; i++) {
            int value = rand.nextInt(2);
            if (value == 0) {
                heads++;
            } else {
                tails++;
            }
        }
        System.out.println("Simulating coin toss: ");
        System.out.println("Heads: " + heads);
        System.out.println("Tails: " + tails);
        System.out.println();
    }

    public static void rollingDie() {
        Random rand = new Random();
        int dieRoll = 60;
        int[] frequency = new int[6];

        for (int i = 0; i < dieRoll; i++) {
            int value = rand.nextInt(6);
            frequency[value]++;
        }
        System.out.println("Rolling a die: ");
        for (int i = 0; i < frequency.length; i++) {
            System.out.println("Side " + (i + 1) + ": " + frequency[i]);
        }
    }

    public static void drawingCards() {
        List<String> deck = createDeck();
        Collections.shuffle(deck);
        Random rand = new Random();
        int shuffledDeck = 20;
        int redCard = 0;
        int blackCard = 0;

        for (int i = 0; i < 20; i++) {
            String card = (String) deck.get(rand.nextInt(deck.size()));
            if (isRed(card)) {
                redCard++;
            } else {
                blackCard++;
            }
        }
        System.out.println();
        System.out.println("Drawing cards: ");
        System.out.println("Red cards drawn: " + redCard);
        System.out.println("Black cards drawn: " + blackCard);
    }


    private static List<String> createDeck() {
        String[] suits = {"Hearts", "Diamonds", "Clubs", "Spades"};
        String[] values = {"2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "Q", "K", "A"};
        List<String> deck = new ArrayList<>();

        for (String suit : suits) {
            for (String value : values) {
                deck.add(value + " of " + suit);
            }
        }

        return deck;

    }

    private static boolean isRed(String card) {
        return card.contains("Hearts") || card.contains("Diamonds");

    }

    public static void compoundEvents() {
        Random rand = new Random();
        int numFlips = 50;
        int HH = 0;
        int HT = 0;
        int TH = 0;
        int TT = 0;

        for (int i = 0; i < numFlips; i++) {
            int coin1 = rand.nextInt(2);
            int coin2 = rand.nextInt(2);
            if (coin1 == 1 &&  coin2 == 1) {
                HH++;
            } else if (coin1 == 0 &&  coin2 == 0) {
                TT++;
            } else {
                HT++;
            }
        }
        System.out.println();
        System.out.println("Probability of Compound Events: ");
        System.out.println("Two heads (HH): " + HH);
        System.out.println("One head, one tail (HT): " + HT);
        System.out.println("Two tails (TT): " + TT);
    }
}