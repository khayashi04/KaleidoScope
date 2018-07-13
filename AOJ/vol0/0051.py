while True:
	x = int(input())
	for i in range(x):
		try:
			li = list(input())
		except:
			break
		li1 = int("".join(sorted(li)))
		li2 = int("".join(sorted(li,reverse=True)))
		print(li2-li1)