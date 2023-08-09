# java-jdbc
## Continuation of java course // Chapter -> Database
### How to prepare your eclipse environment...
* Using MySQL Workbench, create a database and name it (eg "test_name").
* Download the MySQL Java Connector
* If it doesn't already exist, create a User Library containing the MySQL driver .jar file
    - Window -> Preferences -> Java -> Build Path -> User Libraries
    - Name the User Library of MySQLConnector
    - Add external JARs -> (find the jar file)
* Create a new Java project
    - Add a MySQLConnector user library to the project
* In the root folder of the project, create a "db.properties" file containing the connection data:
    - user=your_user
    - password=your_password
    - dburl=jdbc:mysql://localhost:3306/test_name
    - useSSL=false
* In the "db" package, create a custom exception DbException
* In the "db" package, create a DB class with auxiliary static methods
    - Get and close a connection to the database.
