package DAOinterfaces;

import entityclasses.Country;

public interface ICountryDAO {

    void createCountry(Country country);

    Country findCountryByID(int id);

    void deleteCountrybyID(int id);

    void modifyCountry(Country country);
}
