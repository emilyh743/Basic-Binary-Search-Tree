package BST_A2;

public class BST implements BST_Interface {
	public BST_Node root;
	int size;

	public BST() {
		size = 0;
		root = null;
	}

	public BST_Node getRoot() {
		return root;
	}

	public boolean contains(String s) {
		if (root == null) {
			return false;
		} else {
			return root.containsNode(s);
		}
	}

	public boolean insert(String s) {
		if (root == null) {
			root = new BST_Node(s); // set root to bst node
			size++;
			return true;
		}
		if (root.insertNode(s)) {
			size++;
			return true;
		} else {
			return false;
		}
	}

	public boolean remove(String s) {
		if (size == 0) { // nothing in tree
			return false;
		}
		if (root == null) { // no root
			return false;
		}
		if (root.removeNode(s)) {
			size--;
			return true;
		}
		if (root.data.compareTo(s) == 0) {
			if (root.left == null && root.right == null) {
				root = null;
			} else if (root.right == null) {
				root = root.left;
			} else if (root.left == null) {
				root = root.right;
			} else {
				root.right.findMin().left = root.left;
				root = root.right;
			}
			size = size - 1; // grabs next node
			return true;
		}
		return false;
	}

	public boolean empty() {
		if (root == null) {
			return true;
		}
		if (size == 0) {
			return true;
		} else {
			return false;
		}
	}

	public String findMin() {
		if (size == 0) {
			return null;
		}
		return root.findMin().data;
	}

	public String findMax() {
		if (size == 0) {
			return null;
		}
		return root.findMax().data;
	}

	public int height() {
		if (root == null) {
			return -1;
		}
		return root.getHeight();
	}

	public int size() {
		return size;
	}

}