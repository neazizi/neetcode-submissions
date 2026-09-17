class Solution {
    public int lastStoneWeight(int[] stones) {
        //max-heap, the largest stones come first
        PriorityQueue<Integer> pq=new PriorityQueue<>((a,b)->b-a);

        //add all stones to the heap
        for(int stone:stones){
            pq.offer(stone);
        }

        //smash the two heaviest stones
        while(pq.size()>1){
            int x=pq.poll();
            int y=pq.poll();

            //if the weights are not the same, find the difference
            if(x!=y){
                pq.offer(x-y);
            }

        }
        //return the last stone or 0 if empty 
        return pq.isEmpty()?0: pq.poll();
        
    }
}
