class Solution:
    def finalValueAfterOperations(self, operations: List[str]) -> int:
        result = 0
        for string in operations:
            if string == "++X" or string == "X++":
                result += 1
            else:
                result -= 1
        
        return result