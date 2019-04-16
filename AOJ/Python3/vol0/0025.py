while 1:
	hit = blow = 0
	try: a = list(map(int,input().split()))
	except: break
	b = list(map(int,input().split()))
	for i in range(4):
		if a[i] == b[i]:
			hit += 1
		elif a[i] in b:
			blow += 1
	print(hit, blow)