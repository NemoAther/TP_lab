package entity;
// Generated 21.05.2022 16:46:36 by Hibernate Tools 4.3.1


import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.persistence.FetchType;
import javax.persistence.OneToMany;

/**
 * Gruppyi generated by hbm2java
 */
public class Gruppyi  implements java.io.Serializable {


     private Integer shifr;
     private String nazvanie;
     private Date dataFormir;
     private int kodPlana;
     private String status;
     private Date statusDate;
     private List<Studentyi> studentyis;

    public Gruppyi() {
    }

	
    public Gruppyi(String nazvanie, Date dataFormir, int kodPlana) {
        this.nazvanie = nazvanie;
        this.dataFormir = dataFormir;
        this.kodPlana = kodPlana;
    }
    public Gruppyi(String nazvanie, Date dataFormir, int kodPlana, String status, Date statusDate, List<Studentyi> studentyis) {
       this.nazvanie = nazvanie;
       this.dataFormir = dataFormir;
       this.kodPlana = kodPlana;
       this.status = status;
       this.statusDate = statusDate;
       this.studentyis = studentyis;
    }
   
    public Integer getShifr() {
        return this.shifr;
    }
    
    public void setShifr(Integer shifr) {
        this.shifr = shifr;
    }
    public String getNazvanie() {
        return this.nazvanie;
    }
    
    public void setNazvanie(String nazvanie) {
        this.nazvanie = nazvanie;
    }
    public Date getDataFormir() {
        return this.dataFormir;
    }
    
    public void setDataFormir(Date dataFormir) {
        this.dataFormir = dataFormir;
    }
    public int getKodPlana() {
        return this.kodPlana;
    }
    
    public void setKodPlana(int kodPlana) {
        this.kodPlana = kodPlana;
    }
    public String getStatus() {
        return this.status;
    }
    
    public void setStatus(String status) {
        this.status = status;
    }
    public Date getStatusDate() {
        return this.statusDate;
    }
    
    public void setStatusDate(Date statusDate) {
        this.statusDate = statusDate;
    }
    
    @OneToMany(fetch=FetchType.LAZY, mappedBy="gruppyi")
    public List<Studentyi> getStudentyis() {
        return this.studentyis;
    }
    
    public void setStudentyis(List<Studentyi> studentyis) {
        this.studentyis = studentyis;
    }




}


