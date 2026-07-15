public class trapping_rainwater {
    
    public static int TrappingRainwater (int height[] ) {
        int LeftMax[] = new int[height.length];
        LeftMax[0] = height[0];
        for(int i=1; i<height.length; i++) {
            LeftMax[i] = Math.max(height[i], LeftMax[i-1]); 
        }
        int RightMax[] = new int[height.length];
        RightMax[height.length-1] = height[height.length-1];
        for(int i =height.length-2;i<height.length;i++ ) {
            LeftMax[i] = Math.max(height[i],LeftMax[i-1]);
        }
        int TrappedRainwater = 0;
        for(int i=0;i<height.length;i++) {
            int waterlevel = Math.min(LeftMax[i], RightMax[i]);
            TrappedRainwater += waterlevel - height[i];  
        }

        return TrappedRainwater;
        
        
    }

    public static void main(String args[]) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
    }
} 