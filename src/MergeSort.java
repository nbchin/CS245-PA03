
public class MergeSort implements SortingAlgorithm {
	
	private int[] nums;
	private int[] helpers;
	private int num;
	
	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		this.nums = a;
		this.helpers = new int[a.length];
		mergesort(0, a.length - 1);
	}

	private void mergesort(int low, int high) {
		if(low < high){
			int mid = low + (high - low) / 2;
			mergesort(low, mid);
			mergesort(mid + 1, high);
			merge(low, mid, high);
		}
		
	}

	private void merge(int low, int mid, int high) {
		for(int i = low; i <= high; i++){
			helpers[i] = nums[i];
		}
		int i = low, j = mid + 1, k = low;
		
		while (i <= mid && j <= high){
			if(helpers[i] <= helpers[j]){
				nums[k] = helpers[i];
				i++;
			} else {
				nums[k] = helpers[j];
				j++;
			}
			k++;
		}
		
		while (i <= mid){
			nums[k] = helpers[i];
			k++;
			i++;
		}
	}
	

}
