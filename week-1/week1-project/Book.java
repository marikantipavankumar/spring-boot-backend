public class Book {
    private String id;
    private String title;
    private String author;
    private String category;
    private boolean isAvailable = true;

    public Book(String id,String title,String author,String category){
        this.id = id;
        this.title = title;
        this.category = category;
        this.category = category;
    }

    public String getId(){
        return id;
    }
    public String getTitle(){
        return title;
    }
    public String getCategory(){
        return category;
    }
    public String getAuthor(){
        return author;
    }
    public boolean isAvailable(){
        return isAvailable;
    }

    public void setAvailable(boolean  available){
        isAvailable = available;
    }

    public String toString(){
        return id+" | "+title +" | "+" author"+ " | " +category+" | " +(isAvailable ?"Available ":"Issued");
    }
}
