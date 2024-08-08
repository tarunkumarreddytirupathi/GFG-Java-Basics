class Solution{
    public static ArrayList<Integer> CommonElement(int v1[],int v2[],int n1,int n2,List<Integer> list){
        if(v2==v2.length-1){
            if(v1[n1]==v2[n2]){
                list.add(v2[n2]);
                v1[n1]=-1;
                v2[v2]=-1;
            }
        }
        else{
            if(v1[n1]==v2[n2]){
                list.add(v2[n2]);
                v1[n1]=-1;
                v2[v2]=-1;
            }
        }
        return  CommonElement(v1,v2,v1, ++v2, list);
        
    }
    
    public static ArrayList<Integer> findCommonElements(int v1[],int v2[],int n1,int n2,List<Integer> list){
        
        if(v1==v1.length){
            return findCommonElements(v1,v2,n1,0);
        }
        else{
            return findCommonElements(v1,v2,++n1,0);
        }
    }
    
    public static ArrayList<Integer> common_element(int v1[], int v2[])
    {
        List<Integer> list=new ArrayList<>();
        
        list=findCommonElements(v1,v2,-1,-1,list);
        
        return list;
    }
}