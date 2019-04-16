i = 0
date = {}
while i < 50:
	try:
		s, w, h = list(map(float,input().split(",")))
	except:
		break
	date.update({int(s):w/h/h})
	i += 1
li = [i for i in date if date[i] >= 25]
for i in range(len(li)): print(li[i])