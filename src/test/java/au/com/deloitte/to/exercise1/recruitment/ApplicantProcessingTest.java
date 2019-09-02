package au.com.deloitte.to.exercise1.recruitment;

import au.com.deloitte.to.exercise1.model.Applicant;
import au.com.deloitte.to.exercise1.model.Nationality;
import au.com.deloitte.to.exercise1.model.ResidentStatus;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author Thanh Le
 * Created: 02 Sep 2019
 */
public class ApplicantProcessingTest {

    @Test
    public void testEligibleApplicant(){
        Applicant applicant = new Applicant();
        applicant.setFirstNames("First Name");
        applicant.setLastName("Last Name");
        applicant.setAge(30);
        applicant.setNationality(Nationality.AUSTRALIA);
        applicant.setResidentStatus(ResidentStatus.PERMANENT_RESIDENT);
        ApplicantProcessing applicantProcessing = new ApplicantProcessing(applicant);
        applicantProcessing.process();
        assertEquals("Proceed Interview", applicant.getStatus());
    }

    @Test
    public void testIneligibleApplicant(){
        Applicant applicant = new Applicant();
        applicant.setFirstNames("First Name");
        applicant.setLastName("Last Name");
        applicant.setAge(30);
        applicant.setNationality(Nationality.OTHER);
        applicant.setResidentStatus(ResidentStatus.TEMPORARY_RESIDENT);
        ApplicantProcessing applicantProcessing = new ApplicantProcessing(applicant);
        applicantProcessing.process();
        assertEquals("Proceed Interview", applicant.getStatus());
    }
}