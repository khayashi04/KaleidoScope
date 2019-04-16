n = int(input())
for i in range(n):
	li  = sorted(map(int, input().split()))
	if(pow(li[0], 2) + pow (li[1], 2) == pow(li[2], 2)):
		print('YES')
	else:
		print('NO')