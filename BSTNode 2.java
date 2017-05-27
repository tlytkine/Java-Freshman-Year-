
	public class BSTNode extends BTNode<T>{

	public boolean search(int k){
		if (data==k){
			return true;
		}
		if (data < k){
			if(left ==null){
				return false;
			}
			if(left!=null){
				search(getLeft());
			}
		}
		if (data > k){
			if(right==null){
				return false;
			}
			if(right!=null){
				search(getRight());
			}
		}

	}
	public void insertValue(int k){
		if (k < data){
			if(left == null) {
				left.insertValue(k);
			}
			if(left!=null){
				getLeftMost.insertValue(k);
			}
		}
		if (k > data){
			if(right==null){
				right.insertValue(k);
			}
		}
		if(right!=null){
			getRightMost.insertValue(k);
		}
		
	}
}
