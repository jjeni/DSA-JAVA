package day3;
import java.util.ArrayList;
import java.util.List;

public class SegmentsInString {
    static int countSegments(String s) {
        int count  = 0;
        char[] arr = s.toCharArray();
        if(arr.length == 0) return 0;
        List<String> sarr = new ArrayList<>();
        String temp ="";
        for(char c : arr){
            if(c != ' ') temp+=c;
            else{
                if(!temp.equals("")){
                    sarr.add(temp);
                    temp="";
                }
            }
        }
        if(!temp.equals("")){
                    sarr.add(temp);
                    temp="";
                }
        return sarr.size();
    }
    public static void main(String[] args) {
        String s = " Jeni is a  programmer ";
        System.out.println(countSegments(s));
    }
}
