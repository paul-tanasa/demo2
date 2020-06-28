public class Train extends Ticket {
    private int current_capacity;
    private int totalCapacity = 6;

    // Constructor
    public Train(int capacity) {
        current_capacity = capacity;
    }

    // Getters
    public int getCapacity() { 
    	return(current_capacity++); 
    }

    // Setters
    public void setCapacity(int capacity) { 
    	capacity = current_capacity; 
    }

    public String addPassenger(int capacity){
        if(totalCapacity <= capacity){
            return "\nTotal Capacity Reached. No more are permitted to board the train.";
        }
        return "";
    }
    
    // To find gap between elements
    private int nextGap(int gap) {
        // Shrink gap by Shrink factor
        gap = (gap * 10) / 13;
        return (gap < 1) ? 1 : gap;
    }

    /**
     * Function to sort arr[] using Comb
     *
     * @param arr - an array should be sorted
     * @return sorted array
     */
    @Override
    public <T extends Comparable<T>> T[] sort(T[] arr) {
        int size = arr.length;

        // initialize gap
        int gap = size;

        // Initialize swapped as true to make sure that loop runs
        boolean swapped = true;

        // Keep running while gap is more than 1 and last iteration caused a swap
        while (gap != 1 || swapped) {
            // Find next gap
            gap = nextGap(gap);

            // Initialize swapped as false so that we can check if swap happened or not
            swapped = false;

            // Compare all elements with current gap
            for (int i = 0; i < size - gap; i++) {
                if (less(arr[i + gap], arr[i])) {
                    // Swap arr[i] and arr[i+gap]
                    swapped = swap(arr, i, i + gap);
                }
            }
        }
        return arr;
    }

}
