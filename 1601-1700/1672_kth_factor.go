func kthFactor(n int, k int) int {
	var buc []int

	for i := 1; i*2 <= n; i++ {
		if n%i == 0 {
			buc = append(buc, i)
		}
	}

	buc = append(buc, n)

	if k > len(buc) {
		return -1
	}

	return buc[k-1]
}