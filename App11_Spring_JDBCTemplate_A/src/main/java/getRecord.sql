DROP PROCEDURE IF EXISTS `TEST`.`getRecord` $$


#CALL A BELOW STORED PROCEDURE TO GET THE NAME AND AGE BY PASSING ID OF THE STUDENT
CREATE OR REPLACE PROCEDURE getRecord (in_id IN NUMBER,out_name OUT VARCHAR2,out_age OUT NUMBER)
IS BEGIN
   SELECT name, age
   INTO out_name, out_age
   FROM Student where id = in_id;
END;


https://plsql-tutorial.com/plsql-passing-parameters-procedure-function.htm


# CALL A BELOW FUNCTION FOR GET THE STUDENT NAME BY PASSING in_id as IN Parameter.

CREATE OR REPLACE Function get_student_name (in_id IN NUMBER,out_name OUT VARCHAR2)
return VARCHAR2
IS BEGIN
   SELECT NAME
   INTO out_name
   FROM Student where id = in_id;
END;