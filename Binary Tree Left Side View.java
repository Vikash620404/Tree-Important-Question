class Solution {
    public List<Integer>  leftSideView(TreeNode root) {
List<Integer>arr=new ArrayList();
leftView(root,arr,0);
return arr;
        
    }
public void leftView(TreeNode curr,List<Integer>ans,int level){
    if(curr==null) return ;
if(level==ans.size()) ans.add(curr.val);
leftView(curr.left,ans,level+1);
leftView(curr.right,ans,level+1);
}
}
//O(H)
//O(N)
