class Node{
    int data;
    Node left;
    Node right;

    public Node(int data){
        this.data=data;
    }
}
public class binarytree {
    Node root;
    public void insert(int i) {
        root=insertrec(root,i);
    }
    public Node insertrec(Node root,int data){
        if(root==null){
            root=new Node(data);
        }
        else if (root.data>data) {
            root.left=insertrec(root.left,data);
        }
        else if (root.data<data) {
            root.right=insertrec(root.right,data);
        }
        System.out.print(root.data+" ");
        return root;
    }
    public void inorder(){
        inorderrec(root);
    }

    private void inorderrec(Node root) {
        if(root!=null){
            inorderrec(root.left);
            System.out.print(root.data+" ");
            inorderrec(root.right);
        }
    }
    public void preorder(){
        preorderrec(root);
    }

    private void preorderrec(Node root) {
        if(root!=null){
            System.out.print(root.data+" ");
            preorderrec(root.left);
            preorderrec(root.right);
        }
    }
    public void postorder(){
        postorderrec(root);
    }

    private void postorderrec(Node root) {
        if(root!=null){
            postorderrec(root.left);
            postorderrec(root.right);
            System.out.print(root.data+" ");
        }
    }

    public void search(int num) {
        Serachelement(root,num);
    }

    private void Serachelement(Node root, int num) {
        if(root==null){
            System.out.println("Element not found "+num);
        } else if (root.data==num){
            System.out.println("Element found "+num);
        } else if (root.data<num) {
            Serachelement(root.right,num);
        }
        else {
            Serachelement(root.left,num);
        }

    }
    public static Node minValueNode(Node node) {
        Node current = node;
        while (current.left != null) {
            current = current.left;
        }
        return current;
    }
    public static Node deleteRec(Node node, int data) {
        if (node == null) {
            return null;
        }

        if (data < node.data) {
            node.left = deleteRec(node.left, data);
        } else if (data > node.data) {
            node.right = deleteRec(node.right, data);
        } else {
            // Node with only one child or no child
            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            }

            // Node with two children: Get the inorder successor
            node.data = minValueNode(node.right).data;
            node.right = deleteRec(node.right, node.data);
        }
        return node;
    }
    public void delete(int num) {
        deleteRec(root,num);
    }

}
