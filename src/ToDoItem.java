public class ToDoItem {
    private String description;
    private boolean isDone;

    // TODO Now:

    public String getDescription(){
        return description;
    }
    public boolean isDone(){
        return isDone;
    }
    public void setDescription(String newDescription) {
        this.description = newDescription;
    }
    public void setIsDone(boolean isDone) {
        this.isDone = isDone;
    }



    ToDoItem(String description){
        this.description = description;
        this.isDone = false;
    }
    // Add a constructor to initialize the item with the description, and isDone as false, with a single parameter for the description
    // Add getters and setters for each field
}