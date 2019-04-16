while 1:
	li=[]
	w = list(2**i for i in range(10))
	try: a = int(input())
	except: break
	for i in range(9,-1,-1):
		if w[i] <= a:
			a = a - w[i]
			li.append(w[i])
	li.reverse()
	for i in li: 
		if i == li[len(li)-1]:
			print(i)
		else:
			print(i, end=' ')