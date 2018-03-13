package entityclasses;

import entityinterfaces.ICountry;

public class Country implements ICountry {

    private int id;
    private String countryName;
    private int iso;
    private int flag_id;

    public Country(){

    }

    public Country(int id, String countryName, int iso, int flag_id){
        this.id=id;
        this.countryName=countryName;
        this.iso=iso;
        this.flag_id=flag_id;
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
    public String getCountryName() {
        return countryName;
    }

    @Override
    public void setCountryName(String countryName) {
        this.countryName=countryName;
    }

    @Override
    public int getISO() {
        return iso;
    }

    @Override
    public void setISO(int iso) {
        this.iso=iso;
    }

    @Override
    public int getFlagID() {
        return flag_id;
    }

    @Override
    public void setFlagID(int flagID) {
        this.flag_id=flagID;
    }
}
