
func maxSlidingWindow(nums []int, k int) []int {
	n := len(nums)
	if n == 0 {
		return nums
	}

	result := make([]int, n-k+1)
	dq := make([]int, 0)
	for i := 0; i < n; i++ {
		if len(dq) != 0 && dq[0] < i-k+1 {
			dq = dq[1:]
		}

		for len(dq) != 0 && nums[i] >= nums[dq[len(dq)-1]] {
			dq = dq[:len(dq)-1]
		}

		dq = append(dq, i)

		if i-k+1 >= 0 {
			result[i-k+1] = nums[dq[0]]
		}
	}

	return result
}