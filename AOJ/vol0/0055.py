while 1:
	try:
		x = float(input())
	except:
		break
	s=x
	for i in range(9):
		if i % 2 == 0:
			s = s*2
			x+=s
		if i % 2 == 1:
			s = s/3
			x+=s
	print(x)