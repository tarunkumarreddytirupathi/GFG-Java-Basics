//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

// import java.io.*;
import java.util.*;
class GFG {
	public static void main (String[] args) {
	    
	    //taking input using Scanner class
		Scanner sc = new Scanner(System.in);
		
		//taking total count of testcases
		int t=sc.nextInt();
		while(t-->0)
		{
		    //taking total count-1 of elements 
		    int n=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList-1
		    int v1[]=new int[n];
		    
		    //adding elements to the ArrayList-1
		    for(int i=0;i<n;i++)
		    {
		        v1[i]=sc.nextInt();
		    }
		    
		    //taking total count-2 of elements 
		    int m=sc.nextInt();
		    
		    //Declaring and Initializing an ArrayList-2
		    int v2[]=new int[m];
		    
		    //adding elements to the ArrayList-2
		    for(int i=0;i<m;i++)
		    {
		        v2[i]=sc.nextInt();
		    }
		    Solution ob = new Solution();
		    //calling the method common_element
		    //and passing ArrayList 1, 2 as arguments
		    //and storing the results in a new ArrayList
		    ArrayList<Integer>ans=ob.common_element(v1, v2);
		    
		    //printing the elements of the new ArrayList
		    for(int i:ans)
		    System.out.print(i+" ");
		    
		    System.out.println();

		}
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
   
    public static int secondForLoop(int v1[], int v2[],ArrayList<Integer> list, int first, int second){
        if(second+1==v2.length){
            if(v2[second]>0&&v1[first]==v2[second]){
                list.add(v1[first]);
                v2[second]=0;
                return 1;
        }
            return 1;
        }
        if(v2[second]>0&&v1[first]==v2[second]){
                list.add(v1[first]);
                v2[second]=0;
                return 1;
        }
        ++second;
        return secondForLoop(v1,v2,list,first,second);
    }
        
   
    public static int firstForLoop(int v1[], int v2[],ArrayList<Integer> list,int number){
        if(number+1==v1.length){
        //     for(int j=0;j<v2.length;j++){
        //     if(v2[j]>0&&v1[number]==v2[j]){
        //         list.add(v1[number]);
        //         v2[j]=0;
        //     }
        // }
        secondForLoop(v1,v2,list,number,0);
            return  1;
        }
        // for(int j=0;j<v2.length;j++){
        //     if(v2[j]>0&&v1[number]==v2[j]){
        //         list.add(v1[number]);
        //         v2[j]=0;
        //     }
        // } 
        secondForLoop(v1,v2,list,number,0);
        ++number;
        return firstForLoop(v1,v2,list,number);
        
       
    }
    
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        ArrayList<Integer> list = new ArrayList<>();

        //remove first for loop
        firstForLoop(v1,v2,list,0);
        // for(int i=0;i<v1.length;i++){
        //     for(int j=0;j<v2.length;j++){
        //     if(v1[i]>0&&v1[i]==v2[j]){
        //         list.add(v1[i]);
        //         v1[i]=0;
        //         v2[j]=0;
        //     }
        // }    
        // }
        Collections.sort(list);
        return list;
    }
}