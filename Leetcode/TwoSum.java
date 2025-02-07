

public class TwoSum {
    public int[] twoSum(int[] nums, int target){
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
                if(nums[j] == target - nums[i]){
                    return new int[]{i, j};
                }
            }
        }
        return new int[]{ };
    }
    public static void main(String[] args){
        TwoSum obj = new TwoSum();
        int nums[] = {2, 7, 11, 15};
        int target = 9;
        int res[] = obj.twoSum(nums, target);
        for(int i: res){
            System.out.print(i+" ");
        }
    }
}
