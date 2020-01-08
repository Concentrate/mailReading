
import json
import requests
url="http://127.0.0.1:18084/pay-api/users/transaction/pingxx_pay_success"
jsonFile="fakepayRe.json"

if __name__=="__main__":
    content=""
    with open(jsonFile,"rt") as f:
        content=f.read()
    #tmp=json.loads(content)
    #print(tmp)
    headers = {'content-type': 'application/json'}
    ret=requests.post(url,headers=headers,data=json.dumps(content))
    print(ret.text)


