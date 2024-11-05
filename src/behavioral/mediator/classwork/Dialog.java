package behavioral.mediator.classwork;

public class Dialog implements Mediator{
    private TextBox userTextBox;
    private TextBox passwordTextBox;
    private LoginButton button;

    @Override
    public void login() {
        String login = userTextBox.getText();
        String password = passwordTextBox.getText();
        // validate login & password
        // logs in the user or pops error message
    }
}
