# AuditLib

Библиотека для логгирования

[Телеграмм разработчика](https://t.me/fiarr4ikdev)   
[ВК разработчика](https://vk.com/fiarr4ik)

Данная библиотека позволяет логгировать работу методов.

Для установки бибилотеки через maven импортируйте библиотеку

```xml
<dependency>
    <groupId>ru.fiarr4ik</groupId>
    <artifactId>spring-boot-starter-audit-lib</artifactId>
    <version>0.0.1-SNAPSHOT</version>
</dependency>
```

Для начала работы с библиотекой в файле .properties настройте уровни для логов:

```auditlog.console-enabled=false/true``` - Отключение/включение логов в консоль
```auditlog.file-enabled=false/true``` - Отключение/включение логов в файл
```auditlog.file-path``` - Путь к сохранению логов в файл

Пример .properties файла

```properties
auditlog.console-enabled=true
auditlog.file-enabled=true

auditlog.file-path=logs/log.txt
```

Для работы метода нужно добавить аннотацию ```@AuditLog``` с уровнем логгирования (например уровень INFO ```@AuditLog(logLevel = LogLevel.INFO)```)

Пример как выглядит метод с включенным логированием от аннотации ```@AuditLog```:

```java
@GetMapping("/test")
@AuditLog(logLevel = LogLevel.INFO)
public String test() {
    return "Hello";
}
```

Если включен лог в файл то вывод будет примерно такой:

```text
INFO Метод test вызвался с аргументами []
INFO Время запроса: 2024-07-04T22:52:37.579768600, Тип запроса: GET, Тело запроса:
INFO Время запроса: 2024-07-04T22:52:37.581280600, Тип запроса: GET, Статус запроса: 200
INFO Метод test вернул: Hello
```


