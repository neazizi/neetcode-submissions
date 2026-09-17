class Solution {
    public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int n=stones.length;

        while(n>1){
            int curr=stones[n-1]-stones[n-2];

            n-=2;
            if(curr>0){
                int left=0;
                int right=n;

                while(left<right){
                    int mid=left+(right-left)/2;

                    if(stones[mid]<curr){
                        left=mid+1;
                    }else{
                        right=mid;
                    }
                }
                int pos=left;
                n++;
                stones=Arrays.copyOf(stones, n);
                for(int i=n-1;i>pos;i--){
                    stones[i]=stones[i-1];
                }
                stones[pos]=curr;

            }

        }
        return n>0? stones[0]:0;
    }
}
