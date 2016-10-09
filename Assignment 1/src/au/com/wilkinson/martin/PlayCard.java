package au.com.wilkinson.martin;

import java.util.Arrays;

/**
 * Created by jc260174 on 7/10/16.
 */
public class PlayCard extends GameCard {
    private String title;
    private String chemistry;
    private String classification;
    private String crysSys;
    private String[] occrnce;
    private String hardness;
    private String specGrav;
    private String clvge;
    private String crysAbundance;
    private String econValue;


    public PlayCard(String title, String chemistry, String classification, String crysSys, String[] occrnce, String hardnss, String specGrav, String clvge, String crstabndce, String econVal ){
        this.title = title;
        this.chemistry = chemistry;
        this.classification = classification;
        this.crysSys = crysSys;
        this.occrnce = occrnce;
        this.hardness = hardnss;
        this.specGrav = specGrav;
        this.clvge = clvge;
        this.crysAbundance = crstabndce;
        this.econValue = econVal;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getChemistry() {
        return chemistry;
    }

    public void setChemistry(String chemistry) {
        this.chemistry = chemistry;
    }

    public String getClassification() {
        return classification;
    }

    public void setClassification(String classification) {
        this.classification = classification;
    }

    public String getCrysSys() {
        return crysSys;
    }

    public void setCrysSys(String crysSys) {
        this.crysSys = crysSys;
    }

    public String[] getOccrnce() {
        return occrnce;
    }

    public void setOccrnce(String[] occrnce) {
        this.occrnce = occrnce;
    }

    public String getHardness() {
        return hardness;
    }

    public void setHardness(String hardness) {
        this.hardness = hardness;
    }

    public String getSpecGrav() {
        return specGrav;
    }

    public void setSpecGrav(String specGrav) {
        this.specGrav = specGrav;
    }

    public String getClvge() {
        return clvge;
    }

    public void setClvge(String clvge) {
        this.clvge = clvge;
    }

    public int getCrysAbundance() {
        int crusAbundance = Integer.parseInt(crysAbundance);
        switch (crysAbundance){
            case "ultratrace":
                crusAbundance = 1;
                break;
            case "trace":
                crusAbundance = 2;
                break;
            case "low":
                crusAbundance = 3;
                break;
            case "moderate":
                crusAbundance = 4;
                break;
            case "high":
                crusAbundance = 5;
                break;
            case "very High":
                crusAbundance = 6;
                break;
        }
        return crusAbundance;
    }

    public void setCrysAbundance(String crysAbundance) {
        this.crysAbundance = crysAbundance;
    }

    public int getEconValue() {
        int econValueInt = Integer.parseInt(econValue);
        switch (econValue){
            case "trivial":
                econValueInt = 1;
                break;
            case "low":
                econValueInt = 2;
                break;
            case "moderate":
                econValueInt = 3;
                break;
            case "high":
                econValueInt = 4;
                break;
            case "very high":
                econValueInt = 5;
                break;
            case "I'm rich!":
                econValueInt = 6;
                break;
        }
        return econValueInt;
    }

    public void setEconValue(String econValue) {
        this.econValue = econValue;
    }

    @Override
    public String toString() {
        return "PlayCard{" +
                "title='" + title + '\'' +
                ", chemistry='" + chemistry + '\'' +
                ", classification='" + classification + '\'' +
                ", crysSys='" + crysSys + '\'' +
                ", occrnce=" + Arrays.toString(occrnce) +
                ", hardness='" + hardness + '\'' +
                ", specGrav='" + specGrav + '\'' +
                ", clvge='" + clvge + '\'' +
                ", crysAbundance='" + crysAbundance + '\'' +
                ", econValue='" + econValue + '\'' +
                '}';
    }
}
