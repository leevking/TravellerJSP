package entityinterfaces;

import java.util.Date;

public interface ITravel {

    int getID();

    void setID(int id);

    int getAccID();

    void setAccID(int id);

    int getDepCountryID();

    void setDepCountryID(int id);

    int getDestCountryID();

    void setDestCountryID(int id);

    Date getDepDate();

    void setDepDate(Date depDate);

    Date getDestDate();

    void setDestDate(Date destDate);

    boolean getState();

    void setState(boolean state);

}
