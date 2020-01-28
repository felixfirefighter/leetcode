class Solution:
    def numJewelsInStones(self, J: str, S: str) -> int:
        # store character from J in a dictionary
        # char in J is distinct
        jewel_dict = {}
        for char in J:
            jewel_dict[char] = 1

        # increment count by 1
        # if the current character in S can be found
        # in jewel_dict
        count = 0
        for char in S:
            if char in jewel_dict:
                count += 1
        return count
