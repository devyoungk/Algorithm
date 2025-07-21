import java.util.*;

class Solution {
    public int[] solution(int l, int r) {
        List<Integer> list = new ArrayList<>();
    for (int i = 1; i < (1 << (int)(Math.log(r)/Math.log(2) + 1)); i++) {
        int val = Integer.parseInt(Integer.toBinaryString(i)) * 5;
        if (val < l) continue;
        if (val > r) break;
        list.add(val);
    }
    if (list.isEmpty()) return new int[]{-1};
    return list.stream().mapToInt(Integer::intValue).toArray();
    }
}