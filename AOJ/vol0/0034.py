while 1:
	ans = 0
	try: l=list(map(int,input().split(',')))
	except: break
	s2,s1=l.pop(),l.pop()
	t=sum(l)/(s1+s2)
	x=s1*t
	for i in range(10):	
		ans = ans + l[i]
		if ans >= x: break
	print(i+1)