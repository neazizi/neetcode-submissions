class Solution {
    public int lastStoneWeight(int[] stones) {
        List<Integer> stoneList=new ArrayList<>();

            for(int nums: stones){
                stoneList.add(nums);
            }
            
            while(stoneList.size()>1){
                Collections.sort(stoneList);
                int curr=stoneList.remove(stoneList.size()-1) - stoneList.remove(stoneList.size()-1);

                if(curr!=0){
                    stoneList.add(curr);
                }
            }
           return stoneList.isEmpty()? 0: stoneList.get(0);
           
        
    }
}
