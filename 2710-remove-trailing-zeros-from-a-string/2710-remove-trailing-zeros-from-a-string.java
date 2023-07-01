class Solution {
    public String removeTrailingZeros(String num) {
        String m = "";
        if(pointer(num)==-1) return num;
        else{
            for(int i = 0; i<=pointer(num); i++){
                m = m+num.charAt(i);
            }return m;
        }
    }




    public int pointer(String s){
        int n = s.length();
        int point = n-1;
        while(point>=0){
            if(s.charAt(point)!='0'){
                return point;
            }
            else point--;
        }return -1;

    }
}