package hw4.task1;

public class Data {
    public static boolean dataCheck (String login, String password, String confirmedPassword) {
        boolean data = false;

        try {
            int loginLen = login.length();
            int passwordLen = password.length();
            boolean checkPassword = password.equals(confirmedPassword);

            if (loginLen >= 20)
                throw new WrongLoginException();
            else if (passwordLen >= 20 || !checkPassword)
                throw new WrongPasswordException(passwordLen);
            else data = true;
        } catch (WrongLoginException e) {
            System.out.println(e.getMessage());
        } catch (WrongPasswordException e) {
            System.out.println(e.getMessage());
        }

        return data;
    }
}
