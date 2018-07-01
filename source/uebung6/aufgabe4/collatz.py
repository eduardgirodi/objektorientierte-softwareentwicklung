import sys

def collatz(n):
	print(n)
	while (n > 1):
		if (n % 2 == 0):
			n = int(n / 2)
		else:
			n = 3 * n + 1
		print(n)
	return

if (len(sys.argv) == 2):
	collatz(int(sys.argv[1]))
else:
	print("Falsche Anzahl an Argumenten")
