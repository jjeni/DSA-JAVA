public class ReverseDigits {

    static int reverseDigit(int num){
        int result = 0;
        for(; num !=0; num/=10){
            if(result < Integer.MIN_VALUE || result > Integer.MAX_VALUE){
                return 0;
            }
            result = result * 10 + num %10;
        }
        return result;
    }

    public static void main(String[] args) {
        int num = -123455;
        System.out.println(reverseDigit(num));
    }
}
