# Person Application

Your task is to create a tiny Spring Boot app that uses JPA and REST.
Here's a high-level to do list:
1. Create a `Person` entity (name and age is fine)
2. Create a repo for your `Person` entity so you can do CRUD stuff.
3. Maybe test out this first bit.  At the least, make sure your code creates a `person` table.
4. Create a controller.  Create methods to:
    - Create a new Person (reproduction)
    - Read all your peeps
    - Bonus: Update a person
    - Bonus: Delete a person
5. If you didn't implement your `PersonController` with a service, then go back and add a `PersonService` as a dependency of your `PersonController`.
