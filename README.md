# shilen-money-transfer-api

#Sending POST to create Account from Postman
{
    "firstName": "Tekle",
    "lastName": "Kidanemariam",
    "email": "teklgy@gmail.com",
    "phoneNumber":"+251911556644",
    "pin":"1134"
}

#Sending POST to create Transfer from Postman

{
    "reasonForTransfer": "Payable",
    "transferAmount": "200.2",
    "status": "done",
    "senderAccountId": {"id": "2"},
    "receiverAccountId": {"id": "1"}
}
