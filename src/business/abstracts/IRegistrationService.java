package business.abstracts;

import entities.User;

public interface IRegistrationService {

    void registrationNewUser(User user);
    void deleteUser(User user);
    void updateUserInformation(User user);
}
