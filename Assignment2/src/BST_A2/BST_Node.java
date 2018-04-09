package BST_A2;

public class BST_Node {
	String data;
	BST_Node left;
	BST_Node right;
	int size;

	BST_Node(String data) {
		this.data = data;
	}

	public String getData() {
		return data;
	}

	public BST_Node getLeft() {
		return left;
	}

	public BST_Node getRight() {
		return right;
	}

	public boolean containsNode(String s) {
		if (data.compareTo(s) < 0) {
			if (right != null) {
				return right.containsNode(s);
			} else {
				return false;
			}
		} else if (data.compareTo(s) > 0) {
			if (left != null) {
				return left.containsNode(s);
			} else {
				return false;
			}
		} else if (data.compareTo(s) == 0) {
			return true;
		}
		return false;
	}

	public boolean insertNode(String s) {
		if (data.compareTo(s) < 0) {
			if (right != null) {
				return right.insertNode(s);
			} else {
				right = new BST_Node(s);
				return true;
			}
		} else if (data.compareTo(s) > 0) {
			if (left != null) {
				left.insertNode(s);
			} else {
				left = new BST_Node(s);
				return true;
			}
		} else if (data.compareTo(s) == 0) {
			return false;
		}
		return false;
	}

	public boolean removeNode(String s) {
		if (s.compareTo(this.data) <= 0) {
			if (this.left == null) {
				return false;
			}
			if (this.left.data.compareTo(s) != 0) {
				return this.left.removeNode(s);
			} else {
				if (this.left.right == null) {
					this.left = this.left.left;
				} else if (this.left.left == null) {
					this.left = this.left.right;
				} else if (this.left.right == null & this.left.left == null) {
					this.left = null;
				} else {
					this.left.right.findMin().left = this.left.left;
					this.left = this.left.right;
				}
				return true;
			}
		} else if (s.compareTo(this.data) > 0) {
			if (this.right == null) {
				return false;
			}
			if (this.right.data.compareTo(s) != 0) {
				return this.right.removeNode(s);
			} else {
				if (this.right.left == null) {
					this.right = this.right.right;
				} else if (this.right.right == null) {
					this.right = this.right.left;
				} else if (this.right.left == null & this.right.right == null) {
					this.right = null;
				} else {
					this.right.right.findMin().left = this.right.left;
					this.right = this.right.right;
				}
				return true;
			}
		}
		return false;
	}

	public BST_Node findMin() {
		// goes through node positions on far left of
		// BST, if there isn't a node after, returns the
		// current node
		BST_Node node = this;
		if (node.left != null) {
			node = node.left;
		} else {
			return node;
		}
		return node.findMin();
	}

	public BST_Node findMax() {
		// goes through node positions on far right of
		// BST, if there isn't a node after, returns
		// current node
		BST_Node node = this;
		if (node.right != null) {
			node = node.right;
		} else {
			return node;
		}
		return node.findMax();
	}

	public int getHeight() {
		if (left == null && right != null) {
			return right.getHeight() + 1;
		} else if (left != null && right == null) {
			return left.getHeight() + 1;
		} else if (left != null && right != null) {
			return Math.max(left.getHeight(), right.getHeight()) + 1;
		} else {
			return 0;
		}
	}

	public String toString() {
		return "Data: " + this.data + ", Left: " + ((this.left != null) ? left.data : "null") + ",Right: "
				+ ((this.right != null) ? right.data : "null");
	}
}
