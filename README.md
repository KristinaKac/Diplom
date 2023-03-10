# Дипломная работа «Облачное хранилище»

## Описание проекта
REST-интерфейс для загрузки файлов и вывода списка уже загруженных файлов пользователя.

Все запросы к сервису авторизованы.

Заранее подготовленное веб-приложение (FRONT) подключается к разработанному сервису без доработок,
а также использует функционал FRONT для авторизации, загрузки и вывода списка файлов пользователя.

## Стартовые пользователи:

**USERNAME:** user@one.user **PASSWORD:** user_one

**USERNAME:** user@two.user **PASSWORD:** user_two

## Описание реализации:

- Приложение разработано с использованием Spring Boot.
- Использован сборщик пакетов maven.
- Для запуска используется docker, docker-compose.
- Код размещён на Github.
- Использована база данных MySql;

## Запуск приложения
1. Скачать данный проект, выполнить `maven -> clean -> package`;
2. Запустить `docker-compose.yml`.
   