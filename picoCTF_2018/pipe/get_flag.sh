#!/bin/bash
nc -d 2018shell.picoctf.com 34532 | grep -oE picoCTF{.*} --color=none
