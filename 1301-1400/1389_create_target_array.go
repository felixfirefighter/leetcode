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