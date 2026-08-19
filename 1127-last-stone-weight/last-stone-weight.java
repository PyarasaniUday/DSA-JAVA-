import java.util.*;
class Solution {
    public int lastStoneWeight(int[] stones) {
        /*
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

        */

        ArrayList<Integer> list = new ArrayList<>();

        // Add all stones to ArrayList
        for (int x : stones) {
            list.add(x);
        }

        while (list.size() > 1) {

            // Sort the list
            Collections.sort(list);

            // Get last two largest stones
            int x = list.get(list.size() - 1);
            int y = list.get(list.size() - 2);

            // Remove both
            list.remove(list.size() - 1);
            list.remove(list.size() - 1);

            // If they are not equal, add difference
            if (x != y) {
                list.add(x - y);
            }
        }

        // If list is empty, return 0
        if (list.size() == 0)
            return 0;

        return list.get(0);
    
    }
}