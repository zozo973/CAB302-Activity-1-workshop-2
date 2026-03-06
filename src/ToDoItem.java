public class ToDoItem {
    private String description;
    private boolean isDone;

    public ToDoItem(String description) {
        this.description = description;
        this.isDone = false;
    }
    /**
     * Sets the description of the item.
     */
    public void setDescription(String description) {
        this.description = description;
    }
    /**
     * Gets the description of the item.
     */
    public String getDescription() {
        return this.description;
    }
    /**
     * Sets the finish Status of the item.
     */
    public void setIsDone(boolean status) {
        this.isDone = status;
    }
    /**
     * Gets the finish Status of the item.
     */
    public boolean getIsDone() {
        return this.isDone;
    }


}
