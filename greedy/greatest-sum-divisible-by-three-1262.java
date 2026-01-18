class Solution {
    public int maxSumDivThree(int[] nums) {
        int sum = 0;
        ArrayList <Integer> r1 =new ArrayList<>();
        ArrayList <Integer> r2 =new ArrayList<>();
        for(int i = 0; i < nums.length ; i++){
            sum += nums[i];
            if(nums[i] % 3 == 1) r1.add(nums[i]);
            else if(nums[i] % 3 == 2) r2.add(nums[i]);
        }
        if(sum % 3 == 0) return sum;
        Collections.sort(r1);
        Collections.sort(r2);
        while(true){
            if(sum % 3 == 1){
                int x1 = r1.size() > 0 ?  r1.get(0) : Integer.MAX_VALUE;
                int x2 = r2.size() > 1 ? r2.get(0) + r2.get(1) : Integer.MAX_VALUE;
                sum -= Math.min (x1, x2);
                break;
            }
            else if(sum % 3 == 2){
                int x1 =r2.size() > 0 ? r2.get(0) : Integer.MAX_VALUE;
                int x2 = r1.size() > 1 ? r1.get(0) + r1.get(1)  : Integer.MAX_VALUE;
                sum -= Math.min (x1, x2);
                break;
            }
            
        }
        
        return sum;
    }
}
