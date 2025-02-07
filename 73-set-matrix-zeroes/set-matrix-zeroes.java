class Solution {
    public void setZeroes(int[][] matrix) {
        
        int m = matrix.length;
        int n= matrix[0].length;

    //Step 1 : create two boolean arrays to track rows and columns that should be zeroed
     
     boolean[] rows = new boolean[m];
     boolean[] column = new boolean[n];

     //Step 2 : Traverse the matrix to mark the rows and columns that need to be zeroed

     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(matrix[i][j]==0)
            {
                rows[i]=true;
                column[j]=true;
            }
        }
     }

     //step 3 : traverse the matrix again and zero iut rows and columns

     for(int i=0;i<m;i++)
     {
        for(int j=0;j<n;j++)
        {
            if(rows[i] || column[j])
            {
                matrix[i][j]=0;            }
        }
     }


    }
}