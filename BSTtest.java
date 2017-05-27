		public class BSTtest {

		public static void main(String[]args){
		int D = 0;
		int []A={0,1,2,3,4,5,6,7,8,9,10,11,12,13,14};
		int e = A.length;
		int s = A[1];
		int m = (s + e) / 2;
		for(int i=1;i<=100;i++){
		BinaryTree test = new BinaryTree();
		test.permute_array(A);
		test.build_BST(A, s, e);
		this.node = this.ExtBSTNode;
		int AvgD = AvgD + test.Compute_avgDepth(T);
		int AVG = AvgD / 100;
		System.out.println("Avergage depth is " + AVG);
		}
		}
	}