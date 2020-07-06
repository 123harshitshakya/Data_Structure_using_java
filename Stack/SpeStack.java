// { Driver Code Starts
import java.util.Scanner;
import java.util.Stack;
class SpeStack{
	public static void main(String[] args){
		Scanner sc=new Scanner(System.in);
		int t=sc.nextInt();
		while(t-->0){
			int n=sc.nextInt();
			Stack<Integer> s=new Stack<>();
			GfG g=new GfG();
			while(!g.isFull(s,n)){
				g.push(sc.nextInt(),s);
			}
		System.out.println(g.min(s));
		}
	}
}// } Driver Code Ends


/*Complete the function(s) below*/
class GfG{
    Stack<Integer> minElement=new Stack<>();
	public void push(int a,Stack<Integer> s)
	{
	    //add code here.
	    s.push(a);
	    if(minElement.isEmpty())
	       minElement.push(a);
	    else if(s.peek() < minElement.peek())
	        minElement.push(s.peek());
	       
	    
	}
	public int pop(Stack<Integer> s)
        {
            //add code here.
            return s.pop();
	}
	public int min(Stack<Integer> s)
        {
           //add code here.
           return minElement.peek();
           
	}
	public boolean isFull(Stack<Integer>s, int n)
        {
           //add code here.
           if(n==0)
                return true;
           else
                return false; 
	}
	public boolean isEmpty(Stack<Integer>s)
        {
           //add code here.
           if(s.isEmpty())
                return true;
           else
                return false;
	}
}