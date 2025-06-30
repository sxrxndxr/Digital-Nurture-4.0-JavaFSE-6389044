BEGIN
  FOR c IN (SELECT * FROM customers) LOOP
    IF c.age > 60 THEN
      UPDATE customers
      SET loan_interest_rate = loan_interest_rate - 1
      WHERE customer_id = c.customer_id;
    END IF;
  END LOOP;
  COMMIT;
END;