class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
            List<Integer> list=new ArrayList<>();
    int rowstart=0;int colstart=0;
    int colend=matrix[0].length-1;
    int rowend=matrix.length-1;
    while(rowstart<=rowend && colstart<=colend){
      for(int i=colstart;i<=colend ;i++){
        list.add(matrix[rowstart][i]);
        
      }
            for(int j=rowstart+1;j<=rowend ;j++){
        list.add(matrix[j][colend]);
        
      }
            for(int k=colend-1;k>=colstart ;k--){
              if(rowstart==rowend)break;
        list.add(matrix[rowend][k]);
        
      }
      for(int l=rowend-1;l>rowstart ;l--){
              if(colstart==colend)break;
        list.add(matrix[l][colstart]);
        
      }
      rowstart++;;
      rowend--;
      colstart++;
      colend--;


    }
          return list;


    }
}