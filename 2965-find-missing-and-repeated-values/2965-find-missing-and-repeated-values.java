class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        HashMap<Integer,Integer>map=new HashMap<>();
        int n=grid.length;
        int N=n*n;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                int currentNum=grid[i][j];
                int currentcount=map.getOrDefault(currentNum,0);
                map.put(currentNum,currentcount+1);

            }
        }
        int repeating=-1;
        int missing=-1;
        for(int i=1;i<=N;i++){
            int count=map.getOrDefault(i,0);
            if(count==2)
            {
                repeating=i;
            }
            else if(count==0)
            {
                missing=i;
            }
        }
        return new int[]{repeating,missing};
         
    }
}