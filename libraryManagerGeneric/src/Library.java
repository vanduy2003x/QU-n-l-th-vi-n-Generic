import Model.Book;
import Model.BookModel;
import Model.Reader;
import Model.ReaderModel;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Library {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
                        // Sách
        List<Book> books = new ArrayList<>();
        BookModel bookModelO = new BookModel();
        System.out.println("Nhập Sách");
                        System.out.println("ID");
                        int id = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Name");
                        String name = scanner.nextLine();
                        System.out.println("Author");
                        String author = scanner.nextLine();
                        System.out.println("PublicDate");
                        LocalDate publicDate = LocalDate.now();
                        scanner.nextLine();
                        Book book = new Book(id, name, author, publicDate);
                        books.add(book);
                        // Tác Giả
        List<Reader> readers = new ArrayList<>();
        ReaderModel readerModel = new ReaderModel();
        System.out.println("Nhập Tác Giả");
                        System.out.println("ID");
                        int id1 = scanner.nextInt();
                        scanner.nextLine();
                        System.out.println("Name");
                        String name2 = scanner.nextLine();
                        LocalDate localDate = LocalDate.now();
                        Reader reader = new Reader(id1,name2,localDate);
                        readers.add(reader);
        for (int i = 0; i < books.size(); i++) {
            System.out.println("Mời bạn chọn nhiệm vụ");
            System.out.println("1. Sách \n2. Người đọc ");
            System.out.println("Mời bạn chọn");
            int chon = scanner.nextInt();
            switch (chon) {
                case 1:
                System.out.println("Sách");
                System.out.println("1. Thêm tên sách \n2.Xóa  \n3. Sửa Sách");
                System.out.println("Mời bạn chọn chức năng");
                int chonlua = scanner.nextInt();
                if (chonlua==1 || chonlua<=1) {
                        bookModelO.insert(book,books);
                }
                else if (chonlua==2||chonlua<=2){
                    bookModelO.delete(book,books);
                }
                else if (chonlua==3 || chonlua<=3){
                    bookModelO.update(book,books);
                }
                break;
                case 2:
                    System.out.println("Tác Giả");
                    System.out.println("1. Thêm tên sách \n2.Xóa  \n3. Sửa Sách");
                    System.out.println("Mời bạn chọn chức năng");
                    int chonlua2 = scanner.nextInt();
                    if (chonlua2==1 || chonlua2<=1) {
                        readerModel.insert(reader,readers);
                    }
                    else if (chonlua2==2||chonlua2<=2){
                        readerModel.update(reader,readers);
                    }
                    break;
        }
            }
    }
}
