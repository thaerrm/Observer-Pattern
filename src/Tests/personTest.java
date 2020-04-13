package Tests;
import Interfaces.Observer;
import Interfaces.Subject;
import org.junit.Assert;
import org.junit.Test;



public class personTest {
    @Test
    public void personTest()

    {
        Person person = new Person();
        person.setPersonName("Name");
        String personName = person.getPersonName;
        Assert.assertEquals(personName, person.getPersonName("Name"));
    }
}