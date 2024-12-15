//JUST 4 cases of false(after root and subroot matches):-
 //any one is null other continues
 //data do not match
 //left subtree do not match
 //right subtree do not match
class Solution {
    //1st bfs in "Main Tree" until subRoot matches
    public boolean isSubtree(TreeNode root, TreeNode subRoot) {
        if(root == null)
            return false;
        if(isSame(root,subRoot))//if it returns true then only true else false
            return true;
        return isSubtree(root.left,subRoot) || isSubtree(root.right,subRoot);
    }

    //BFS-type traversal(root then its l and r child(neighbour quickly)--(note:actual bfs requires level order traversal) in children: Compare children
    public boolean isSame(TreeNode r,TreeNode s)
    {
        if(r==null && s==null)
            return true;
        //check false conditions
        if(r==null || s==null)
            return false;
        if(r.val != s.val)
            return false;
        return isSame(r.left,s.left) && isSame(r.right,s.right);
    }
}

//T.C=O(m+n)...main tree and subtree's length
