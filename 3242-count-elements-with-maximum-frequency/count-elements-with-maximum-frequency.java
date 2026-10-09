
import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxFrequencyElements(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int maxFreq = 0;
        int frequency = 0;

        for (int count : map.values()) {
            if (count > maxFreq) {
                maxFreq = count;
                frequency = count;
            } else if (count == maxFreq) {
                frequency += count;
            }
        }

        return frequency;
    }
}