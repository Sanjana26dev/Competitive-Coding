public class Solution {  
    public int longestCommonSubsequence(String text1, String text2) {  
        // Initialize matrix with proper dimensions  
        int[][] matrix = new int[text1.length() + 1][text2.length() + 1];  

        // Build the LCS matrix  
        for (int j = text2.length() - 1; j >= 0; j--) {  
            for (int i = text1.length() - 1; i >= 0; i--) {  
                if (text1.charAt(i) == text2.charAt(j)) {  
                    matrix[i][j] = 1 + matrix[i + 1][j + 1]; // Use j+1 to match text2  
                } else {  
                    matrix[i][j] = Math.max(matrix[i + 1][j], matrix[i][j + 1]);  
                }  
            }  
        }  
        
        return matrix[0][0]; // Return value for the whole strings  
    }  
}