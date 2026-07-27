class Solution {
    public boolean hasDuplicate(int[] nums) {
        Set noDupes = new HashSet<Integer>();
        for (int i = 0; i < nums.length; i++) {
            noDupes.add(nums[i]);
        }
        return noDupes.size() != nums.length;
    }
}