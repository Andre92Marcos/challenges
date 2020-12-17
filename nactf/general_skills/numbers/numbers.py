import sys

def main(argv):

    numbers = argv[0].split(',')
    s = ""
    for c in numbers:
        s = s + chr(int(c)-1)
    print(s)
if __name__ == '__main__':
    main(sys.argv[1:])
