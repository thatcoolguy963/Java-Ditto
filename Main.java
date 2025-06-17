class Main {
    
    public static void main(String[] args){

       BookModel theIsisPapers = new BookModel("The Isis Papers", "Dr. Frances Cress Welsing", 301);
       AudioBook theColorOfLaw = new AudioBook("The Color Of Law", "Richard Rothstein", 251, 35000);
       Ebook theyCameBeforeColumbus = new Ebook("They Came Before Columbus", "Ivan Van Sertima", 336, "Ebook");

       System.out.println(theColorOfLaw.toString());
       System.out.println(theIsisPapers.toString());
       System.out.println(theyCameBeforeColumbus.toString());

    }
}