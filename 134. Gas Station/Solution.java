class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int left = 0;
        int total = 0;
        int index = -1;
        for (int i = 0; i < gas.length; i++) {
            left += gas[i] - cost[i];
            total += gas[i] - cost[i];
            if (left < 0) {
                index = i;
                left = 0;
            }
        }
        if (total < 0) {
            index = -1;
        } else {
            index++;
        }
        return index; 
    }
}
