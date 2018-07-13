for i in range(int(input())):
	a=b=c=0
	for j in map(int,input().split()):
		if j > b:
			b=j
		elif j > c: 
			c=j
		else: 
			a=1
	if a==0:
		print('YES')
	else:
		print('NO')