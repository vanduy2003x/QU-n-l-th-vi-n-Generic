package Model;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class BookModel implements IService<Book> {
   /* BookModel bookModel = new BookModel();
    public Book inputBook(Scanner scanner, List<Book>books){
        System.out.println("ID");
        int id = scanner.nextInt();
        System.out.println("Name");
        String name = scanner.nextLine();
        System.out.println("Author");
        String author = scanner.nextLine();
        System.out.println("PublicDate");
        int a = scanner.nextInt();
        LocalDate publicDate = LocalDate.now();
        Book book = new Book(id,name,author,publicDate);
        return book;
    }*/
    @Override
    public void insert(Book obj, List<Book> objs) {
        objs.add(obj);
        System.out.println(objs);

    }

    @Override
    public void delete(Book obj, List<Book> objs) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Xóa nhân viên theo tên sản phẩm");
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        Book book1 = null;
        for (Book book : objs){
            if (book.getName().equalsIgnoreCase(name)){
                book1 = book;
                break;
            }
        }
        if (book1 != null){
            objs.remove(book1);
            System.out.println("Sản phẩm đã được xõa");
        }else {
            System.out.println("Nhân viên không tồn tại"+ name);
        }
    }

    @Override
    public void update(Book obj, List<Book> objs) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Nhập tên sách cần cập nhật mới");
        String name = scanner.nextLine();
        Book book1 = null;
        for (Book book : objs){
            if (book.getName().equalsIgnoreCase(name)){
                book1 = book;
                break;
            }
        }
        if (book1 != null){
            System.out.println("Nhập id mới");
            int id  = scanner.nextInt();
          obj.setId(id);
            System.out.println("Nhập tên mới");
            String name2 = scanner.nextLine();
            scanner.nextLine();
          obj.setName(name2);
            System.out.println("Tác giả mới");
            String author = scanner.nextLine();
          obj.setAuthor(author);
            LocalDate publicdate = LocalDate.now();
          obj.setPublicDate(publicdate);
            System.out.println();
            System.out.println("Sản phẩm đã được thay");
        }else {
            System.out.println("Nhân viên không tồn tại"+ name);
        }
    }
}
