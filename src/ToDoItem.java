public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field

    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDescription() {
        return this.description;
    }

    public void setIsDone(boolean status) {
        this.isDone = status;
    }

    public boolean getIsDone() {
        return this.isDone;
    }


}
