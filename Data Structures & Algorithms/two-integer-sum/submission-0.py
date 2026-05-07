class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:

        visited_nums = {}

        for i, num in enumerate(nums):
            complement = target - num
            if complement in visited_nums:
                return [visited_nums[complement], i]
            visited_nums[num] = i