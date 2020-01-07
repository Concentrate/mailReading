# -*- coding: utf-8 -*-
import os

if __name__=="__main__":
    topicList=['ProductUpdate','PAY_REFUND_SUCCESS','ProductSpuCollection','PAY_TRANSACTION_SUCCESS']
    rocketmqBinDir=input("input rocketmq bin dir:   ")
    for tmp in topicList:
        cmd="{0}/mqadmin updateTopic -n localhost:9876  -b localhost:10911  -t {1}".format(rocketmqBinDir,tmp)
        print(cmd)
        os.system(cmd)
    print("final topic list: ")
    res=os.popen("{0}/mqadmin topicList".format(rocketmpBinDir))
    for line in res.readlines():
        print(line)


