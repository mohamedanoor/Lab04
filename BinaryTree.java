/**
 * Basic BinaryTree class, as presented in lecture. Nodes have a reference to parent.
 *
 * @since 16 October 2023
 * @author Julian Edwards, Mohamed Danoor
 *
 */
public class BinaryTree<E>
{
    protected Node<E> root;
    // Nested Class for a tree node
    protected static class Node<E>
    {
        E data;
        Node <E> left, right, parent;
    }
}
