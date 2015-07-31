package Script

import groovyinaction.chapter2.Book

/**
 * Created by root on 7/29/15.
 */
Book gina = new Book('Groovy in Action')

assert gina.getTitle() == 'Groovy in Action'
assert getTitleBackwards(gina) == 'noitcA ni yvoorG'

String getTitleBackwards(book) {
    String title = book.getTitle()
    return title.reverse()
}

class BookBean {
    String title
}

def groovyBook = new BookBean()

groovyBook.setTitle('Groovy in Action')
assert groovyBook.getTitle() == 'Groovy in Action'

//Utilizes accessors and is not field access
groovyBook.title = 'Groovy Conquers the world'
assert groovyBook.title == 'Groovy Conquers the world'