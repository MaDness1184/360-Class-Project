
import java.time.LocalDate;

public class PatientRecord {
    private LocalDate date;
    private String patientID;
    private String vitalSigns;
    private String visionAcuity;
    private String cardiovascularHealth;
    private String respiratoryHealth;
    private String neuroHealth;
    private String musculoskeletalAssessment;
    private String skinAndLymphNodes;
    private String diagnosis;


    public PatientRecord (String patientID, String vitalSigns, String visionAcuity, String cardiovascularHealth,
                         String respiratoryHealth, String neuroHealth, String musculoskeletalAssessment,
                         String skinAndLymphNodes, String diagnosis) {
        this.date = LocalDate.now();
        this.patientID = patientID;
        this.vitalSigns = vitalSigns;
        this.visionAcuity = visionAcuity;
        this.cardiovascularHealth = cardiovascularHealth;
        this.respiratoryHealth = respiratoryHealth;
        this.neuroHealth = neuroHealth;
        this.musculoskeletalAssessment = musculoskeletalAssessment;
        this.skinAndLymphNodes = skinAndLymphNodes;
        this.diagnosis = diagnosis;
    }

    public LocalDate getDate() { return date; }
    public String getPatientID() { return patientID; }
    public String getVitalSigns() { return vitalSigns; }
    public String getVisionAcuity() { return visionAcuity; }
    public String getCardiovascularHealth() { return cardiovascularHealth; }
    public String getRespiratoryHealth() { return respiratoryHealth; }
    public String getNeuroHealth() { return neuroHealth; }
    public String getMusculoskeletalAssessment() { return musculoskeletalAssessment; }
    public String getSkinAndLymphNodes() { return skinAndLymphNodes; }
    public String getDiagnosis() { return diagnosis; }

    public String getData() {
        return "Patient ID: " + getPatientID() +
                "\nDate: " + getDate() +
                "\nVital Signs: " + getVitalSigns() +
                "\nVision Acuity: " + getVisionAcuity() +
                "\nCardiovascular Health: " + getCardiovascularHealth() +
                "\nRespiratory Health: " + getRespiratoryHealth() +
                "\nNeuro Health: " + getNeuroHealth() +
                "\nMusculoskeletal Assessment: " + getMusculoskeletalAssessment() +
                "\nSkin and Lymph Nodes: " + getSkinAndLymphNodes() +
                "\nDiagnosis: " + getDiagnosis();
    }

}
