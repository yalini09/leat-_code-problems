class Solution {
    public int findDelayedArrivalTime(int aT, int dT) {
      int delayt;
      delayt=aT+dT;
      if(delayt == 24 ) return 0 ; 
      else if(delayt>24) delayt = delayt - 24;
      return delayt;
    }
    
}