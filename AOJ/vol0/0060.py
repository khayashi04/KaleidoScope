while True:
	try: c1, c2, c3 = list(map(int,input().split()))
	except: break
	safe = 20 - (c1 + c2)
	deck = [i for i in range(1,11) if i <= safe and i != c1 and i != c2 and i != c3]
	print(["YES","NO"][len(deck) / 7 <= 0.5])