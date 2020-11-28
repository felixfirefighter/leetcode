func longestSubstring(s string, k int) int {
	if len(s) == 0 {
		return 0
	}

	if k < 2 {
		return len(s)
	}

	return helper(s, 0, len(s), k)
}

func helper(s string, l int, r int, k int) int {
	if l >= r {
		return 0
	}

	var freq [26]int
	for i := l; i < r; i++ {
		freq[s[i]-'a']++
	}

	valid := true
	for i := 0; i < 26 && valid; i++ {
		if freq[i] > 0 && freq[i] < k {
			valid = false
		}
	}

	if valid {
		return r - l
	}

	best := 0
	start := l
	for i := l; i < r; i++ {
		if freq[s[i]-'a'] < k {
			best = max(best, helper(s, start, i, k))
			start = i + 1
		}
	}

	best = max(best, helper(s, start, r, k))
	return best
}

func max(a int, b int) int {
	if a > b {
		return a
	}

	return b
}