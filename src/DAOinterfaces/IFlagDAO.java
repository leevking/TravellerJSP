package DAOinterfaces;

import entityclasses.Flag;

public interface IFlagDAO {

    void createFlag(Flag flag);

    Flag findFlagByID(int id);

    void deleteFlagByID(int id);

    void modifyFlag(Flag flag);
}
