import json

configsFile = open('incidents.json')
json1_str = configsFile.read()
json_data = json.loads(json1_str)
tickets = json_data['tickets']
src_ips = {}
for ticket in tickets:
	src_ip = ticket['src_ip'] 
	if src_ip not in src_ips:
		src_ips[src_ip]=1
	else:
		src_ips[src_ip] = src_ips[src_ip] +1
print(src_ips)

files = {}
for ticket in tickets:
	file_hash = ticket['file_hash'] 
	dst_ip = ticket['dst_ip']
	if file_hash not in files:
		files[file_hash]=[dst_ip]
	else:
		arrayFilesHash = files[file_hash]
		print(arrayFilesHash)
		arrayFilesHash.append(dst_ip)
		files[file_hash] = arrayFilesHash

print(files)