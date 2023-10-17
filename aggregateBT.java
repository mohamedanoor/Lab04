
    public class aggregateBT extends BinaryTree{

    public int countEvenNumber(Node localRoot) {
        if (localRoot == null)
            return 0;
        
        if (localRoot.data % 2 == 0) {
            return 1 + countEvenNumber(localRoot.left) + countEvenNumber(localRoot.right);
        }
        
        return countEvenNumber(localRoot.left) + countEvenNumber(localRoot.right);
    }
    
    
    public int findSum(Node localRoot) {
        if (localRoot == null)
            return 0;
        
        return localRoot.data + findSum(localRoot.left) + findSum(localRoot.right);
    }
    
    @Override
    public void testing() {
        BinaryTree bt = new BinaryTree();
        bt.root = new Node(1);
        bt.root.left = new Node(2);
        bt.root.right = new Node(3);
        bt.root.left.left = new Node(4);
        bt.root.left.right = new Node(5);
        
        System.out.println(countEvenNumber(bt.root));
        System.out.println(findSum(bt.root));
    }
}