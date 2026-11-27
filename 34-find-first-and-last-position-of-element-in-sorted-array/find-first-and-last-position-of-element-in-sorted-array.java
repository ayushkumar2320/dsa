class Solution {
    public int[] searchRange(int[] nums, int target) {

        int first = lowerBound(nums, target);
        int last = upperBound(nums, target) - 1;

        if (first == nums.length || nums[first] != target) {
            return new int[]{-1, -1};
        }

        return new int[]{first, last};
    }

    int lowerBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] >= target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }

    int upperBound(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        while (left < right) {
            int mid = left + (right - left) / 2;

            if (arr[mid] > target) {
                right = mid;
            } else {
                left = mid + 1;
            }
        }

        return left;
    }
}