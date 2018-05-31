package lab;

/*
 * Implements a node of a B-Tree
 *
 * Make sure that you have tested all the given test cases
 * given on the homepage before you submit your solution.
 *
 */


import frame.Entry;

import java.util.ArrayList;

public class B_TreeNode {

	private int t;
	private B_TreeNode parent;
	private ArrayList<Entry> keys;
	private ArrayList<B_TreeNode> children;

    /**
	* The constructor
	* 
	* @param t minimum degree of the B-tree
      *
	*/

    public B_TreeNode(int t) {
        /**
         * Add your code here
    	   */
        this.t = t;
        this.keys = new ArrayList<>();
        this.children = new ArrayList<>();
    }

    public boolean isEmpty(){
    	if(keys.size() == 0)
    		return true;
    	else
    		return false;
	}

	public boolean full(){
    	if (keys.size() == t * 2 - 1)
    		return true;
    	else
    		return false;
	}


    /**
     * locates the index of a key if it'S contained in the node
     * if it isn't it locates the index of the child node to be searched next
     * @param searchkey key that is searched for
     * @return int, index of entry or node
     */
	public int getIndex(String searchkey){
        int i = 0;
        while (i < keys.size()){
            if(keys.get(i).getKey().compareTo(searchkey) == 0)
                return i;
            if(keys.get(i).getKey().compareTo(searchkey) > 0)
                return -i;
            i++;

        }
        return -i;
	}

	/**
	 * returns entry corresponding to the key
	 * @param index
	 * @return Entry for given key
	 */
	public Entry getEntry(int index){
		//placeholder
    	return keys.get(index);
	}

	/**
	 * returns the node that might contain key that is being looked for
	 * @param index
	 * @return B_TreeNode
	 */
	public B_TreeNode getNode(int index){
		return children.get(index);
	}

	public void addEntry(Entry insertEntry, int index){
	    if(index >= 0)
	        keys.add(index, insertEntry);
	    else
	        keys.add(insertEntry);
	}
	public void addEntry(Entry insertEntry){
	    addEntry(insertEntry, -1);
    }
   /**
    * Add your code here
    */
 

}