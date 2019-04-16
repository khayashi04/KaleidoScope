counter = -1
train = []
while True:
	try:
		x = int(input())
	except:
		break
	if x == 0 and len(train) != 0:
		print(train[counter])
		train.remove(train[counter])
		counter -= 1
	else:
		train.append(x)
		counter += 1