class Solution
{
   
	ArrayList <Integer> boundary(Node node)
	{
	    ArrayList<Integer>list=new ArrayList<>();
	    if(isLeaf(node)==false) list.add(node.data);
	    addLeftBoundry(node,list);
	    addLeaf(node,list);
	    addRightBoundry(node,list);
	    return list;
	}
	
	void addLeftBoundry(Node root,ArrayList<Integer>res){
	    Node cur = root.left;
        while (cur != null) {
            if (isLeaf(cur) == false) res.add(cur.data);
            if (cur.left != null) cur = cur.left;
            else cur = cur.right;
        }
	}
	void addLeaf(Node root,ArrayList<Integer>res){
	    if (isLeaf(root)) {
            res.add(root.data);
            return;
        }
        if (root.left != null) addLeaf(root.left, res);
        if (root.right != null) addLeaf(root.right, res);
	}
	void addRightBoundry(Node root,ArrayList<Integer>res){

 Node cur = root.right;
        ArrayList < Integer > tmp = new ArrayList < Integer > ();
        while (cur != null) {
            if (isLeaf(cur) == false) tmp.add(cur.data);
            if (cur.right != null) cur = cur.right;
            else cur = cur.left;
        }
        int i;
        for (i = tmp.size() - 1; i >= 0; --i) {
            res.add(tmp.get(i));
        }
	}
	 boolean isLeaf(Node root){
  if (root.left==null&&root.right==null) return true;
  
  return false;
}
}



//O(N)
