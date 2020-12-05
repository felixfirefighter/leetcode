func decompressRLElist(nums []int) []int {
	var res []int
	for i := 0; i < len(nums)-1; i += 2 {
		freq := nums[i]
		val := nums[i+1]

		for j := 0; j < freq; j++ {
			res = append(res, val)
		}
	}

	return res
}