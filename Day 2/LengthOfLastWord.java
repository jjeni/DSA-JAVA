public class LengthOfLastWord {
    static int lengthOfLastWord(String str) {
        if (str == null || str.length() == 0) {
            return 0;
        }
        int len = 0;
        int empty = 0;
        for (int i = (str.length() - 1); i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                empty++;
            } else {
                break;
            }
        }
        str = str.substring(0, str.length()-empty);
        for (int i = (str.length() - 1); i >= 0; i--) {
            if (str.charAt(i) == ' ') {
                break;
            } else {
                len++;
            }
        }
        return len;

    }
    public static void main(String[] args) {
        String s = "Happy Mokhon  j";
        System.out.println(lengthOfLastWord(s));
    }
}
