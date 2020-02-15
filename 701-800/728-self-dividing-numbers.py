class Solution:
    def selfDividingNumbers(self, left: int, right: int) -> List[int]:
        is_self_dividing = lambda num: all(digit != '0' and num % int(digit) == 0 for digit in str(num))
        return filter(is_self_dividing, range(left, right + 1))