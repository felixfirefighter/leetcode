class Solution:
    def groupThePeople(self, group_sizes: List[int]) -> List[List[int]]:
        # split each person into different group depending on group size
        # use a dictionary for grouping
        result = []
        groups = {}
        for i, group_size in enumerate(group_sizes):
            # initialize an empty array if group size is not
            # found
            if group_size not in groups:
                groups[group_size] = []

            groups[group_size].append(i)

            # add the group to result array when the group size is reached
            # then reset that group back to empty
            if len(groups[group_size]) == group_size:
                result.append(groups[group_size])
                groups[group_size] = []
        return result
