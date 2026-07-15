class Solution:
    def singleNumber(self, nums: List[int]) -> int:
        fre = {}
        for i in nums:
            fre[i] = fre.get(i,0)+1
        for key, value in fre.items():
            if fre[key] == 1:
                return key
        
            
        