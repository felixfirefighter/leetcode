class Solution:
    def repeatedNTimes(self, A: List[int]) -> int:
        # for a number to be repeated N time in a 2N array,
        # it has to either right beside each other [1,2,3,3]
        # or alternated [1,2,3,2]
        # the exception is something like this [2,1,3,2]
        # this case, the last element is the answer
        for i in range(len(A) - 2):
            if A[i] == A[i + 1] or A[i] == A[i + 2]:
                return A[i]
        return A[len(A) - 1]