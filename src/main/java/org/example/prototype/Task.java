package org.example.prototype;

public class Task implements Cloneable{
    private String title;
    private String content;
    private Boolean isComplete;
    private Owner owner;

    public Owner getUser() {
        return owner;
    }

    public void setUser(Owner owner) {
        this.owner = owner;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Boolean getComplete() {
        return isComplete;
    }

    public void setComplete(Boolean complete) {
        isComplete = complete;
    }

    public Task(String title, String content, Boolean isComplete, Owner owner){
        this.title = title;
        this.content = content;
        this.isComplete = isComplete;
        this.owner = owner;
    }

    @Override
    public Task clone() throws CloneNotSupportedException {
        Task taskClone = (Task) super.clone();
        taskClone.owner = (Owner) taskClone.owner.clone();
        return taskClone;
    }

    @Override
    public String toString() {
        return owner.toString() + "\n" + title + "\n" + content + "\n" + isComplete;
    }
}
