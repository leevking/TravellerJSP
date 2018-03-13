package entityclasses;

import entityinterfaces.ITravel;

import java.util.Date;

public class Travel implements ITravel {

    private int id;
    private int acc_id;
    private int dep_country_id;
    private int dest_country_id;
    private Date depDate;
    private Date destDate;
    private boolean state;

    public Travel(){

    }

    public Travel(int id, int acc_id, int dep_country_id, int dest_country_id, Date depDate, Date destDate, boolean state){
        this.id =id;
        this.acc_id=acc_id;
        this.dep_country_id=dep_country_id;
        this.dest_country_id=dest_country_id;
        this.depDate=depDate;
        this.destDate=destDate;
        this.state=state;
    }
    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id=id;
    }

    @Override
    public int getAccID() {
        return acc_id;
    }

    @Override
    public void setAccID(int id) {
        this.acc_id=id;
    }

    @Override
    public int getDepCountryID() {
        return dep_country_id;
    }

    @Override
    public void setDepCountryID(int id) {
        this.dest_country_id=dep_country_id;
    }

    @Override
    public int getDestCountryID() {
        return dest_country_id;
    }

    @Override
    public void setDestCountryID(int id) {
        this.dest_country_id=id;
    }

    @Override
    public Date getDepDate() {
        return depDate;
    }

    @Override
    public void setDepDate(Date depDate) {
        this.depDate=depDate;
    }

    @Override
    public Date getDestDate() {
        return destDate;
    }

    @Override
    public void setDestDate(Date destDate) {
        this.destDate=destDate;
    }

    @Override
    public boolean getState(){
        return state;
    }

    @Override
    public void setState(boolean state) {
        this.state = state;
    }
}
