public class UserApp {
    private UserViewModel viewModel;
    private UserView view;

    public UserApp() {
        viewModel = new UserViewModel();
        view = new UserView();
    }

    public void run() {
        while (true) {
            int option = view.displayMenu();

            switch (option) {
                case 1:
                    String name = view.getUserName();
                    viewModel.addUser(name);
                    view.displayMessage("User added!");
                    break;
                case 2:
                    view.displayUsers(viewModel.getUsers());
                    break;
                case 3:
                    view.displayMessage("Exiting...");
                    view.closeScanner();
                    return;
                default:
                    view.displayMessage("Invalid option. Please try again.");
                    break;
            }
        }
    }

    public static void main(String[] args) {
        UserApp app = new UserApp();
        app.run();
    }
}