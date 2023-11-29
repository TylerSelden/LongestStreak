public class App {
    public static void main(String[] args) throws Exception {
        Streak("CCAAAAATTT!");
    }
    public static void Streak(String str) {
        // loop over chars in the string
        char lastChar = '\0';
        int streak = 1;
        int longestStreak = 1;
        for (int i = 0; i < str.length(); i++) {
            if (lastChar != '\0' && str.charAt(i) == lastChar) {
                streak++;
            } else {
                if (longestStreak < streak) longestStreak = streak;
                streak = 1;
            }
            lastChar = str.charAt(i);
        }
        System.out.println(longestStreak);
    }
}
