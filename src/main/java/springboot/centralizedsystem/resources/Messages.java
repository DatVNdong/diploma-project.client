package springboot.centralizedsystem.resources;

public class Messages {

    public static final String INVALID_ACCOUNT_ERROR = "Invalid username or password.";
    public static final String TOKEN_EXPIRED_ERROR = "Sorry, your session has expired. Please login again.";
    public static final String DEACTIVE_USER = "Sorry, your account has been disabled. Please login again";

    public static String DELETE(String resource, boolean isDeleteSuccess) {
        return isDeleteSuccess ? "Successfully deleted " + resource + "!" : "Error, failed to delete " + resource + ".";
    }

    public static final String DATABASE_ERROR = "Database error.";
    public static final String FORMAT_DATE_ERROR = "Format date error.";
    public static final String DATE_PICK_ERROR = "Start date must be before expired date.";

    public static final String HAS_SUBMITTED_MESSAGE = "Thank you, your submission has been received!";
    public static final String HAS_NOT_SUBMITTED_MESSAGE = "Sorry, you have not submitted to this report.";

    public static String IMPORT(boolean isImportSuccess) {
        return isImportSuccess ? "Successfully imported datas to Database!"
                : "Error, failed to delete imported datas to Database.";
    }

    public static final String UNAUTHORIZED_MESSAGE = "Sorry, we couldn't confirm it's you.";
}
