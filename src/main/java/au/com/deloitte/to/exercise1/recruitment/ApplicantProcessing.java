package au.com.deloitte.to.exercise1.recruitment;

import au.com.deloitte.to.exercise1.exceptions.InsufficientDataException;
import au.com.deloitte.to.exercise1.model.Applicant;
import au.com.deloitte.to.exercise1.model.Nationality;
import au.com.deloitte.to.exercise1.model.ResidentStatus;

/**
 * @author Thanh Le
 */
public class ApplicantProcessing {
    private Applicant applicant;

    public ApplicantProcessing(Applicant applicant) {
        this.applicant = applicant;
    }

    public void process() {
        if (isApplicantEligible()) {
            applicant.setStatus("Proceed Interview");
        } else {
            applicant.setStatus("Archived");
        }
    }

    private boolean isApplicantEligible() {
        if (applicant.getFirstNames() == null
                || applicant.getLastName() == null
                || applicant.getResidentStatus() == null
                || applicant.getAge() == 0
                || applicant.getNationality() == null) {
            try {
                throw new InsufficientDataException("Missing applicant information!");
            } catch (InsufficientDataException e) {
                e.printStackTrace();
            }
        }
        return doesApplicantHasWorkPermit();
    }

    private boolean doesApplicantHasWorkPermit() {
        if (applicant.getNationality() != Nationality.OTHER)
            return true;
        return applicant.getResidentStatus() == ResidentStatus.PERMANENT_RESIDENT;
    }
}
