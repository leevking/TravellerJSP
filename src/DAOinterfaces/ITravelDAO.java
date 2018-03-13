package DAOinterfaces;

import entityclasses.Travel;

public interface ITravelDAO {

    void createTravel(Travel travel);

    Travel findTravelByID(int id);

    void deleteTravelByID(int id);

    void modifyTravel(Travel travel);
}
