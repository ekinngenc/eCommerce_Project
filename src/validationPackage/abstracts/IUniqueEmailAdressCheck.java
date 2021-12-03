package validationPackage.abstracts;

import entities.User;

public interface IUniqueEmailAdressCheck {
    boolean uniqueEmailAdressCheck(User user);
}
