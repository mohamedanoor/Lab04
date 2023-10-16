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
     */
    public boolean containsGreater(final int item) {
        Node<Integer> localRoot = root;
        while(localRoot != null) { // search the root and all right children for data greater than item
            if(localRoot.data <= item) localRoot = localRoot.right;
            else return true;
        }

        return false; // all right branches and children have been searched, no data is greater than item
    }

    /**
     * @param item the item to try to find.
     * @return the level of the item in the tree, -1 if not found.
     */
    public int getLevel(final int item) {
        Node<Integer> localRoot = root;
        int level = 0;
        while(localRoot != null) {
            level++;
            if(localRoot.data > item) localRoot = localRoot.left;
            else if(localRoot.data < item) localRoot = localRoot.right;
            else return level;
        }

        return -1;
    }
}
