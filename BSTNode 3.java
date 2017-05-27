
	public class BSTNode extends BTNode{
	private BTNode left;
	private BTNode right;
	// Part 1A
	private BTNode parent; 
	private int value;


	public BSTNode(int value, BTNode left, BTNode right, BTNode parent){
		this.value = value;
		this.left = null;
		this.right = null;
		this.parent = parent;
	}


	public void search(int k){
		if (this.data==k){
			return true;
		}
		if (this.data < k){
			if(this.left ==null){
				return false;
			}
			if(this.left!=null){
				search(getLeft());
			}
		}
		if (this.data > k){
			if(this.right==null){
				return false;
			}
			if(this.right!=null){
				return search(getRight());
					
				}
			}
		}

	
	public void insertValue(int k){
		// Part 1B
		if (this.parent == null){
			this.parent.insertValue(k);
		}
		if (k < this.data){
			if(this.left == null) {
				this.left.insertValue(k);
			}
			if(this.left!=null){
				getLeftMost.insertValue(k);
			}
		}
		if (k > this.data){
			if(right==null){
				this.right.insertValue(k);
			}
		}
		if(this.right!=null){
			getRightMost.insertValue(k);
		}
		
	}
	// Part 2A
	public void BSTSuccessor(BSTNode x){
 		if (x.right != null) {
 			return BSTMinimum(x.right);
 		}
 		y=x.parent;
 		while ((y != null) && (x == y.right) ) {
 		x=y; 
 		r = r.left;
 		y = y.p;
 		}
 		return y;
		}
	
	// Part 2B
	public void BSTPredecessor(BSTNode x){
	BTNode y;
	BTNode p;
	BTNode r;
		if (x.left != null) {
		return BSTMinimum(x.left);
		}
 		y=x.p;
 		while ((y != null) && (x == y.left) ) {
 		x=y; 
 		r=r.right;
 		y=y.p;
 		}
 		return y;
		}
	}

	

