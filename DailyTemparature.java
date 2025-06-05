package Basics;
import java.util.Stack;

public class DailyTemparature {
	
	public static int[] dailyTemparatures(int[] temparatures)
	{
		int[] ans=new int[temparatures.length];
		Stack<Integer> stack=new Stack<>();
		for(int i=0;i<temparatures.length;i++)
		{
			while(!stack.isEmpty() && temparatures[stack.peek()] < temparatures[i] )
			{
				ans[stack.peek()]=i-stack.peek();
				stack.pop();
			}
			stack.push(i);
		}
		return ans;
	}
	
	public static void printAns(int[] ans)
	{
		for(int i=0;i<ans.length;i++)
		{
			System.out.print(ans[i]+" ");
		}
	}
	
	public static void main(String[] args)
	{
		int[] arr= {73,74,75,71,69,72,76,73};
		int[] ans=dailyTemparatures(arr);
		printAns(ans);
	
		
	}

}
