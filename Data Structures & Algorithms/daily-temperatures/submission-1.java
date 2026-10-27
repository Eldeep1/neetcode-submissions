class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int[] result = new int[temperatures.length];
        Stack<Integer> sc = new Stack<>();
        for(int i = temperatures.length-1; i>=0; i--){
            int cur = temperatures[i];
            while(!sc.isEmpty() && temperatures[sc.peek()] <= temperatures[i]){
                sc.pop();
            }
            if(sc.isEmpty()){
                    result[i] = 0;
                }
                else{
                    result[i] = sc.peek()-i;
                }
                sc.push(i);
        }
        return result;
    }
}
