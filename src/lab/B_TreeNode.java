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
	ArrayList<Entry> keys;
	ArrayList<B_TreeNode> children;

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


	public int contains(String searchkey){
		for (int i = 0; i < keys.size(); i++){
			if (keys.get(i).getKey().compareTo(searchkey) == 0)
				return i;
		}
		return -1;
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
	 * @param searchkey
	 * @return
	 */
	public B_TreeNode getNode(String searchkey){
		int i = 0;
		while(i < keys.size() && keys.get(i).getKey().compareTo(searchkey) <= 0){
			i++;
		}
		return children.get(i);
	}
   /**
    * Add your code here
    */
 

}