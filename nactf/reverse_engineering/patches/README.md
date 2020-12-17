By opening the file in ghidra we can see that the main function only calls the goodbye function and then exits.

But we can also see that there is a print_flag function that is never called. So we can simply patch the call of the goodbye function to instead call print_flag

We do this by patching the CALL instruction in the main method to goodbye and changing it to print_flag.

After that we run the plugin/script SavePatch.py and run the output program

# nactf{unl0ck_s3cr3t_funct10n4l1ty_w1th_b1n4ry_p4tch1ng_L9fcKhyPupGVfCMZ}
