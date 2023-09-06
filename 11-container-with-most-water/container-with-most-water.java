class Solution {
    public int maxArea(int[] height) {
        int area=Integer.MIN_VALUE;
        int i=0,j=height.length-1;
        int cur=Integer.MIN_VALUE;
        int h=0,w=0;
        while(i<j){
            if(height[i]>=height[j]){
                h=height[j];
                w=j-i;
                j--;
            }else{
                h=height[i];
                w=j-i;
                i++;
            }

            if(area < (h*w)){
                area=h*w;
            }
        }
        return area;
    }
}