#!/bin/bash
(echo "root"; echo "password1") | nc  2018shell.picoctf.com 38860 | cut -d " " -f3