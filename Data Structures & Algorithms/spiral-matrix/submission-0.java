class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> result = new ArrayList<>();
        int left = 0;
        int right = matrix[0].length - 1;
        int top = 0;
        int bottom = matrix.length - 1;
        while(left <= right && top <= bottom) {
            for(int index = left; index <= right; index++) {
                result.add(matrix[top][index]);
            }
            top++;
            for(int index = top; index <= bottom; index++) {
                result.add(matrix[index][right]);
            }
            right--;
            if(top <= bottom) {
                for(int index = right; index >= left; index--) {
                    result.add(matrix[bottom][index]);
                }
                bottom--;
            }
            if(left <= right) {
                for(int index = bottom; index >= top; index--) {
                    result.add(matrix[index][left]);
                }
                left++;
            }
        }
        return result;
    }
}
