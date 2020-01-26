class Solution:
    def findNumbers(self, nums: List[int]) -> int:
        result = 0
        for num in nums:
            # convert int to str to get the length(digit)
            # of the number
            # even number is divisble by 2 without any
            # leftover
            if len(str(num)) % 2 == 0:
                result += 1
        return result
