/**
 * User: {Sewwandi_Wijayaratna : sewwandi.wijayaratna@gmail.com}
 * Date: 5/15/13
 * Time: 11:42 PM
 */

public class BookTest {
    public static void main(String[] args) {
        Book[] mybook =new Book[3];

        mybook[0] =new Book();
        mybook[1] =new Book();
        mybook[2] =new Book();

        mybook[0].title ="VLSI";
        mybook[1].title ="fast";
        mybook[2].title ="Book";

        mybook[0].author ="Sew";
        mybook[1].author ="raj";
        mybook[2].author ="Nuw";

        int x;
        for (x=0; x < mybook.length; x++) {
            System.out.println("Title is "+  mybook[x].title+" "+"Author is"+ mybook[x].author);
        }


    }
}
