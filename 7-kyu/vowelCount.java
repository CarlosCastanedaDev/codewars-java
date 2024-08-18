// Return the number (count) of vowels in the given string.

// We will consider a, e, i, o, u as vowels for this Kata (but not y).

// The input string will only consist of lower case letters and/or spaces.

public class vowelCount {
    public static int getCount(String str) {
        String vowels = "aeiou";
        int sum = 0;
        for (int i = 0; i < str.length(); i++) {
            if (vowels.contains(Character.toString(str.charAt(i)))) {
                sum += 1;
            }
        }
        return sum;
    }
}
