# Rest-Assured-API-Test

API automation testing framework using Rest-Assured with Java. This project demonstrates comprehensive API testing for CRUD operations using public APIs like FakeStoreAPI.

## 🚀 Features

- **Complete CRUD Operations Testing**
  - GET requests (single product & all products)
  - POST requests (create new products)
  - PUT/PATCH requests (update products)
  - DELETE requests (remove products)
- **Response Validation & Assertions**
- **Pagination Testing**
- **JSON Schema Validation**
- **Maven Integration**

## 🛠️ Tech Stack

- **Java** - Programming language
- **Rest-Assured** - API testing framework
- **TestNG/JUnit** - Testing framework
- **Maven** - Build automation tool
- **FakeStoreAPI** - Test API endpoint

## 📁 Project Structure

```
RestAssured-API-Test/
├── src/
│   ├── main/
│   │   ├── java/
│   │   │   └── Models/
│   │   └── resources/
│   └── test/
│       └── java/
│           └── Tests/
│               ├── CreateProductTest.java
│               ├── DeleteProductTest.java
│               ├── GetProductsTest.java
│               ├── GetProductTest.java
│               ├── PaginationTest.java
│               └── UpdateProductTest.java
├── pom.xml
└── README.md
```

## 🧪 Test Cases

### GetProductTest.java
- Validates single product retrieval
- Verifies response status codes
- Checks JSON response structure

### GetProductsTest.java
- Tests fetching all products
- Validates response array structure
- Checks product count and data integrity

### CreateProductTest.java
- Tests product creation via POST requests
- Validates request payload
- Verifies created product response

### UpdateProductTest.java
- Tests product updates using PUT/PATCH
- Validates partial and complete updates
- Checks response consistency

### DeleteProductTest.java
- Tests product deletion
- Validates deletion confirmation
- Checks error handling for non-existent products

### PaginationTest.java
- Tests API pagination functionality
- Validates limit and offset parameters
- Checks page boundary conditions

## 🚦 Getting Started

### Prerequisites
- Java 8 or higher
- Maven 3.6+
- IDE (IntelliJ IDEA, Eclipse, VS Code)

### Installation

1. Clone the repository:
```bash
git clone https://github.com/Amitchaurasiya1303/Rest-Assured-API-Test.git
```

2. Navigate to project directory:
```bash
cd Rest-Assured-API-Test
```

3. Install dependencies:
```bash
mvn clean install
```

### Running Tests

Execute all tests:
```bash
mvn test
```

Run specific test class:
```bash
mvn test -Dtest=GetProductTest
```

## 📊 API Endpoints Tested

- **Base URL**: `https://fakestoreapi.com`
- **GET** `/products` - Fetch all products
- **GET** `/products/{id}` - Fetch single product
- **POST** `/products` - Create new product
- **PUT** `/products/{id}` - Update product
- **DELETE** `/products/{id}` - Delete product

## 🔧 Configuration

The project uses Maven for dependency management. Key dependencies include:

- Rest-Assured for API testing
- TestNG/JUnit for test execution
- JSON libraries for response parsing

## 📈 Future Enhancements

- [ ] Add authentication testing
- [ ] Implement data-driven testing
- [ ] Add performance testing
- [ ] Include API documentation testing
- [ ] Add CI/CD pipeline integration

## 🤝 Contributing

This is a practice project for API automation learning. Feel free to fork and experiment!

## 📝 License

This project is for educational purposes.

---

**Happy Testing! 🧪**