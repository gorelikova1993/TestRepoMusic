package com.example.juliagorelikova.musicalapp;

public class Book {
//    name of the book
    private String name;
//    author of the book
    private String author;
//    genre of the book(for e.x. detective, novel and etc)
    private String genre;
/** century of creation of the book */
    private int century;

    /**
    * Create a new Book object
    * @param name is the name of the book
     *@param author is the author of the book
     *@param genre is the genre of the book
     *@param century is the century when the book was written
     *
    */

    public Book(String name, String author, String genre, int century){
        this.name = name;
        this.author = author;
        this.genre = genre;
        this.century = century;
    }

    /**
     *
     * @return name of the book
     */
    public String getName() {
        return name;
    }

    /**
     *
     * @return author of the book
     */

    public String getAuthor(){
        return author;
    }

    /**
     *
     * @return genre of the book
     */

    public String getGenre(){
        return genre;
    }

    /**
     *
     * @return century when the book was written
     */

    public String getCentury(){
        return century + "th Century";
    }




}
