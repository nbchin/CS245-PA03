
public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		// TODO Auto-generated method stub
		
			  
	        for (int i = 0; i < a.length - 1; i++)
	        {
	            int index = i;
	            for (int j = i + 1; j < a.length; j++)
	                if (a[j] < a[index]) 
	                    index = j;
	      
	            int smallerNumber = a[index];  
	            a[index] = a[i];
	            a[i] = smallerNumber;
	        }
	        
		
	}

}
