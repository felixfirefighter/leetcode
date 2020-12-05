func numIdenticalPairs(nums []int) int {
	res := 0

	for i := 0; i < len(nums)-1; i++ {
		for j := i + 1; j < len(nums); j++ {
			if nums[i] == nums[j] {
				res++
			}
		}
	}

	return res
}

// Runtime: 0 ms, faster than 100.00% of Go online submissions for Number of Good Pairs.
// Memory Usage: 2.1 MB, less than 13.04% of Go online submissions for Number of Good Pairs.
func numIdenticalPairs(nums []int) int {
	res := 0
	var count [101]int
	for _, num := range nums {
		res += count[num]
		count[num]++
	}

	return res
}