import itertools
while 1:
	n,s=map(int,input().split())
	if n == 0: break
	print(sum(1 for nums in itertools.combinations([i for i in range(10)],n) if sum(nums) == s))