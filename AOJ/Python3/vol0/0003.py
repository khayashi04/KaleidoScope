# AOJ vol0 0003.py
num = int(input())
for i in range(num):
	list_1  = sorted(map(int, input().split()))
	if list_1[0]**2 + list_1[1]**2 == list_1[2]**2:
		print('YES')
	else:
		print('NO')