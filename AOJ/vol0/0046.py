li = []
while 1:
	try: li.append(float(input()))
	except: break
print(max(li) - min(li))