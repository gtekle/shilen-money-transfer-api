# shilen-money-transfer-api

# Sending POST to create Account from Postman
{
    "firstName": "Tekle",
    "lastName": "Kidanemariam",
    "email": "teklgy@gmail.com",
    "phoneNumber":"+251911556644",
    "pin":"1134"
}

# Sending POST to create Transfer from Postman

{
    "reasonForTransfer": "Payable",
    "transferAmount": "1000.5",
    "status": "done",
    "senderAccount":{"id":4},
    "receiverAccount":{"id":5}
}
