/**
 * Basic BinaryTree class, as presented in lecture. Nodes have a reference to parent.
 *
 * @since 16 October 2023
 * @author Julian Edwards, Mohamed Noor, Liban and Ashley
 *
 */
public abstract class BinaryTree<E>{
    public static void main(String[] args) {
        TreePrint tree = new TreePrint();
        tree.Testing();
        searchBT searchTree = new searchBT();
        searchTree.Testing();
         
      }
    protected Node<E> root;
   
    // Nested Class for a tree node
    protected static class Node<E> {
        E data;
        Node <E> left;
        Node <E> right;   
        Node <E> parent;
        
       


        
//node constructor
public Node(E data) {
    this.data = data; // Assign the parameter to the class member
    this.left = null; // Correctly reference the 'left' class member
    this.right = null;
}}



// BinaryTree constructor
public BinaryTree() {
root = null;
}

/**
 * "BinaryTree has a method testing that each of the subclasses that are implemented in Step 2 will
 * override it; its return type is void."
 */
public abstract void Testing();

}

