func maximumWealth(accounts [][]int) int {
	max := 0

	for _, account := range accounts {
		cur := 0
		for _, cash := range account {
			cur += cash
		}

		if cur > max {
			max = cur
		}
	}

	return max
}