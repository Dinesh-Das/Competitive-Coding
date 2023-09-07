class Solution {
    public double average(int[] salary) {
     double min=Double.MAX_VALUE,max=Double.MIN_VALUE;
     for(int sal:salary){
         if(min > sal) min=sal;
         if(max < sal) max=sal;
     } 
     double avg=0;
     int cnt=0;
     for(int sal:salary){
         if(sal==min || sal==max) continue;
         avg+=sal;
         cnt++;
     }
     return avg/cnt;
    }
}