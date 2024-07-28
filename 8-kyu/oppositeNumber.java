// Very simple, given a number (integer / decimal / both depending on the language), find its opposite (additive inverse).

// Examples:

// 1: -1
// 14: -14
// -34: 34

public class oppositeNumber {
    public static int opposite(int number) {
        return number > 0 ? -number : Math.abs(number);
    }
}
