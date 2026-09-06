class Solution {
    public int romanToInt(String s) {
        int result=0;
        HashMap<Character,Integer>s1=new HashMap<>();
        s1.put('I',1);
        s1.put('V',5);
        s1.put('X',10);
        s1.put('L',50);
        s1.put('C',100);
        s1.put('D',500);
        s1.put('M',1000);
       for(int i=0;i< s.length();i++)
       {
         int cv=s1.get(s.charAt(i));
         if(i+1<s.length()&& cv <s1.get(s.charAt(i+1))){
            result-=cv;
         }else{
            result+=cv;
         }
         
       }       
   return result; }
}