import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        ArrayList<Integer> list = new ArrayList<>();
        for (int stone : stones) {
            list.add(stone);
        }
        while (list.size() > 1) {
            Collections.sort(list);
            int i = list.size() - 1;
            int y = list.get(i);
            int x = list.get(i - 1);
            list.remove(i);      // remove largest
            list.remove(i - 1);  // remove second largest
            if (y != x) {
                list.add(y - x);
            }
        }
        return list.isEmpty() ? 0 : list.get(0);
    }
}