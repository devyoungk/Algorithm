def isprime(n):
    for i in range(2,int(n**0.5)+1):
        if n%i == 0:
            return False
    return True

def solution(nums):
    n = len(nums)
    count = 0
    for i in range(0,n-2):
        for j in range(i+1,n-1):
            for k in range(j+1,n):
                sum = nums[i]+nums[j]+nums[k]
                if isprime(sum):
                    count += 1
    return count