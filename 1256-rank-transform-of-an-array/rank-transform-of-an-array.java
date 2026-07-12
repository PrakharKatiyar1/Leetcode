class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int[] arr2 = Arrays.copyOf(arr, arr.length);
        Arrays.sort(arr2);
        HashMap<Integer, Integer> map = new HashMap<>();
        int j = 1;
        for(int i = 0; i < arr.length; i++){
            if(map.containsKey(arr2[i])){
                continue;
            }
            map.put(arr2[i], j++);
        }
        int[] result = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            result[i] = map.get(arr[i]);
        }
        return result;
    }
}