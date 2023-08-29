# ATL-GYM-Project-Group6

This project consists on a backend **REST API** for Manage a GYM, this project is developed in the following technologies:  **Spring Boot, MySQL, JPA, Hibernate.**

---

### Steps to Setup

- **1. Clone the application.**

``` bash
git clone https://github.com/k1raRD/ATL-GYM-Project-Group6.git
```

- **2. Create MySQL database.**

``` sql
CREATE DATABASE gym;
```

- **3. Configure the database on the project.**

Create a file `.env` on the route `src/main/resources` and add the following lines:

```yaml
MYSQL_URL=jdbc:mysql://localhost:3306/gym  
MYSQL_USERNAME=root  
MYSQL_PASSWORD=Your_Password
```

- **4. Run the app using maven.**

```bash
mvn spring-boot:run
```

The app will start running at [http://localhost:8080](http://localhost:8080/)

---

### Endpoints

**GYM**

| Method | URL              | Description                                  | Valid Request Body |
| ------ | ---------------- | -------------------------------------------- | ------------------ |
| GET    | /api/v1/gym      | Retrieved all gym information                |                    |
| GET    | /api/v1/gym/{id} | Retrieved all information of an specific gym |
| POST   | /api/v1/gym      | Add a gym                                    | JSON               |
| PUT    | /api/v1/gym/{id} | Update a gym                                 | JSON               |
| DELETE | /api/v1/gym/{id} | Delete a gym                                 |                    |

**User**

| Method | URL               | Description                                   | Valid Request Body |
| ------ | ----------------- | --------------------------------------------- | ------------------ |
| GET    | /api/v1/user      | Retrieved all user information                |                    |
| GET    | /api/v1/user/{id} | Retrieved all information of an specific user |
| POST   | /api/v1/user      | Add an user                                   | `JSON`             |
| PUT    | /api/v1/user/{id} | Update an user                                | `JSON`             |
| DELETE | /api/v1/user/{id} | Delete an user                                |                    |

**Employee**

| Method | URL                   | Description                                       | Valid Request Body |
| ------ | --------------------- | ------------------------------------------------- | ------------------ |
| GET    | /api/v1/employee      | Retrieved all employees information               |                    |
| GET    | /api/v1/employee/{id} | Retrieved all information of an specific employee |
| POST   | /api/v1/employee      | Add an employee                                   | `JSON`             |
| PUT    | /api/v1/employee/{id} | Update an employee                                | `JSON`             |
| DELETE | /api/v1/employee/{id} | Delete an employee                                |                    |

**Equipment**

| Method | URL                    | Description                                        | Valid Request Body |
| ------ | ---------------------- | -------------------------------------------------- | ------------------ |
| GET    | /api/v1/equipment      | Retrieved all equipments information               |                    |
| GET    | /api/v1/equipment/{id} | Retrieved all information of an specific equipment |
| POST   | /api/v1/equipment      | Add an equipment                                   | `JSON`             |
| PUT    | /api/v1/equipment/{id} | Update an equipment                                | `JSON`             |
| DELETE | /api/v1/equipment/{id} | Delete an equipment                                |                    |

**Membership**

| Method | URL                     | Description                                         | Valid Request Body |
| ------ | ----------------------- | --------------------------------------------------- | ------------ |
| GET    | /api/v1/membership      | Retrieved all membership information                |              |
| GET    | /api/v1/membership/{id} | Retrieved all information of an specific membership |              |
| POST   | /api/v1/membership      | Add a membership                                    | `JSON`       |
| PUT    | /api/v1/membership/{id} | Update a membership                                 | `JSON`       |
| DELETE | /api/v1/membership/{id} | Delete a membership                                 |              |

## Sample Valid JSON Request Bodys


##### Create gym -> /api/v1/gym

```json
{
    "name": "newGym",
    "phone_number": "8787382",
    "email": "newGym@gmail.com",
    "address": "Street74",
    "cp": "123",
    "city": "Buenosaires",
    "web": "www.newGym.com"
}
```

##### Update gym -> /api/v1/gym/{id}

```json
{
	"name": "updateGym",
	"phone_number": "8787382",
	"email": "updateGym@gmail.com",
	"address": "Street 74",
	"cp": "123",
	"city": "Buenos aires",
	"web": "www.updateGym.com"
}
```

##### Create user -> /api/v1/user

```json
  {
    "name": "New",
    "lastName": "User",
    "phoneNumber": "8094345493",
    "bornDate": "2020-05-02T08:05:00",
    "email": "newUser32@mail.com",
    "address": "Callesantiago",
    "cp": "3212",
    "city": "Buenos aires",
    "gym": {
      "id": 1
    },
    "membership": {
      "id": 2
    }
}
```

##### Update user -> /api/v1/user/{id}

```json
{
    "name": "Update",
    "lastName": "User",
    "phoneNumber": "8094345493",
    "bornDate": "2020-05-02T08:05:00",
    "email": "updateUser32@mail.com",
    "address": "Calle santiago",
    "cp": "3212",
    "city":"Buenosaires",
    "gym":{
        "id":1
        },
    "membership":{
    "id":2
    }
}
```

##### Create employee -> /api/v1/employee

```json
{
    "name":"New",
    "lastName":"Employee",
    "email":"newEmployee@gmail.com",
    "phoneNumber":"8756784632",
    "gym":{
    "id":1
    },
    "membership":{
    "id":1
    }
}
```

##### Update employee -> /api/v1/employee/{id}

```json
{
    "name":"Update",
    "lastName":"Employee",
    "email":"updateEmployee@gmail.com",
    "phoneNumber":"8756784632",
    "gym":{
    "id":2
    },
    "membership":{
    "id":2
    }
}
```


##### Create equipment -> /api/v1/equipment

```json
{
    "productName":"NewPesas",
    "description":"Pesas65KG",
    "status":true,
    "buyTime":"2023-08-29T09:13:15",
    "gym":{
    "id":1
    }
}
```

##### Update equipment -> /api/v1/equipment/{id}

```json
{
    "productName":"UpdatePesas",
    "description":"Pesas65KG",
    "status":false,
    "buyTime":"2023-08-29T09:13:15",
    "gym":{
    "id":1
    }
}
```


##### Create membership -> /api/v1/membership

```json
{
    "nombre":"ProMax",
    "tipoMembership":"PRO_MAX"
}
```


##### Update membership -> /api/v1/membership/{id}

```json
{
  "nombre":"ProMaxplus",
  "tipoMembership":"PRO_MAX_PLUS"
}
```
