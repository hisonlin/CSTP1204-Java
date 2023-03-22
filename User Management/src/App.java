import java.util.List;
import java.util.Scanner;

import controller.UserController;
import dao.UserDAO;
import dto.User;

public class App {
    public static void main(String[] args) throws Exception {
        showUserMenu();
    }

    public static void showUserMenu() {
        Scanner sc = new Scanner(System.in);
        UserController userController = new UserController();

        String userSelected = "";

        do {
            System.out.println("**************************************");
            System.out.println("1: Register a user");
            System.out.println("2: Get All Users");
            System.out.println("3: Delete a User");
            System.out.println("4: Update a user");
            System.out.println("5: Search a user by ID");
            System.out.println("6: Search a user by email and password");
            System.out.println("7: EXIT");
            System.out.println("**************************************");

            userSelected = sc.nextLine();

            switch (userSelected) {
                case "1":
                    System.out.println("Enter User Name: ");
                    String userName = sc.nextLine();

                    System.out.println("Enter User Email: ");
                    String userEmail = sc.nextLine();

                    System.out.println("Enter User Password: ");
                    String userPassword = sc.nextLine();

                    System.out.println("Enter User age: ");
                    int userAge = sc.nextInt();

                    User user = new User(userName, userEmail, userPassword, userAge);
                    userController.insert(user);
                    break;

                case "2":
                    System.out.println("---------------------");
                    displayUserList(userController.getUserList());
                    System.out.println("---------------------");
                    break;

                case "3":

                    System.out.println("---------------------");
                    displayUserList(userController.getUserList());
                    System.out.println("---------------------");

                    System.out.println("Enter User Id you want to delete : ");
                    int id = sc.nextInt();
                    userController.delete(id);

                    System.out.println("------AFTER DELETING---------");
                    displayUserList(userController.getUserList());
                    System.out.println("---------------------");

                    // ASSIGNMENT IS
                    // Implemenet USER BY ID
                    // Implement Update User
                    // Implement getUserBasedByIDandPassword

                case "4":
                    System.out.println("---------------------");
                    displayUserList(userController.getUserList());
                    System.out.println("---------------------");

                    System.out.println("Enter User Id you want to update : ");
                    int updateId = sc.nextInt();
                    sc.nextLine(); // consume the new line character left in the input stream

                    User userToUpdate = userController.getUserById(updateId);
                    if (userToUpdate == null) {
                        System.out.println("No user found with ID " + updateId);
                        break;
                    }

                    System.out.println("Enter New User Name (leave blank to keep current name): ");
                    String newUserName = sc.nextLine();
                    if (!newUserName.isBlank()) {
                        userToUpdate.setName(newUserName);
                    }

                    System.out.println("Enter New User Email (leave blank to keep current email): ");
                    String newUserEmail = sc.nextLine();
                    if (!newUserEmail.isBlank()) {
                        userToUpdate.setEmail(newUserEmail);
                    }

                    System.out.println("Enter New User Password (leave blank to keep current password): ");
                    String newUserPassword = sc.nextLine();
                    if (!newUserPassword.isBlank()) {
                        userToUpdate.setPassword(newUserPassword);
                    }

                    System.out.println("Enter New User Age (leave blank to keep current age): ");
                    String newUserAgeString = sc.nextLine();
                    if (!newUserAgeString.isBlank()) {
                        try {
                            int newUserAge = Integer.parseInt(newUserAgeString);
                            userToUpdate.setAge(newUserAge);
                        } catch (NumberFormatException e) {
                            System.out.println("Invalid age. Please enter a valid number.");
                        }
                    }

                    userController.update(userToUpdate);
                    System.out.println("------AFTER UPDATING---------");
                    displayUserList(userController.getUserList());
                    System.out.println("---------------------");
                    break;

                case "5":
                    System.out.println("Enter User ID: ");
                    int searchId = sc.nextInt();
                    sc.nextLine(); // consume the new line character left in the input stream

                    User searchedUser = userController.getUserById(searchId);
                    if (searchedUser == null) {
                        System.out.println("No user found with ID " + searchId);
                    } else {
                        System.out.println("User found: ");
                        searchedUser.getUserInfo();
                    }
                    break;

                case "6":
                    System.out.println("Enter User Email: ");
                    String searchEmail = sc.nextLine();

                    System.out.println("Enter User Password: ");
                    String searchPassword = sc.nextLine();

                    User userFound = userController.getUserByEmailAndPassword(searchEmail, searchPassword);

                    if (userFound != null) {
                        System.out.println("User found:");
                        userFound.getUserInfo();
                    } else {
                        System.out.println("No user found with the provided email and password.");
                    }

                    break;

            }

        } while (!userSelected.equals("7"));
        sc.close();
    }

    public static void displayUserList(List<User> users) {
        for (User user : users) {
            user.getUserInfo();
        }
    }
}