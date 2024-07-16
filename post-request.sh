#!/bin/bash

curl -X POST http://localhost:8080/balances/create \
   -H "Content-Type: application/json" \
   -d '{"id": 4, "amount": 500000, "userId": 4}'