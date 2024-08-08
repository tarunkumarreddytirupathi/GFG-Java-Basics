//{ Driver Code Starts
//Initial Template for Java

/*package whatever //do not write package name here */

import java.io.*;
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
        sc.close();
	}
}
// } Driver Code Ends


//User function Template for Java

class Solution{
    public static int[] CommonElement(int v1[],int v2[],int n1,int n2,int array[]){
        if(n2==v2.length-1){
            if(v1[n1]>0&& v1[n1] >0 &&v1[n1]==v2[n2]){
                v1[n1]=-1;
                v2[n2]=-1;
                return array;
            }
            array[0]=0;
           array[1]=0;
           array[2]=0;
            return array;
        }
        else{
            if(v1[n1]>0&& v1[n1] >0 &&v1[n1]==v2[n2]){
                
                v1[n1]=-1;
                v2[n2]=-1;
                return array;
            }
            ++n2;
            
        }
        return  CommonElement(v1,v2,n1, n2);
        
    }
    
    public static ArrayList<Integer> findCommonElements(int v1[],int v2[],int n1,int n2,ArrayList<Integer> list){
        
        if(n1==v1.length-1){
            int array[]=new int[3];
            number,i,j=CommonElement( v1, v2, n1, n2,array);
            if (number>0) {
                list.add(number);
            }
            return (ArrayList<Integer>) list;
        }
        else{
            int number=CommonElement( v1, v2, n1, n2);
            if (number>0) {
                list.add(number);
            }
             ++n1;
        }
        return findCommonElements( v1, v2, n1, n2,list);
    }
    
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        ArrayList<Integer> list=new ArrayList<>();
        
        list=findCommonElements(v1,v2,0,0,list);
        //Sort ascending 
        Collections.sort(list);
        return list;
    }
}