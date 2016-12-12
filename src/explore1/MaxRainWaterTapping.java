package explore1;

public class MaxRainWaterTapping {
	
	public static void main(String[] args) {
		int [] height={1,2,4,5,2,3,1};
		
		int maxArea=funcRain(height);
	}

	public static int  funcRain(int[] height){
		
		int i=0; int j=height.length-1; int max1=0;
		
		while (i!=j){
			int maxArea=0;
			if(height[i]<=height[j])
			{
				maxArea=height[i]*(j-i);
				i++;
			}
			
			if(height[i]>height[j])
			{
				maxArea=height[j]*(j-i);
				j--;
			}
			
			max1=Math.max(maxArea, max1);
			
		}
		System.out.println("max1 "+max1);
		return max1;
		
	}
	
}
