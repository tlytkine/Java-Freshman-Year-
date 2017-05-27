import java.util.*;


	public class BinaryTree {

	static ExtBSTNode root;
		public ExtBSTNode build_BST(int arr[], int start, int end){
		if (start>end){
		return null;
		}
		int mid = (start+end) / 2;
		ExtBSTNode node = new ExtBSTNode(arr[mid]);
			node.left = build_BST(arr, start, mid - 1);
			node.right = build_BST(arr, mid + 1, end);
			return node;
		}
		public static void permute_array(int[] a){
			int n = a.length;
			Random random = new Random();
			random.nextInt();
			for (int i = 0; i < n; i++) {
					int change = i + random.nextInt(n-i);
					swap(a, i, change);
			}
		}

		private static void swap(int[]a, int i, int change){
			int helper = a[i];
			a[i] = a[change];
			a[change] = helper;
		}
			void preOrder(ExtBSTNode node){
			if (node==null){
			return;
			}
			System.out.print(node.data + " ");
			preOrder(node.left);
			preOrder(node.right);
		}
		public static int Compute_avgDepth(ExtBSTNode root){
		if(root!=null){
		return 1+
		Math.max(Compute_avgDepth(root.left),Compute_avgDepth( root.right));
		}
		else {
		return 0;
		}
		}
		class ExtBSTNode {
			int data;
			ExtBSTNode left, right;

			ExtBSTNode(int d){
			data = d;
			left = right = null;
			}
		}
	}