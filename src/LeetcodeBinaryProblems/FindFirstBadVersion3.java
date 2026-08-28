package LeetcodeBinaryProblems;

public class FindFirstBadVersion3 {
        public int firstBadVersion(int n) {
            int start = 0;
            int end = n;
            while(start <= end){
                int mid = start + (end - start)/2;
                if(isBadVersion(mid)== false ){
                    start = mid + 1;
                }else{
                    end = mid - 1;
                }

            }

            return start;
        }

    private boolean isBadVersion(int mid) {
        boolean ans = isBadVersion(mid);
        return ans;
    }

}
