func uniqueMorseRepresentations(words []string) int {
	keys := [26]string{".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."}

	set := make(map[string]bool)

	for i := 0; i < len(words); i++ {
		var sb strings.Builder
		for _, c := range words[i] {
			sb.WriteString(keys[int(c)-'a'])
		}
		set[sb.String()] = true
	}

	return len(set)
}