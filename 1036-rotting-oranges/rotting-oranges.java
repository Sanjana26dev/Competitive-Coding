class Solution {
    public int orangesRotting(int[][] grid) {
        if(grid==null || grid.length==0){
            return 0;
        }
        Queue<int[]> rottenqueue=new LinkedList<>();
        int m = grid.length;
        int n=grid[0].length;
        
        int freshcount=0;
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                if(grid[i][j]==1){
                    freshcount++;

                }
                else if(grid[i][j]==2){
                    rottenqueue.offer(new int[]{i,j});
                }
            }
        }
        if(freshcount==0) return 0;
        int minutes=0;
        int[][] direction={{1,0},{-1,0},{0,1},{0,-1}};
        while(!rottenqueue.isEmpty()){
            int size=rottenqueue.size();
            for(int i =0;i<size;i++){
                int[] rotten = rottenqueue.poll();
                for(int[] dir : direction){
                    int x=rotten[0]+dir[0];
                    int y = rotten[1] + dir[1];
                    if(x >=0 && x<m && y>=0 && y<n && grid[x][y]==1 ){
                        grid[x][y]=2;
                        freshcount--;
                        rottenqueue.offer(new int[]{x,y});
                    }
                }
            }
            minutes++;
        }
        return freshcount==0? minutes-1 : -1;

    }
}