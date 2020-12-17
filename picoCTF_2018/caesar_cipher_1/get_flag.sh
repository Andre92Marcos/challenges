#!/bin/bash
FLAG=$(for i in {1..26}; do cat ciphertext | cut -d "{" -f 2 | cut -d "}" -f 1 | caesar $i; done | head -n 11 | tail -n 1)
echo "picoCTF{"$FLAG"}"
