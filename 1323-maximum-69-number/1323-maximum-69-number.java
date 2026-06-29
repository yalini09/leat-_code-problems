class Solution {
    public int maximum69Number (int n) { 
        int dif=3;
        int div=1; 
        int sum=0;
        while(div<=n){
            int id= n%(div*10)/div;
            if(id==6)sum=dif;
            dif*=10;
            div*=10;
        }
        return n+sum;
        
    }
}