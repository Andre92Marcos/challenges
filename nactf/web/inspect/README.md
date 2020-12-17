The flag is hidden inside the css file. You can get it by instectin the file (which seems to be the intended way) or use

```
	wget -r -np -k http://inspect.challenges.nactf.com/

```

to get all the resources and then use

```
	grep -r "nactf" . | gawk '{print $(NF-1)}'

```

to get the flag

# nactf{1nspect1ng_sp13s_4_lyf3}
