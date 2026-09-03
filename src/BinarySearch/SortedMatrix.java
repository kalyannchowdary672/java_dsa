package BinarySearch;
public class SortedMatrix {
    public static void main(String[] args) {

    }
    static int[] BinarySearch(int matrix[][], int row, int cStart, int cEnd, int target) {
        if (cStart <= cEnd) {
            int mid = cStart + (cEnd - cStart)/2;
            if (matrix[row][mid] == target) {
                return new int[]{row, mid};
            }
            if (matrix[row][mid] < target) {
                cStart = mid + 1;
            }
            if (matrix[row][mid] > target) {
                cEnd = mid - 1;
            }
        }
        // ans not found return -1,-1
        return new int[]{-1, -1};
    }
    static int[] search(int matrix[][], int target){
        int rows = matrix.length;
        int col  = matrix[0].length;
        if(rows == 1){
            return BinarySearch(matrix,0,0,col-1,target);
        }
        int rStart = 0;
        int rend = rows - 1;
        int cMid = col/2;
        while(rStart <= rend - 1 ){
            int mid = rStart + (rend - 1)/2;
            if(matrix[mid][cMid] == target){
                return new int[] {mid,cMid};
            }if(matrix[mid][cMid] < target){
                rStart = mid;
            }else{
                rend = mid;
            }
            // now two rows are available
            if(rStart)
        }

    }
}
