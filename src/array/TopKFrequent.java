package array;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class TopKFrequent {
    public static int[] topKFrequent(int[] nums, int k){
        Map<Integer, Integer> count = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            count.put(nums[i], count.getOrDefault(nums[i],0)+1);
        }
        List<Map.Entry<Integer, Integer>> list = new ArrayList<>(count.entrySet());

        list.sort((a, b) -> b.getValue() - a.getValue());

        int[] res = new int[k];
        for(int i = 0; i < k; i++){
            res[i] = list.get(i).getKey();
        }
        return res;
    }
}
