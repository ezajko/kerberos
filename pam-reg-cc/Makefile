all: pam_reg_cc.so

pam_reg_cc.so: pam_reg_cc.c
	gcc -fPIC -fno-stack-protector -c pam_reg_cc.c
	ld -x --shared -o pam_reg_cc.so  pam_reg_cc.o -lkeyutils -lkrb5 -lk5crypto -lcom_err -lkrb5support -lc

install: all
	cp pam_reg_cc.so /lib64/security
	cp pam_reg_cc.8 /usr/share/man/man8

installu14: all
	cp pam_reg_cc.so /lib/x86_64-linux-gnu/security/pam_reg_cc.so
	cp pam_reg_cc.8 /usr/share/man/man8
	cp rukerb /usr/share/pam-configs/rukerb



