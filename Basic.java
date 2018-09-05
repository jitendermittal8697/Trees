class tree
{
    int key;
    tree left;
    tree right;
    tree(int key)
    {
        this.key = key;
        left = right = null;
    }
    tree()
    {
    }
    
    // Left Root Right
    void inorder(tree root)
    {
        if(root==null)
            return;
        inorder(root.left);
        System.out.print(root.key + " ");
        inorder(root.right);
    }
    
    // Left Right Root 
    void postorder(tree root)
    {
        if(root==null)
            return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.key + " ");
    }
    
    // Root Left Right
    void preorder(tree root)
    {
        if(root==null)
            return;
        System.out.print(root.key + " ");
        preorder(root.left);
        preorder(root.right);
    }
    
    public static void main(String args[])
    {
        tree obj = new tree();
        tree node1 = new tree(1);
        tree node2 = new tree(2);
        tree node3 = new tree(3);
        tree node4 = new tree(4);
        tree node5 = new tree(5);
        tree node6 = new tree(6);
        tree node7 = new tree(7);
        tree node8 = new tree(8);
        tree node9 = new tree(9);
        
        node1.left = node2;
        node1.right = node3;
        node2.left = node4;
        node2.right = node9;
        node3.right = node5;
        node4.left = node8;
        node4.right = node7;
        node5.left = node6;
        
        /*
                    1 
                   / \
                  2   3
                 / \   \
                4   9   5
               / \     /
              8   7   6  
        */        
        System.out.println("Tree Created Successfully");
        
        System.out.println("preorder");
        obj.preorder(node1);
        System.out.print("\n");
        System.out.println("postorder");
        obj.postorder(node1);
        System.out.print("\n");
        System.out.println("inorder");
        obj.inorder(node1);
        System.out.print("\n");
        
    }
}
