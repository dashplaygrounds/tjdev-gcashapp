#!/bin/bash

curl -X POST http://localhost:8080/balances \
   -H "Content-Type: application/json" \
   -d '{"amount": 300000, "userId": 3}'