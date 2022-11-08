package Model;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

public class ReaderModel implements IService<Reader> {
/*    public Reader inputReader(Scanner scanner, List<Reader> Reader){
        System.out.println("ID");
        int id = scanner.nextInt();
        System.out.println("Name");
        String name = scanner.nextLine();
        System.out.println("BirthDate");
        LocalDate birthDate = LocalDate.now();
        Reader reader = new Reader(id,name,birthDate);
        return reader;
    }*/

    @Override
    public void insert(Reader obj, List<Reader> objs) {
        objs.add(obj);
        System.out.println(objs);
    }

    @Override
    public void delete(Reader obj, List<Reader> objs) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("Xóa nhân viên theo tên sản phẩm");
        System.out.println("Nhập tên sản phẩm");
        String name = scanner.nextLine();
        Reader reader1 = null;
        for (Reader reader : objs){
            if (reader.getName().equalsIgnoreCase(name)){
                reader1 = reader;
                break;
            }
        }
        if (reader1 != null){
            objs.remove(reader1);
            System.out.println("Sản phẩm đã được xõa");
        }else {
            System.out.println("Nhân viên không tồn tại"+ name);
        }
    }

    @Override
    public void update(Reader obj, List<Reader> objs) {

    }
}
