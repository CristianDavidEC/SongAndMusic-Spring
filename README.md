# Song and Music Spring
This project is a REST and SOAP api using Spring java as framework.

For a detailed description of the code and its operation see CODE_GUIDE.MD
## Installation and implementation guide 
To install and test the software follow the steps below

### Download the github repository
```sh
git clone https://github.com/CristianDavidEC/SongAndMusic-Spring.git
```
Open the project in the IDE of your choice.

### DB Connection
Create a MySQL database

[Link to Install MySQL](https://dev.mysql.com/downloads/installer/)

[Link to guide for the creation of DB](https://www.youtube.com/watch?v=DjgmkuwTrOc&ab_channel=JGAITPro)

__NOTE:__ Just create the database without the need for the tables or data, can also have an online database.

Edit the __application.properties__ file that is in the path with your connection data
```sh
/src/main/resources/application.properties
```
this is a example the configire file
```
spring.datasource.url=jdbc:mysql://localhost:3306/{name_db}?useSSL=false&serverTimezone=UTC&useLegacyDatetimeCode=false
spring.datasource.username={your_name_user}
spring.datasource.password={your_password}
spring.jpa.hibernate.ddl-auto=update
```
### Run the application
Verify that the Maven dependencies have been installed (See how this is done in your IDE as well if not installed)

Open an end and execute the following command in the root path of the project
```sh
.\mvnw.cmd spring-boot:run
```
It will execute the project, create the dependencies for the soap methods and launch the server.

Open http://localhost:8080/

### Test requests REST and SOAP
EndPoint REST: http://localhost:8080/song/

EndPoint SOAP: http://localhost:8080/ws

Install postmant to perform the request tests.

[Link to Install PostMan](https://www.postman.com/downloads/)

Create your requests for testing or use the following collection of guides and make requests as required.

[Collection Postman Spring](https://elements.getpostman.com/redirect?entityId=11608044-10a50a35-0328-46bf-ac4f-ccf13918864c&entityType=collection)

If you are not familiar with postman, check the documentation.

[PostMan Documnetation](https://learning.postman.com/docs/getting-started/introduction/)

I hope this project will be useful to learn the basic concepts of a REST and SOAP api using sprig-boot.


