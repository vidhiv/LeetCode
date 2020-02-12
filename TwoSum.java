
/*
Problem 1
Given nums = [2, 7, 11, 15], target = 9,

Because nums[0] + nums[1] = 2 + 7 = 9,
return [0, 1].

*/

class TwoSum {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++){
            int search = target - nums[i];
            if(map.containsKey(search)) {
                    return new int[]{map.get(search), i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}
