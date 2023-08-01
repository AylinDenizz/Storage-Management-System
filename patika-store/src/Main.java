import Model.*;
import Service.ProductManagerService;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

                ProductManagerService<Notebook> productManagerNotebook = new ProductManagerService<>();
                ProductManagerService<Cellphone> productManagerCellphone = new ProductManagerService<>();
                ArrayList<Notebook> notebookList = new ArrayList<>();
                ArrayList<Cellphone> cellphoneList = new ArrayList<>();


                // Add some sample products
                productManagerNotebook.addProduct(new Notebook("HUAWEI Matebook 14", new Brand(1, BrandEnum.HUAWEI),
                        1, new BigDecimal("7000.0"), 0.0, 100, new Ram(16, "GB"), 14.0, new Storage(512, "GB")), notebookList);
                productManagerNotebook.addProduct(new Notebook("LENOVO V14 IGL", new Brand(2, BrandEnum.LENOVO),
                        2, new BigDecimal("3699.0"), 0.0, 50, new Ram(8, "GB"), 14.0, new Storage(1024, "GB")),notebookList);
                productManagerCellphone.addProduct(new Cellphone("SAMSUNG GALAXY A51", new Brand(3, BrandEnum.SAMSUNG),
                        3, new BigDecimal("3199.0"), 0.0, 200, new Ram(6, "GB"), 6.5,
                        new Storage(128, "GB"), ColorEnum.BLACK, 4000),cellphoneList);


                Scanner scanner = new Scanner(System.in);

                while (true) {
                    System.out.println("PatikaStore Ürün Yönetim Paneli !");
                    System.out.println("1 - Notebook İşlemleri");
                    System.out.println("2 - Cep Telefonu İşlemleri");
                    System.out.println("3 - Marka Listele");
                    System.out.println("0 - Çıkış Yap");
                    System.out.print("Tercihiniz : ");
                    int choice = scanner.nextInt();

                    switch (choice) {
                        case 1:
                            productManagerNotebook.listProduct(notebookList);
                            break;
                        case 2:
                            productManagerCellphone.listProduct(cellphoneList);
                            break;
                        case 3:
                            System.out.println(productManagerNotebook.listBrands(notebookList));
                            break;
                        case 0:
                            System.out.println("Çıkış yapılıyor...");
                            scanner.close();
                            System.exit(0);
                            break;
                        default:
                            System.out.println("Geçersiz tercih, lütfen tekrar deneyin.");
                            break;
                    }
                }
            }
        }

