#!/bin/bash

curl -X PUT http://localhost:8080/balances?users=2 \
   -H "Content-Type: application/json" \
   -d '{"amount": 400000, "userId": 2}'