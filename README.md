# Etrade
E-trading module has 5 component
* Address
* Bank Details
* Stock
* Trade
* User
#

### Api Endpoints
## Address
GET : http://localhost:8080/address/retrieve/{addressId}

POST: http://localhost:8080/address/create
```bash
{
    "addressId": 1,
    "user": null,
    "houseNumber": "232",
    "street": "Kabir Nagar",
    "city": "Lucknow",
    "state": "Uttar Pradesh",
    "country": "India",
    "pincode": 272175
}
```

## Bank Details

GET : http://localhost:8080/bank-details/retrieve/{bankDetailsId}

POST: http://localhost:8080/bank-details/create
```bash
{
    "bankId": 4,
    "user": null,
    "accountNumber": "141414141",
    "accountType": "saving",
    "bankName": "ydfc",
    "savingAmount": 70000,
    "ifscCode": "YDID0007876"
}
```
## Stock

GET : http://localhost:8080/stock/retrieve/{stockId}

POST: http://localhost:8080/stock/create

```bash
{
    "stockId": 5,
    "name": "dxc",
    "sector": "Public",
    "unitPrice": "100",
    "exchange": "BSE",
    "category": 11,
    "risk": "low",
    "date": null
}
```
## Trade

GET : http://localhost:8080/trade/retrieve/{tradeId}

POST: http://localhost:8080/trade/create
```bash
{
    "tradeId": 3,
    "user": null,
    "unitPrice": 34,
    "quantity": 12,
    "type": "bse",
    "stock": null
}
```

## User
GET : http://localhost:8080/user/retrieve/{tradeId}

POST: http://localhost:8080/user/create
```bash
{
    "userId": 2,
    "address": null,
    "firstName": "Rishabh",
    "lastName": "Mishra",
    "contactNumber": 8888888888,
    "email": "mr.x@gmail.com",
    "bankdetails": null,
    "trade": [],
    "password": null
}
```
