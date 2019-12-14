# -*- coding: utf-8 -*-

import os
import os.path
if __name__=="__main__":
    cmdInit='mysql -u ldy -pabcd1234 < {0}'
    for tmp in os.listdir('.'):
        if tmp.endswith('sql'):
            rCmd=cmdInit.format(tmp)
            print(rCmd)
            os.popen(rCmd)
