class Solution:
    def replaceElements(self, arr: List[int]) -> List[int]:
        # loop from the last element, set max_value as -1 initially
        # we will set max_value to be the current element if current element
        # has higher value
        max_value = -1
        for i in range(len(arr) - 1, -1, -1):
            # store the current value in a temp variable
            temp = arr[i]
            
            # update current element first as we need to replace
            # every element with the greatest element to its right,
            # even the current element is greater
            arr[i] = max_value
            
            # update max value if temp is greater
            if max_value < temp:
              max_value = temp
        return arr
            