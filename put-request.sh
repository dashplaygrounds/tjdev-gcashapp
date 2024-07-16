#!/bin/bash

curl -X PUT http://localhost:8080/balances/users?userId=4 \
   -H "Content-Type: application/json" \
   -d '{"amount": 300000, "userId": 4}'