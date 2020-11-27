package aop;

import org.springframework.stereotype.Component;

@Component
public class UniLibrary extends AbstractLibrary{


    public void getBook(Book book){
        System.out.println("Мы берем книгу из UniLibrary " + book.getName() );
    }
}
