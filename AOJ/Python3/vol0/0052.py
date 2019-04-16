import math
while True:
	x = int(input())
	if x == 0: break
	n = list(str(math.factorial(x)))
	con = 0
	for i in range(len(n)-1,0,-1):
		if n[i] != '0':
			break
		con += 1
	print(con)