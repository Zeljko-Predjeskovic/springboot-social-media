package com.predjeskovic.neo4jrestapi.persistence;

import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class PersonNodeRepositoryTest {

  /*  @Autowired
    private PersonRepository personRepository;


    @BeforeEach
    void init(){
        PersonNode person = new PersonNode("Zeljko","Predjeskovic","Yatotoast","123@mail.at");
        PersonNode person1 = new PersonNode("Kacper","Zaleski","K","123@mail.at");
        PersonNode person2 = new PersonNode("Dawud","Hussein","D","123@mail.at");
        PersonNode person3 = new PersonNode("Maximilian","Duranik","M","123@mail.at");

        personRepository.save(person1);
        personRepository.save(person2);
        personRepository.save(person3);
        personRepository.save(person);
    }

    @Test
    @Order(1)
    void findByLastName(){

        PersonNode p = personRepository.findByLastName("Predjeskovic");

        System.out.println(p);

        Assertions.assertEquals(p.getLastName(),"Predjeskovic");

        personRepository.deleteAll();

    }*/

}
