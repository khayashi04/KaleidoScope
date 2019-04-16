ti = int(input())
for i in range(ti):
	x = list(input())
	print(int(''.join(sorted(x,reverse=True))) - int(''.join(sorted(x))))