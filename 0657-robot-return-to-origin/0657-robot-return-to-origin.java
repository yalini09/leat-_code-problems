class Solution {
    public boolean judgeCircle(String moves) {
    int col= 0;
    int row = 0;
    for(int i = 0 ; i < moves.length();i++){
        char ch = moves.charAt(i);
        if(ch == 'U')row--;
        else if(ch=='D')row ++;
        else if(ch=='L')col --;
        else if(ch== 'R')col++;
    }
    return (col==0&&row==0);
    }
}