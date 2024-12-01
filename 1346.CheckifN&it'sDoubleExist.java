class Solution {
    public static boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();
        
        // Traverse the array
        for (int num : arr) {
            // Check if the double of current number or half of the current number exists
            if (set.contains(num * 2) || (num % 2 == 0 && set.contains(num / 2))) {
                return true;
            }
            // Add the current number to the set
            set.add(num);
        }
        
        // If no such pair is found, return false
        return false;
    }
    
    public static void main(String[] args) {
        // Example test case
        int[] arr = {10, 2, 5, 3};
        
        if (checkIfExist(arr)) {
            System.out.println("Yes, there exists a number and its double in the array.");
        } else {
            System.out.println("No, there is no number and its double in the array.");
        }
    }
        
    }
