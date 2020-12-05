func canPlaceFlowers(flowerbed []int, n int) bool {
	res := 0
	count := 1

	for i := 0; i < len(flowerbed); i++ {
		if flowerbed[i] == 0 {
			count++
		} else {
			res += (count - 1) / 2
			count = 0
		}
	}

	if count != 0 {
		res += count / 2
	}

	return res >= n
}