
// https://leetcode.com/problems/pairs-of-songs-with-total-durations-divisible-by-60/discuss/256738/JavaC%2B%2BPython-Two-Sum-with-K-60
func numPairsDivisibleBy60(time []int) int {
	var count [60]int
	res := 0
	for _, t := range time {
		res += count[(60-t%60)%60]
		count[t%60]++
	}

	return res
}