# forSkillbox

Используемые технологии:  
  
Java 11  
Maven  
Spring boot 2.4.0  
MySql 8.0 (HSQL по умолчанию)  
Bootstrap  
Html5\CSS  
Thymeleaf  
  
Задача:  
Сделать веб приложение с thymeleaf валидацией и сохранением в бд посредством hibernate.  
  
Описание запуска приложения:  
  
По умолчанию хранение записей осуществляется с помощью базы данных HSQL in-memory,  
поэтому для запуска приложения понадобиться только установленная Java машина (11),  
вы можете поменять профиль хранения записей на базу данных MySql через редактирование файла application.properties,  
разумеется у вас должна быть установлена данная база данных.  
  
Команды выполнять из корневой папки,  
  
для Windows  
  
Через раннер спрингбут:  
1 - скачать zip проекта и разархивировать его;  
2 - запустить из командной строки из корневой папки:  
mvnw spring-boot:run  
3 - ждем сообщения completed initialization и переходим по адресу http://localhost:8080/  
  
для Windows  
  
Через запуск jar:  
1 - скачать zip проекта и разархивировать его;  
2 - запустить из командной строки из корневой папки:  
mvnw clean package  
cd target  
java -jar forSkillbox-0.0.1-SNAPSHOT.jar  
3 - ждем сообщения completed initialization и переходим по адресу http://localhost:8080/  
  
Чтобы остановить приложение в командной строке нажмите Ctrl+C и выбирите ответ "Да"
