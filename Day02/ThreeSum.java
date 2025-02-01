import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        List<List<Integer>> ans = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            if (arr[i] > 0) break;
            if (i > 0 && arr[i] == arr[i - 1]) continue; // Skip duplicate elements for 'i'

            int l = i + 1, r = n - 1;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum < 0) l++;
                else if (sum > 0) r--;
                else {
                    ans.add(Arrays.asList(arr[i], arr[l], arr[r]));

                    while (l < r && arr[l] == arr[l + 1]) l++; // Skip duplicate elements for 'l'
                    while (l < r && arr[r] == arr[r-1]) r--; // Skip duplicate elements for 'r'
                    
                    l++;
                    r--;
                }
            }
        }
        return ans;
    }
}

class Main {
    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] testCases = {
                {-1, 0, 1, 2, -1, -4},
                {0, 1, 1, 1},
                {0, 0, 0, 0},
                {-2, 0, 1, 1, 2},
                {-1, -1, -1, 2, 2}
        };


        for (int[] arr : testCases) {
            List<List<Integer>> result = solution.threeSum(arr);
            System.out.println("Input: " + Arrays.toString(arr) + ", Output: " + result);
        }

    }
}