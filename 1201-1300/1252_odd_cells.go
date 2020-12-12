func oddCells(n int, m int, indices [][]int) int {
	res := make([][]int, n)
	count := 0

	for i := range res {
		res[i] = make([]int, m)
	}

	for i := range indices {
		row := indices[i][0]
		col := indices[i][1]

		// increment entire row by 1
		for y := 0; y < m; y++ {
			res[row][y]++
		}

		// increment entire col by 1
		for x := 0; x < n; x++ {
			res[x][col]++
		}
	}

	for i := range res {
		for j := range res[i] {
			if res[i][j]%2 == 1 {
				count++
			}
		}
	}

	return count
}