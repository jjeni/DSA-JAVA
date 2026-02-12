import java.lang.classfile.instruction.StackInstruction;
import java.util.HashMap;

public class CheckPatter {
    static boolean wordPattern(String pattern, String s) {
        HashMap<Character, String> map = new HashMap<>();
        String[] arr = s.split(" ");
        if(pattern.length() != arr.length) return false;
        for(int i=0; i<arr.length; i++){
            String defaultValue = arr[i];
            String mapDefaultValue = map.get(pattern.charAt(i));
             
            if(mapDefaultValue == null){
                map.put(pattern.charAt(i), defaultValue);
                for(char key : map.keySet()){
                    String value = map.get(key);
                    if(value.equals(defaultValue) && !(key == pattern.charAt(i))){
                        return false;
                    }
                } 
            }
            else {
                if(!defaultValue.equals(mapDefaultValue)){
                    return false;
                }
                
            }
        }
        return true;
    }
    public static void main(String[] args) {
        String pattern = "abba";
        String s = "dog cat cat dog";
        System.out.println(wordPattern(pattern, s));
    }
}
