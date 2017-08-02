# Introduction

+ Spring was developed to make JEE development easier without the need to use EJBs, they sound horrible enough already
+ POJO based, code written with spring can be written without it
+ Uses Aspect Oriented Programming/ Proxies for transactions
+ Best practices built into code just by using spring (**Design Patterns**)


# Why should you use spring

+ Increases testability
+ Maintainability++
+ Scalability++
+ Code Complexity--

**Remove Configuration code, focus on business logic that is more testable**

We can use Annotations or XML configurations

To simplify spring, it is essentially a `Hashmap` of POJOS, with a registry

Spring utilises the *template pattern* a lot to help clean up our code

We are trying to solve the problem of not having to hard code configurations in our code to specify the environments that we are working on. Spring lets us **WORA** - Write once read everywhere.

```java
public class CustomerServiceImpl implements CustomerService {

                                                    // This should be abstracted out and
                                                    // a design pattern such as a factory
                                                    // pattern should be used instead
    private CustomerRepository customerRepository = new HibernateCustomerRepositoryImpl();

    // Whenever we see an interface tied to a concrete implementation, that should be abstracted
    // out of our code so that our application isn't "Hardcoded"
```
