package dataAccess.abstracts;

import entities.User;

public interface IUserDao {
    public void add(User user);
    public void delete(User user);
    public void update(User user);
}
