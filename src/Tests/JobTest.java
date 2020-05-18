package Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    Job jobOne;
    Job jobTwo;
    Job jobThree;
    Job jobFour;

    @Before
    public void createJobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFour = new Job("Product tester", new Employer(), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency());
    }


    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
        assertTrue(jobOne.getId() == jobTwo.getId() -1);

    }



    @Test
    public void testIdClass(){
        Integer I = jobThree.getId();
        assertTrue(I instanceof Integer);
    }
    @Test
    public void testIdValue(){
        assertTrue(jobThree.getId() == 3);

    }
    @Test
    public void testNameClass(){
        assertTrue(jobThree.getName() instanceof String);
    }
    @Test
    public void testNameValue(){
        assertTrue(jobThree.getName() == "Product tester");
    }
    @Test
    public void testEmployerClass(){
        assertTrue(jobThree.getEmployer() instanceof Employer);
    }
    @Test
    public void testEmployerValue(){
        assertTrue(jobThree.getEmployer().getValue() == "ACME");
    }
    @Test
    public void testLocationClass(){
        assertTrue(jobThree.getLocation() instanceof Location);
    }
    @Test
    public void testLocationValue(){
        assertTrue(jobThree.getLocation().getValue() == "Desert");
    }
    @Test
    public void testPositionTypeClass(){
        assertTrue(jobThree.getPositionType() instanceof PositionType);
    }
    @Test
    public void testPositionTypeValue(){
        assertTrue(jobThree.getPositionType().getValue() == "Quality control");
    }
    @Test
    public void testCoreCompetencyClass(){
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
    }
    @Test
    public void testCoreCompetencyValue(){
        assertTrue(jobThree.getCoreCompetency().getValue() == "Persistence");
    }

    @Test
    public void testToStringStartsWithBlankLine(){
        assertTrue(jobThree.toString().startsWith("\n"));
    }
    @Test
    public void testToStringEndsWithBlankLine(){
        assertTrue(jobThree.toString().endsWith("\n"));
    }
    @Test
    public void testToStringFull(){
        assertEquals(jobThree.toString(), "\nID: 3\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n");

    }
    @Test
    public void testToStringPartialEmpty(){
        assertEquals(jobFour.toString(), "\nID: 4\nName: Product tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Data not available\n");

    }


}
