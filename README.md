# Cachetest

[![NPM](https://img.shields.io/npm/l/react)](https://github.com/Geuel/cachetest/blob/main/LICENSE)

## About this Project

Project for testing cache using Redis with Spring. Implementing TTL (time-to-live) and cache cleaning.

### Installing

**Cloning the Repository**

```
$ git clone https://github.com/Geuel/cachetest
$ cd cachetest
```

**Installing dependencies**

Open the Gradle project using your preferred IDE

### Running

Once the project is open, you will need an instance of Redis running with the default port (6379) exposed.
I suggest using docker-compose, with the script below:

```
version: '3.4'

services:
  cache:
    image: redis
    ports:
      - "6379:6379"
```

## Built With

- [Spring JPA](https://spring.io/projects/spring-data-jpa) - Build using Spring JPA - implement JPA based repositories
- [Lombok](https://projectlombok.org/) - Build using Lombok to clean code

## Contributing

If you have any questions about the project send me an email or contact me on LinkedIn.

Email-me: geuelcp@gmail.com

Connect with me at [LinkedIn](https://www.linkedin.com/in/geuel-chaves-paiva-b0488514a/)

Thank you!

## Acknowledgement

I thank [DIO](https://digitalinnovation.one/) who instructed me in learning the technologies involved
