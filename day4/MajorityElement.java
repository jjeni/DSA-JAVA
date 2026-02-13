package day4;

import java.util.HashMap;

public class MajorityElement {
    static int majorityElement(int[] nums){
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        int target = 0;
        for(int x : nums){
            map.put(x, map.getOrDefault(x, 0)+1);
            int count = map.get(x);
            if(count>n/2){
                target= x;
                break;
            }
        }
        return target;
    }
    public static void main(String[] args) {
        int[] num = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(num));
    }
}
