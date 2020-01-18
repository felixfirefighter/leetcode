class Solution:
  def twoSum(self, nums: List[int], target: int) -> List[int]:
    dic = {}
    for index, num in enumerate(nums):
      # target = num + m
      m = target - num

      # return the indices of m and num if m is found in
      # the dictionary
      if m in dic:
        return [dic[m], index]
      # store num as key and its index as value in dictionary
      else:
        dic[num] = index