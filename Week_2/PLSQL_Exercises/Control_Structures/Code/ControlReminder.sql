BEGIN
  FOR l IN (
    SELECT * FROM loans WHERE due_date <= SYSDATE + 30
  ) LOOP
    DBMS_OUTPUT.PUT_LINE('Reminder: Loan for Customer ' || l.customer_id || ' is due on ' || l.due_date);
  END LOOP;
END;