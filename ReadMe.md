# MiNet’s Warehouse Management System
Java Project 3

## Table of contents
* [Introduction](#introduction)
* [Technologies](#technologies)
* [Documents](#documents)
* [Run](#run)

# Introduction
This is a terminal based warehouse management project. This app can be used to manage different aspects of a warehouse.
It is a terminal based application built on Java. There are three types of users which are Admin,Cashier and Manager.
The user will have the option to Login.
After Login Each user can do different functionality like Admin users can add employees,pay salaries to employees and review the transactions.
Cashiers can sell and return items and also place orders for replineshments which can be approved by the Manager.

## Technologies
Project is created with:
* Java 17.0.2 Version
* Maven 4.0.0 version
* JUnit 5.4.0 Version


## Project mamnagement Documents
Project Management Documents:
- [Usecase Diagram](https://github.com/rashmoni/warehouse-management/blob/main/ProjectManagement/UseCaseDiagram.pdf)
- [Class Diagram](https://github.com/rashmoni/warehouse-management/blob/main/ProjectManagement/ClassDiagram.pdf)
- [Product Backlog](https://github.com/rashmoni/warehouse-management/blob/main/ProjectManagement/Product%20Backlog.xlsx)

## Run
To run this application do the following steps.
1. git clone https://github.com/rashmoni/warehouse-management.git
2. mvn clean install
3. cd /target
4. java -jar warehouse-management-1.0-SNAPSHOT.jar
5. The password in the file is encrypted SHA1 value.
6. Some sample userid and password are already present in the System.
   1. admin1
   2. cashier1
   3. manager1
7. Password for these demo users are "abc123"


## Folder structure -
/warehouse-management
- src/main/resources/inventory.txt
- src/main/resources/orders.txt
- src/main/resources/users.txt
- src/main/resources/transactions.txt
- warehouse-management-1.0-SNAPSHOT.jar

```
$ cd ../target
$ java -jar warehouse-management-1.0-SNAPSHOT.jar
```