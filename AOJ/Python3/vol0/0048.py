h = {48:"light fly", 51:"fly", 54:"bantam", 57:"feather", 60:"light" , 64:"light welter", 69:"welter", 75:"light middle", 81:"middle", 91:"light heavy"}
while 1:
	try: w = float(input())
	except: break
	for i, x in sorted(h.items()):
		if w <= i: 
			print(h[i])
			break
	else: print("heavy")
