sq=ss=0
while 1:
	try: a,b,c=map(int,input().split(','))
	except: break
	if a**2 + b**2 == c**2:
		sq+=1
	elif a == b:
		ss+=1
print(sq)
print(ss)