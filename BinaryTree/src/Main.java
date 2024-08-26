public class Main {
    public static void main(String[] args) {
        binarytree bt=new binarytree();
        bt.insert(8);
        bt.insert(7);
        bt.insert(12);
        bt.insert(15);
        bt.insert(2);
        bt.insert(5);
        System.out.println();
        bt.inorder();
        System.out.println();
        bt.preorder();
        System.out.println();
        bt.postorder();
        int num=8;
        bt.search(num);
        bt.delete(num);
        System.out.println();
        bt.inorder();
    }
}