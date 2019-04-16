
while(1):
	n = int(input())
	if n == 0: break
	ap = 0
	bp = 0
	for i in range(n):
		a,b = map(int,input().split())
		if a > b: ap = a + b + ap
		elif a < b: bp = a + b + bp
		elif a == b: ap = a + ap; bp = b + bp
	print(ap,bp)