MiNet’s Warehouse Management System
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
- [Usecase Diagram](https://github.com/rashmoni/ATM-Machine/blob/main/ProjectManagement/ATM-Machine-UC-Diagram.pdf)
- [Class Diagram](https://github.com/rashmoni/ATM-Machine/blob/main/ProjectManagement/ATM-MachineClassDiagram.pdf)
- [Product Backlog](https://github.com/rashmoni/ATM-Machine/blob/main/ProjectManagement/ATM-Machine_UsaCases.xlsx)

## Run
To run this application do the following steps.
1. Make sure that details.txt file is present inside the assets folder.
2. The assets folder should be present in the same location as that of the executable jar file.
3. Some Demo user are already present in the System.
    1. demo1
    2. demo2
    3. demo3
4. Password for these demo users are abc123
5. The password in the file is encrypted SHA value.

Folder structure -
/ATM-Machine
- assets/details.txt
- ATM-Machine.jar

```
$ cd ../ATM-Machine
$ java -jar ATM-Machine.jar
```