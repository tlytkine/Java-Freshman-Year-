import java.util.*;


// Part 1A 
public class BTNode <T> {
	private T data;
	private BTNode <T> left, right;


// Part 1B 

// Getter methods for private fields
public T getData(){
	return data;
}
public BTNode<T> getLeft(){
	return left;
}
public BTNode<T> getRight(){
	return right; 
}

// Setter methods for private fields 
public void setData(T newData){
      data = newData;
   }                                                               
public void setLeft(BTNode<T> newLeft){                    
      left = newLeft;
   }
public void setRight(BTNode<T> newRight){                    
      right = newRight;
   }  

// Part 1C 
// Constructor for BTNode class, takes arguments for data value
// and left & right children of the node.
public BTNode(T xData,BTNode<T> xLeft, BTNode<T> xRight){
	data = xData;
	left = xLeft;
	right = xRight;
}
// Part 1D 
// Boolean method isLeaf() which returns true if the node is a leaf, false otherwise 
public boolean isLeaf (){
	return(left == null) && (right ==null);
}
// Part 1E getLeftMost() and getRightMost() (two recursive methods to return data 
// values of left-most and right-most leaves in the tree)
public T getLeftMost(){
	if(left==null){
		return data;
	}
	else {
		return left.getLeftMost();
	}
}
public T getRightMost(){
	if(left==null){
		return data;
	}
	else {
		return left.getRightMost();
	}
}
// Part 1F 
// preorderPrint()
public void preorderPrint() {
	System.out.println(data);
	if (left != null)
		left.preorderPrint();
	if (right != null)
		right.preorderPrint();
}
// inorderPrint()
public void inorderPrint() {
	if (left != null)
		left.inorderPrint();
	System.out.println(data);
	if (right!= null)
		right.inorderPrint();
}
// postorderPrint()
public void postorderPrint(){
	if (left != null)
		left.postorderPrint();
	if (right != null)
		right.postorderPrint();
	System.out.println(data);
}


}



