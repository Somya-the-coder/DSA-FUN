class Solution {
    // Function to return a list of integers denoting the node
    // values of both the BST in a sorted order.
    
//M1: INSERT SMALLER TREE INTO BIGGER BALANCED BST


//M2: BETTER tc=sc=O(m+n)
    // Do inorder traversal of both trees to get 2 sorted arrays , merge there 2 arrays sortedly again, Construct a bst from this.

//helper method 1: inorder
public void getinorder(Node root,ArrayList<Integer> arr)
    {
        if(root==null) return;
        getinorder(root.left,arr);
        arr.add(root.data);
        getinorder(root.right,arr);
    }
    
//helper method 2: merge ...function overloading...differs from main functional method by "type" of parameters
private ArrayList<Integer> merge(ArrayList<Integer> arr1,ArrayList<Integer> arr2)//given in qs to make private(can be acc within same class- so write it in the same class)
{
    ArrayList<Integer> merged=new ArrayList<>();
    int i=0,j=0;
    
    while(i<arr1.size() && j<arr2.size()){
        if(arr1.get(i)<arr2.get(j))
            merged.add(arr1.get(i++));
        else
           merged.add(arr2.get(j++));
    }
    
    while(i<arr1.size())
        merged.add(arr1.get(i++));
    while(j<arr2.size())
        merged.add(arr2.get(j++));
    
    return merged;
}

//code's main functional method
public ArrayList<Integer> merge(Node root1, Node root2) 
    {  
    //step1: get inorder traversal of both BSTs
        ArrayList<Integer> arr1=new ArrayList<>();
        getinorder(root1,arr1);
        ArrayList<Integer> arr2=new ArrayList<>();
        getinorder(root2,arr2);
    //step2: merge 2 sorted arrays
        ArrayList<Integer> merged=merge(arr1,arr2);
     
    //return the sorted ArrayList  
    return merged;
    }
}


//M3: In-Place Merge using DLL sc=O(m+n),sc=O(1)
    //convert 2 bst into doubly LL , merge 2 sorted LL, build balanced bst from merged list
