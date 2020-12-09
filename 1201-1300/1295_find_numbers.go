func findNumbers(nums []int) int {
	res := 0

	for _, num := range nums {
		digit := 0
		for num > 0 {
			num /= 10
			digit++
		}

		if digit%2 == 0 {
			res++
		}
	}

	return res
}