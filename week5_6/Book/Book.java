package code.week5_6.Book;

public class Book
{
    private String title;
    private String author;
    private String publisher;
    private String copyright_date;

    public Book (String title , String author , String publisher , String copyright_date )
    {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.copyright_date = copyright_date;
    }


    public String getTitle()
    {
        return title;
    }

    public String getAuthor()
    {
        return author;
    }

    public String getPublisher()
    {
        return publisher;
    }

    public String getCopyright_date()
    {
        return copyright_date;
    }


    public void setTitle(String title) //setter
    {
        this.title = title;
    }

    public void setAuthor(String author) //setter
    {
        this.author = author;
    }
    public void setPublisher(String publisher) //setter
    {
        this.publisher = publisher;
    }
    public void setCopyright_date(String copyright_date) //setter
    {
        this.copyright_date = copyright_date;
    }



    @Override //does not need to be stated, but it is best practice to do so
    public String toString()
    {
        return "-----------------------------"+
                "\n Book title: " + getTitle()
                + "\n Book author:  " + getAuthor()
                + "\n Book publisher:  " + getPublisher()
                + "\n Book copyright date:  " + getCopyright_date()
                +"\n-----------------------------";

    }

}
