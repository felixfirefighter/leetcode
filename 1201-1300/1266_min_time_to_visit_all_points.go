func minTimeToVisitAllPoints(points [][]int) int {
	res := 0

	for i := 1; i < len(points); i++ {
		x := abs(points[i][0] - points[i-1][0])
		y := abs(points[i][1] - points[i-1][1])
		res += max(x, y)
	}

	return res
}

func max(a int, b int) int {
	if a > b {
		return a
	}

	return b
}

func abs(a int) int {
	if a < 0 {
		return -a
	}

	return a
}