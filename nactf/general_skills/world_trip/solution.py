from geopy.geocoders import Nominatim
import sys
import re

def main(args):
    coordinates = re.findall("\(.*?,.*?\)", args)
    flag = ''
    for coor in coordinates:
        coor = coor[1:-1]
        geolocator = Nominatim(user_agent="i dont have an app")
        location = geolocator.reverse(coor , language='en')
        country = location.address.split(',')[-1]
        flag = flag + country.strip()[0]
    print("nactf{" + flag + "}")

if __name__ == '__main__':
    main(sys.argv[1])
