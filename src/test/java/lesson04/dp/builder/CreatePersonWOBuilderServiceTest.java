package lesson04.dp.builder;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class CreatePersonWOBuilderServiceTest {

    @DataProvider
    public Object[][] data() {
        return new Object[][] {
                {new PersonWOBuilder("", null, "", null)}
        };
    }

    @Test
    public void testCreatePerson() {
        PersonWOBuilder personWOBuilder = new PersonWOBuilder();
        personWOBuilder.setFirstName("Name1");
        personWOBuilder.setLastName("Name 2");
        personWOBuilder.setDateOfBirth("03/31/2020");
        personWOBuilder.setAddress("address");

        int statusCode = CreatePersonService.createPerson(personWOBuilder);
        assertThat(statusCode).isEqualTo(201);
    }

    @DataProvider
    public Object[][] dataBuilder() {
        return new Object[][] {
                {Person.builder().setFirstName("Name1").setLastName("Name2").build()},
                {Person.builder().setFirstName("Name3").setAddress("Address").build()}
        };
    }

    @Test(dataProvider = "dataBuilder")
    public void testCreatePersonBuilder(Person person) {
        int statusCode = CreatePersonService.createPerson(person);
        assertThat(statusCode).isEqualTo(201);
    }
}
