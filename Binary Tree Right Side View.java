class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer>list=new ArrayList();
         rightView(root,list,0);
return list;
    }
public void  rightView(TreeNode root,List<Integer>ans,int level){
if(root==null) return;
if(level== ans.size()){
  ans.add(root.val);

}
rightView(root.right,ans,level+1);
rightView(root.left,ans,level+1);
}
}
