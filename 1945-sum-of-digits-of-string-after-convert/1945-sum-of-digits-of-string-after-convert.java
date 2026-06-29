class Solution{
    public int getLucky(String s,int k){
        StringBuilder str=new StringBuilder();
        for(char ch:s.toCharArray()){
            str.append(ch-'a'+1);
        }
        String num=str.toString();
        while(k>0){
            int sum=0;
            for(char ch:num.toCharArray()){
                sum+=ch-'0';
            }
            num=String.valueOf(sum);
            k--;
        }
        return Integer.parseInt(num);
    }
}