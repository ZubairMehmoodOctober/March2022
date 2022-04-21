import org.testng.annotations.Test;

public class SQL {
  @Test
  public void SQLqueries () {
	  
	  1. Get 10 cities in descending alphabetical order.
	   Select * from city order by city desc LIMIT 10;

	2. Get all films with "airplane" in the title.
	   Select title from film where title Like '% AIRPLANE%';

	3. Get the highest payment amount.
	    Select Max (amount) from payment;
	4. Get the number of records in the customer table for store id #1.
	   Select 8 from customer where store_id = '1';

	5. Get all payment records for customer with email address "NANCY.THOMAS@sakilacustomer.org"
	    Select p.payment_id,p.customer_id,p.staff_id,p.rental_id,p.amount,p.payment_date,p.last_update,c.customer_id,c.email
	from payment as p JOIN customer as c ON p.customer_id=c.customer_id where email = 'NANCY.THOMAS@sakilacustomer.org';
	6. Use a View to get the film info for actor Bob Fawcett.
	     Create VIEW Required  as select actor_id,film_info,first_name from actor_info where first_name = 'Bob';
	                                           or
	     Select film_info FROM sakila.actor_inf0 where first name= 'Bob' AND last_name = 'Fawcett';
	7. Use a Stored Procedure to get the 4 inventory ids for the film "Alien Center" at Store #2. 
	     CREATE PROCEDURE SelectAllfilm As Select * from film Where inventry id = 'alien Center' AND store_id = ' 2';
	8. Insert a new store. Ensure that you use TRANSACTION. (This one is possible but it's tough! Pay attention to constraints and the order that you are inserting data.) 
	    INSERT INTO store value (2,2,2 ' 2001-12-12 06 :00');
	9. Update the timestamp to the current date/time for the new store you entered in the previous question. 
	       Update store set last update = ' 2005-12-11 07:00')
	       where store id = '1';
	10. Delete the new store. 
	      Drop From sakila.store 
	        Where id = '2';  
	  
  }
}
