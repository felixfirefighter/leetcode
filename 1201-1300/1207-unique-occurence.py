class Solution:
    def uniqueOccurrences(self, arr: List[int]) -> bool:
        # count the occurence of each number
        num_dict = {}
        for num in arr:
            if num in num_dict:
                num_dict[num] += 1
            else:
                num_dict[num] = 1
                
        # Remember that the keys in num_dict are unique
        # if the count of values of dict is the same as the count
        # of the keys(unique), it also means the number of occurence is unique as well
        return len(num_dict) == len(set(num_dict.values()))