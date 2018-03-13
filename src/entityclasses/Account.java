package entityclasses;

import com.sun.istack.internal.Nullable;
import entityinterfaces.IAccount;

public class Account implements IAccount {

    private int id;
    private String email;
    private int avatarID;
    private String username;

    public Account(){

    }

    public Account(int id, String email, @Nullable int avatarID, String username){
        this.id = id;
        this.email = email;
        this.avatarID = avatarID;
        this.username = username;
    }

    @Override
    public int getID() {
        return id;
    }

    @Override
    public void setID(int id) {
        this.id = id;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public int getAvatarID() {
        return avatarID;
    }

    @Override
    public void setAvatar(int id) {
        this.avatarID = id;
    }

    @Override
    public String getUserName() {
        return username;
    }

    @Override
    public void setUserName(String name) {
        this.username=name;
    }
}
