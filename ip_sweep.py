import platform    
import subprocess  

# ex (google.com) (127.0.0.) (192.168.0.)
hostname =  input("please enter ip in XXX.XXX.XXX. format:  ")

def ping(host):

    param1 = '-n' if platform.system().lower()=='windows' else '-c'
    param2 = '-w' if platform.system().lower()=='windows' else '-w'
    command = ['ping', param1, '1', param2, '1', host]
    return subprocess.call(command) == 0

for ip in range(1,11):
    temp = hostname + str(ip)
    response = ping(temp)
    if response:
        print (temp, 'is up!')
    else:
        print (temp, 'is down!')
