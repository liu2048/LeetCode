public class Solution {
    public String getPermutation(int n, int k) {
        int factory = 1;
        List<Integer> list = new ArrayList<>();
        list.add(1);
        for (int i = 2; i < n; i++){
            factory *= i;
            list.add(i);
        }
        list.add(n);
        k--; // change to 0-index, so that when index = k / factory is exactly an integer, the end of a subgroup
		     // is reached
        StringBuilder sb = new StringBuilder();
        for (int j = n - 1; j > 0; j--){
            int index = k / factory;
            k = k % factory;
            factory /= j; 
            sb.append(list.get(index));
            list.remove(index);
        }
        sb.append(list.get(0));
        return sb.toString();
    }
}