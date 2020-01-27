class Solution:
    def subtractProductAndSum(self, n: int) -> int:
        # convert n into str
        # get each digit from str n
        # convert digit back to int
        # put them into an array
        arr = [int(digit) for digit in str(n)]

        sum_digit = sum(arr)
        prod_digit = 1
        for digit in arr:
            prod_digit *= digit

        return prod_digit - sum_digit
