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





class Solution {
    // Function to insert a node in a BST.
    Node insert(Node root, int Key) {
       if(root==null) return new Node(Key);
       Node curr=root;
       while(curr!=null){
          if(curr.data==Key) break;
           if(curr.data>Key){
               if(curr.left==null){
                   curr.left=new Node(Key);
                   break;
               }else{
                   curr=curr.left;
               }
           }
           else{
               if(curr.right==null){
                   curr.right=new Node(Key);
                   break;
               }else{
                   curr=curr.right;
               }
           }
       }
       return root;
    }
}




//O(Height of the BST).
//O(1).
