CREATE TABLE ExerciseClasses (
    classID int,
    className varchar(50),
    classCost varchar(25),
    classAgeGroup varchar(25),
    classLocation varchar(255)
);

CREATE TABLE Admins (
    adminID int,
    adminName varchar(100),
    adminPassword varchar(25)
);

CREATE TABLE Customers (
    customerID int,
    customerName varchar(100),
    customerNumber varchar(50),
    customerEmail varchar(50)
);