class Solution {
   
    Node insert(Node root, int Key) {
      if(root==null) return new Node(Key);
        if(Key<root.data){
            root.left=insert(root.left,Key);
        }else if(Key>root.data){
            root.right=insert(root.right,Key);
            
        }
        
     
     return root;
    }
}




//O(Height of the BST).
//O(Height of the BST).
