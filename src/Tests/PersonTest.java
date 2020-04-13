package Tests;
import Interfaces.Observer;
import org.junit.Assert;
import org.junit.Test;
import Subject.Person;


public class PersonTest {
    @Test
    public void personTest()

    {
        Person person = new Person();
        person.setPersonName("Name");
        String personName = person.getPersonName();
        Assert.assertEquals(personName,"Name");
    }
}