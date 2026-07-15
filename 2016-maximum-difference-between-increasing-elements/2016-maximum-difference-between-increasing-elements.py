class Solution:
    def maximumDifference(self, nums: List[int]) -> int:
        min_num = float('inf')
        max_diff = -1
        for i in nums:
            min_num = min(min_num, i)
            diff = i - min_num
            max_diff = max(diff, max_diff)
        if max_diff == 0:
            return -1
        return max_diff
        