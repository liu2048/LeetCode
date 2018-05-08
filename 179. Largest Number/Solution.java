class Solution {
    public String largestNumber(int[] nums) {        
        Integer[] ints = new Integer[nums.length];       
        for(int i = 0; i < nums.length; i++){
            ints[i] = nums[i];
        }        
        Comparator<Integer> cmp = new Comparator<Integer>() {
            public int compare(Integer a, Integer b) {
                String s1 = Integer.toString(a);
                String s2 = Integer.toString(b);
                return (s2+s1).compareTo(s1+s2);
            }
        };
        Arrays.sort(ints, cmp);
        if (ints[0] == 0) return "0";
        StringBuilder sb = new StringBuilder();
        for (int n : ints) {
            sb.append(n);
        }
        return sb.toString();
    }
}
