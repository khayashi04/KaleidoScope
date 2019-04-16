import math
n = []
li = [] 
li = [i for i in range(2,10000)]
while li[0] <= int(math.sqrt(10000)):
	n.append(li[0]) 
	sss = li[0] 
	li = [i for i in li if i % sss != 0] 
n.extend(li) 

while True:
	ans = 0
	x = int(input())
	if x == 0: break
	for i in range(x):
		ans += n[i]
	print(ans)