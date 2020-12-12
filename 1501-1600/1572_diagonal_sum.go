func diagonalSum(mat [][]int) int {
	res := 0
	row := 0
	col := 0
	n := len(mat)

	for row < n && col < n {
		res += mat[row][col]

		if (n - row - 1) != row {
			res += mat[n-row-1][col]
		}

		row++
		col++
	}

	return res

}