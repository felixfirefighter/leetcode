// Runtime: 0 ms, faster than 100.00% of Go online submissions for Create Target Array in the Given Order.
// Memory Usage: 2.1 MB, less than 46.81% of Go online submissions for Create Target Array in the Given Order.
func createTargetArray(nums []int, index []int) []int {
	// Create an array big enough to hold all elements
	res := make([]int, len(nums))

	// loop through nums and index
	for i := 0; i < len(nums); i++ {
		// Shift element to the right by 1
		copy(res[index[i]+1:], res[index[i]:])

		// Assign the num at the required index
		res[index[i]] = nums[i]
	}

	return res
}