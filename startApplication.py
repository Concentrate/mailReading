# -*- coding: utf-8 -*-

import os
import subprocess
import shutil
import time

findApplication="find . -name '*.jar'|grep .*application.*"
logDir="logDir"
executeDir="executeDir"

def mkdirIfNot(tmp):
    if not os.path.exists(tmp):
        os.mkdir(tmp)

if __name__=="__main__":
    ret1=os.popen(findApplication)
    #print(*ret1)
    startCmd="java -jar {0}>> {1} &"
    mkdirIfNot(logDir)
    startAppList=['system','user','product','pay','promotion','order','search']
    readlines=ret1.readlines()
    startFiles=[]
    for a2 in startAppList:
        #print(a2)
        for tmp in readlines:
            #print(tmp)
            if(tmp.find(a2)!=-1):
                c1=tmp[:tmp.rfind('\n')]
                startFiles.append(c1)

    print(startFiles)
    for tmp in startFiles:
        logName=logDir+os.sep+tmp[tmp.rfind('/')+1:tmp.find('.jar')]+".log"
        realCmd=startCmd.format(tmp,logName)
        print(realCmd)
        os.system(realCmd)
        print("start to sleep,then execute next jar")
        SLEEP_TIME = 20
        time.sleep(SLEEP_TIME)


