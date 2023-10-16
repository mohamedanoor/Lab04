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

    /**
     * Calls the two methods above this (using dummy values) and prints the output.
     */
    @Override
    public void testing() {
        // containsGreater
        if(containsGreater(10)) System.out.println("This tree contains a value greater than 10!");
        else System.out.println("This tree does not contain a value greater than 10!");

        // getLevel
        final int level = getLevel(10);
        if(level != -1) System.out.printf("This tree contains value 10 at level %d!\n", level);
        else System.out.println("This tree does not contain value 10!");
    }
}
