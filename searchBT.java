/**
 *
 * @since 16 October 2023
 * @author Julian Edwards
 *
 */
public class searchBT extends BinaryTree<Integer>
{
    /**
     * @param item the item to be compared.
     * @return true if there is an item greater than the input in the tree, otherwise false.
     *
     * @since 16 October 2023
     * @author Julian Edwards
     */
    public boolean containsGreater(final int item) {
        Node<Integer> localRoot = root;
        while(localRoot != null) { // search all nodes in this tree
            if(localRoot.data <= item) localRoot = successor(localRoot);
            else return true;
        }

        return false; // all right branches and children have been searched, no data is greater than item
    }

    /**
     * @param item the item to try to find.
     * @return the level of the item in the tree, -1 if not found.
     *
     * @since 16 October 2023
     * @author Julian Edwards
     */
    public int getLevel(final int item) {
        Node<Integer> localRoot = root;
        // set level 0 as the root, if you want it to start at level 1, change the 0 here to a 1
        // starting with the root level as 0 instead of 1 makes it more consistent with other java data structures
        for(int level = 0; localRoot != null; level++) {
            if(localRoot.data > item) localRoot = localRoot.left;
            else if(localRoot.data < item) localRoot = localRoot.right;
            else return level; // item found!
        }

        return -1; // item was not found
    }

    /**
     * Calls the two methods above this (using dummy values) and prints the output.
     *
     * @since 16 October 2023
     * @author Julian Edwards
     */
    @Override
    public void testing() {
        // containsGreater
        if(containsGreater(10)) System.out.println("This tree contains a value greater than 10!");
        else System.out.println("This tree does not contain a value greater than 10!");

        // getLevel
        final int level = getLevel(10);
        if(level != -1) System.out.printf("This tree contains value 10 at level %d (where the root is level 0)!\n", level);
        else System.out.println("This tree does not contain value 10!");
    }

    /**
     * Code and documentation from lecture: finds the successor of a specified Node.
     * @author Behrooz Mansouri
     */
    protected Node<Integer> successor(final Node<Integer> node) {
        if (node == null)
            return null;
        else if (node.right != null) {
            // WALK DOWN: successor is leftmost Node in right subtree
            Node<Integer> c = node.right;
            while (c.left != null)
                c = c.left;
            return c;
        } else { // WALK UP: node has no right child
            // go up the tree until arrive by a left edge of parent
            Node<Integer> p = node.parent;
            Node<Integer> c = node;
            while (p != null && c == p.right) {
                c = p;
                p = p.parent;
            }
            return p;
        }
    }
}
