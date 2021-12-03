package validationPackage.abstracts;

import entities.User;

public interface IPasswordValidator {
    boolean passwordValidator(User user);
}
