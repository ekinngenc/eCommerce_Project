package dataAccess.concretes;

import dataAccess.abstracts.IUserDao;
import entities.User;

public class HibernateUserDao implements IUserDao {

    @Override
    public void add(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı sisteme eklendi.");
    }

    @Override
    public void delete(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcı sistemden silindi");
    }

    @Override
    public void update(User user) {
        System.out.println(user.getFirstName() + " " + user.getLastName() + " adlı kullanıcının bilgileri güncellendi.");

    }
}
