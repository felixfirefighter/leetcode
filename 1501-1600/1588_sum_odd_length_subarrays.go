// O(N^3)
// Runtime: 0 ms, faster than 100.00% of Go online submissions for Sum of All Odd Length Subarrays.
// Memory Usage: 2.1 MB, less than 33.91% of Go online submissions for Sum of All Odd Length Subarrays.
func sumOddLengthSubarrays(arr []int) int {
	res := 0

	// start with length of 1
	length := 1

	for length <= len(arr) {
		// the start index of the subarray
		start := 0
		for start+length <= len(arr) {

			// loop through the subarray and add them to res
			for i := start; i < length+start; i++ {
				res += arr[i]
			}

			// increment start index
			start++
		}

		// we only care about odd length
		length += 2
	}

	return res
}

// O(n)
// Runtime: 0 ms, faster than 100.00% of Go online submissions for Sum of All Odd Length Subarrays.
// Memory Usage: 2.1 MB, less than 33.91% of Go online submissions for Sum of All Odd Length Subarrays.
// https://leetcode.com/problems/sum-of-all-odd-length-subarrays/discuss/867779/Java-O(n)-time-with-Video-explanation
func sumOddLengthSubarrays(arr []int) int {
	res := 0
	n := len(arr)

	for i := 0; i < n; i++ {
		start := n - i
		end := i + 1
		total := start * end
		odd := total / 2
		if total%2 == 1 {
			odd++
		}

		res += odd * arr[i]
	}

	return res
}