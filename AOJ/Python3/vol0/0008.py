# AOJ vol0 0008.py
ans=[0]*51
for a in range(10):
	for b in range(10):
		for c in range(10):
			for d in range(10):
				ans[a + b + c + d] += 1 
while 1:
	try:
		print(ans[int(input())])
	except:
		break	