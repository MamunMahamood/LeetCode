class Solution {
    public String addBinary(String a, String b) {
       String s = "";
       int i = 0;
       int alen = a.length();
       int blen = b.length();
       int carry = 0;

       while(i<alen||i<blen||carry!=0){
           int x = 0;
           if(i<alen && a.charAt(alen-1-i)=='1'){
               x=1;
           }
           int y=0;
           if(i<blen&&b.charAt(blen-1-i)=='1'){
               y=1;
           }

           s = (x+y+carry)%2+s;
           carry = (x+y+carry)/2;
           i++;


       }
       return s;

    }
}