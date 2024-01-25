public class MyStaticMethods {
    public static int quadrant(double x, double y) {
        if (x > 0 && y > 0) return 1;
        if (x > 0 && y < 0) return 4;
        if (x < 0 && y > 0) return 2;
        if (x < 0 && y < 0) return 3;
        return 0;
    }
    public static boolean isVowel(String letter) {
        if (letter == "a" || letter == "e" || letter == "i" || letter == "o" || letter == "u") return true;
        return false;
    }
}
