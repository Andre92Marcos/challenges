#!/bin/bash
curl -s -k -o - https://2018shell.picoctf.com/static/a3d311b507256d5d9299c0e94dfc4fc5/strings | strings | grep -oE picoCTF{.*} --color=none
