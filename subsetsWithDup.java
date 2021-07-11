class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lst=new ArrayList<List<Integer>>();
        Arrays.sort(nums);
        backtrack(nums,lst,new ArrayList<Integer>(),0);
        return lst;
    }
    public void backtrack(int[] nums,List<List<Integer>> lst,ArrayList<Integer> arr,int start) {
        lst.add(new ArrayList<Integer>(arr));
        for (int i=start;i<nums.length;i++) {
            if (i>start && nums[i]==nums[i-1]) continue;
            arr.add(nums[i]);
            backtrack(nums,lst,arr,i+1);
            arr.remove(arr.size()-1);
        }
    }
}
