class Solution {
    public int finalValueAfterOperations(String[] oper) {
    int x = 0;
    for (int i = 0; i<oper.length;i++){
    String op = oper[i];
    if(op.equals("--X")||op.equals("X--")){
        x-=1;
    }   
     else if(op.equals("++X")||op.equals("X++")){
      x+=1;
     }
    
    }
    return x;
  }
}