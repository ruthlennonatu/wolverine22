INSERT INTO ExerciseClasses (classID, className, classCost, classAgeGroup, classLocation)
VALUES ('00001', 'Dance Class', '25.00', '18-45', 'Dance Hall Letterkenny');

UPDATE Admins
SET adminName = 'Gavin Gallagher', adminPassword = 'securepassword3214'
WHERE adminID = 00001;

DELETE FROM Customers WHERE CustomerName='Gavin Gallagher';