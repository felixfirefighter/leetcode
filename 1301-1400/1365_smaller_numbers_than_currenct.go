// Counting
func smallerNumbersThanCurrent(nums []int) []int {
	var count [101]int
	res := make([]int, len(nums))

	for i := 0; i < len(nums); i++ {
		count[nums[i]]++
	}

	for i := 1; i <= 100; i++ {
		count[i] += count[i-1]
	}

	for i := 0; i < len(nums); i++ {
		if nums[i] == 0 {
			res[i] = 0
		} else {
			res[i] = count[nums[i]-1]
		}
	}

	return res
}