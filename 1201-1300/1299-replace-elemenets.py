class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        # loop from the second last element, set max_value as -1 initially
        # we will set max_value to be the current element if current element
        # has higher value
        max_value = -1
        for i in range(len(arr) - 1, -1, -1):
            temp = arr[i]
            arr[i] = max_value
            max_value = max(temp, max_value)
        return arr
            