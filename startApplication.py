# -*- coding: utf-8 -*-

import os
import subprocess

findApplication="find . -name '*.jar'|grep .*application.*"

if __name__=="__main__":
    ret1=os.popen(findApplication)
    #print(*ret1)
    startCmd="java -jar {0} & > {1}.log"
    for tmp in ret1.readlines():
        realCmd=startCmd.format(tmp,tmp[:tmp.find(".jar")])
        print(realCmd)


