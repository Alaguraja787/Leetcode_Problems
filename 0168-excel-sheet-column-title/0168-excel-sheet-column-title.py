class Solution:
    def convertToTitle(self, columnNumber: int) -> str:
        res = ""
        while columnNumber != 0:
            columnNumber -=1
            temp = columnNumber%26
            res = chr(temp+65) + res
            columnNumber //= 26
        return res

            
        