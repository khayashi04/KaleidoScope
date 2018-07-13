while True:
	try: d = int(input())
	except: break
	print(sum([(i*d)**2*d for i in range(600//d)]))