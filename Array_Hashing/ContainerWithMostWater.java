package Array_Hashing;

public class ContainerWithMostWater {
    public int maxArea(int[] height) {
        int max=0;
        int l=0;
        int r=height.length-1;
        while (l<r){
            int count=0;
            count=Math.min(height[l],height[r])*(r-l);
            max=Math.max(max,count);
            if(height[l]<height[r]){
                int leftMax=height[l];
                while (l < r && leftMax >= height[l]) l++;
            }
            else {
                int rightMax=height[r];
                while(l<r && rightMax>=height[r]) r--;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ContainerWithMostWater obj = new ContainerWithMostWater();
        System.out.println(obj.maxArea(new int[]{30,10,20,10}));
    }
}
