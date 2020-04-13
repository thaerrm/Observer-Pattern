package Tests;
import Interfaces.Observer;
import Interfaces.Subject;
import org.junit.Assert;
import org.junit.Test;
import Subject.Person;

import static org.junit.Assert.assertEquals;


public class PersonTest {
    @Test
    public void personTest()

    {
        Person person = new Person();
        person.setPersonName("Name");
        String personName = person.getPersonName();
        Assert.AssertEquals(personName,"Name");
    }
    public void subjectTest()
    {
        Person person = new Person();
        person.setSubject("");
        String subject = person.getSubject();
        Assert.assertEquals(subject, (""));
    }
}