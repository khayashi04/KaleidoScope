while True:
	try: x = list(map(int,input()))
	except: break
	for i in range(10,1,-1): 
		for n in range(1,i): 
			x[n-1] = (x[n-1] + x[n]) % 10
	print(x[0])