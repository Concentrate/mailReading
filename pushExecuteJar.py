# -*- coding: utf-8 -*-

import os
import subprocess
import shutil

findApplication="find . -name '*.jar'|grep .*application.*"
logDir="logDir"
executeDir="executeDir"
mvnPackage="mvn package mvn package -Dmaven.test.skip=true"
pushToYun="python3 ~/myScripts/yun/push_to_yun.py {0}"

def mkdirIfNot(tmp):
    if not os.path.exists(tmp):
        os.mkdir(tmp)
def mvnPackage():
    ret1=os.popen(mvnPackage)
    for line in ret1.readlines():
        print(line)

def pushFile():
    ret1=os.popen(pushToYun)
    for line in ret1.readlines():
        print(line)

if __name__=="__main__":
    mvnPackage()
    ret1=os.popen(findApplication)
    #print(*ret1)
    shutil.rmtree(executeDir)
    startCmd="java -jar {0}>> {1} &"
    mkdirIfNot(executeDir)
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
    for aFile in startFiles:
        target=executeDir+os.sep+aFile[aFile.rfind('/'):]
        #print(target)
        shutil.copy(aFile,target)
        print('copy to {0},exists {1}'.format(target,os.path.exists(target)))
    pushFile()
