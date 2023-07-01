class Solution {
    public int diagonalSum(int[][] mat) {
        int n = mat.length;
    int m = mat[0].length;
    
    int top =0;
    int left = 0;
    int lsum=0;
    //int down =n-1;
    int right = m-1;
    int rsum=0;
    while(top<=n-1&&left<=m-1){
        lsum=lsum+mat[top][left];
        top++;
        left++;
    }
    top=0;
    while(top<=n-1&&right>=0){
        rsum=rsum+mat[top][right];
        top++;
        right--;
    }
    
    if(n%2==0)  return Math.abs(lsum+rsum);
    else return  Math.abs(lsum+rsum-mat[n/2][n/2]);
    }
}