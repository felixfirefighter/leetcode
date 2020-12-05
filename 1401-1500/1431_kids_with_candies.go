func kidsWithCandies(candies []int, extraCandies int) []bool {
	max := 0
	res := make([]bool, len(candies))

	for _, candies := range candies {
		if max < candies {
			max = candies
		}
	}

	for i, candies := range candies {
		if candies+extraCandies >= max {
			res[i] = true
		}
	}

	return res
}