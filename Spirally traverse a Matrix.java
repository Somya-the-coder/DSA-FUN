class Solution {
    // Function to return a list of integers denoting spiral traversal of matrix.
    public ArrayList<Integer> spirallyTraverse(int mat[][]) {
        //Array=mxn
        int m=mat.length;//no. of rows
        int n=mat[0].length;//no. of columns
        
        ArrayList<Integer> list=new ArrayList<>();
        
        int left=0,right=n-1,top=0,bottom=m-1;
        
        //see gfg perfect animation and code page
        while(top<=bottom && left<=right)
        {
//Overall idea :- //1st print top row,then right col,then bottom row(condition check),then left row(condition check)
            for(int i=left;i<=right;i++)
            {
                list.add(mat[top][i]);
            }
            top++;//increment outside loop
            
            for(int i=top;i<=bottom;i++)
            {
                list.add(mat[i][right]);
            }
            right--;
            
            if(top<=bottom){//..............this line imp to write...bcz maan lo top>bottom still bottom-- ho gya then some elts might not be printed
            for(int i=right;i>=left;i--)
            {
                list.add(mat[bottom][i]);
            }
            bottom--;}
            
            if(left<=right){//this line imp to write
            for(int i=bottom;i>=top;i--)
            {
                list.add(mat[i][left]);
            }
            left++;}
//tc=mxn
//sc=mxn
            
        }
        return list;
    }
}
