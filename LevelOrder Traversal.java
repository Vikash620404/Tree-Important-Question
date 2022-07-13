class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>>result=new ArrayList<>();
     if(root==null) return result;
Queue<TreeNode>q=new LinkedList<>();
while(!q.isEmpty){
int size=q.size();
  List<Integer> curLevel = new LinkedList<Integer>();
while(size-->0){
TreeNode temp=q.poll();
curLevel.add(temp.val);
if (temp.left != null) q.offer(temp.left);
 if (temp.right != null) q.offer(temp.right); 
}
 res.add(curLevel);
}
return result;
    }
}




//O(N)
//O(N)
