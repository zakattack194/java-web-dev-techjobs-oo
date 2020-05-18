package Tests;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.launchcode.techjobs_oo.*;

import static org.junit.Assert.*;

public class JobTest {
    static Job jobOne;
    static Job jobTwo;
    static Job jobThree;
    static Job jobFour;
    static Job jobFive;

    @BeforeClass
    public static void createJobObjects() {
        jobOne = new Job();
        jobTwo = new Job();
        jobThree = new Job("Product tester", new Employer("ACME"), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency("Persistence"));
        jobFour = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
        jobFive = new Job("Product tester", new Employer(""), new Location("Desert"), new PositionType("Quality control"), new CoreCompetency(""));
    }


    @Test
    public void testSettingJobId() {
        assertFalse(jobOne.getId() == jobTwo.getId());
        assertTrue(jobOne.getId() == jobTwo.getId() -1);

    }

    @Test
    public void testJobConstructorSetsAllFields(){
        Integer I = jobThree.getId();
        assertTrue(I instanceof Integer);
        assertTrue(jobThree.getId() == 3);
        assertTrue(jobThree.getName() instanceof String);
        assertTrue(jobThree.getName().equals("Product tester"));
        assertTrue(jobThree.getEmployer() instanceof Employer);
        assertTrue(jobThree.getEmployer().getValue().equals("ACME"));
        assertTrue(jobThree.getLocation() instanceof Location);
        assertTrue(jobThree.getLocation().getValue().equals("Desert"));
        assertTrue(jobThree.getPositionType() instanceof PositionType);
        assertTrue(jobThree.getPositionType().getValue().equals("Quality control"));
        assertTrue(jobThree.getCoreCompetency() instanceof CoreCompetency);
        assertTrue(jobThree.getCoreCompetency().getValue().equals("Persistence"));
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
        assertEquals("\nID: 3\nName: Product tester\nEmployer: ACME\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Persistence\n",jobThree.toString() );

    }
    @Test
    public void testToStringPartialEmpty(){
        assertEquals("\nID: 4\nName: Product tester\nEmployer: Data not available\nLocation: Desert\nPosition Type: Quality control\nCore Competency: Data not available\n", jobFour.toString());

    }
    @Test
    public void testJobsForEquality(){
        assertFalse(jobFour.equals(jobFive));

    }

}
