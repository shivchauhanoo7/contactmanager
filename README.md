# contactmanager
GET
http://loclhost:8082/contact

This api will show all contact present in database.

GET /zipcode
http://localhost:8082/contact/zipcode

This api will show all contact present in database for perticular zipcode.

POST
http://localhost:8082/contact
{
  {
  "fullName": "John Doe",
  "dateBirth": "YYYY-MM-DD"
  "address": {
       "addressLine1": "abc"
       "addressLine2": "def"
       "city": "xyz"
       "zipCode": "123456"
  }
}

}
This Api will insert the data in database.
