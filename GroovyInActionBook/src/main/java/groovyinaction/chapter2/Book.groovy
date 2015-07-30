package groovyinaction.chapter2
/**
 * Created by root on 7/29/15.
 */
class Book {
    private String title
    Book (String theTitle) {
        title = theTitle
    }
    String getTitle(){
        return title
    }
}
