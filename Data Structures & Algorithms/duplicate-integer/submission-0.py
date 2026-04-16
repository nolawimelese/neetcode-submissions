class Solution:
    def hasDuplicate(self, nums: List[int]) -> bool:
        checked_numbers = set()
        for num in nums:
            if num in checked_numbers:
                return True
            else:
                checked_numbers.add(num)
        return False