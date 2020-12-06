// Runtime: 0 ms, faster than 100.00% of Go online submissions for XOR Operation in an Array.
// Memory Usage: 2.1 MB, less than 22.22% of Go online submissions for XOR Operation in an Array.
func xorOperation(n int, start int) int {
	bucket := make([]int, n)

	for i := 0; i < n; i++ {
		bucket[i] = start + 2*i
	}

	res := bucket[0]
	for i := 1; i < n; i++ {
		res ^= bucket[i]
	}

	return res
}