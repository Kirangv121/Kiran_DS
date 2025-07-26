class Solution {
    public int maxArea(int[] height) {
        int left= 0;
        int right= height.length -1;
        int maxArea=0;

        while( left < right){
            int hleft= height[left];
            int hright= height[right];
            int width = right - left;
            int curArea = Math.min(hleft, hright) * width;

            // max area
            maxArea = Math.max(maxArea,curArea);

            if(hleft< hright){
                left++;
            }else{
                right--;
            }
        }

        return maxArea;
        
    }
}