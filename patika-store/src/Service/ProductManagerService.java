package Service;

import Model.Brand;
import Model.Product;

import java.util.ArrayList;

import java.util.List;

public class ProductManagerService<T extends Product> {

    public void addProduct(T object, ArrayList<T> products) {
        products.add(object);
    }

    public List<T> filterProductsByType(Class<T> type, ArrayList<T> products) {
        List<T> filteredProducts = new ArrayList<>();
        for (T product : products) {
            if (type.isInstance(product)) {
                filteredProducts.add(type.cast(product));
            }
        }
        return filteredProducts;
    }

    public List<Brand> listBrands(ArrayList<T> products) {
        List<Brand> brands = new ArrayList<>();
        for (T product : products) {
            brands.add(product.getBrand());
        }
        return brands;
    }

    public <T extends Product> void displayProductTable(String title, List<T> productList) {
        System.out.println(title + "\n");
        System.out.println("----------------------------------------------------------------------------------------------------");
        System.out.printf("| %-3s | %-28s | %-9s | %-9s | %-10s | %-10s | %-9s |%n",
                "ID", "Ürün Adı", "Fiyat", "Marka", "Depolama", "Ekran", "RAM");
        System.out.println("----------------------------------------------------------------------------------------------------");
        for (T product : productList) {
            System.out.printf("| %-3d | %-28s | %-9s | %-9s | %-10s | %-10s | %-9s |%n", product.getUniqueId(),
                    product.getProductName(),product.getPrice(),product.getBrand(),product.getBrand(),
                    product.getStorage(),product.getScreenSize(),product.getRam());
        }

        System.out.println("----------------------------------------------------------------------------------------------------\n");
    }




    public void listProduct(ArrayList<T> products) {
        List<T> filteredProducts = filterProductsByType((Class<T>) products.get(0).getClass(), products);

        displayProductTable(filteredProducts.get(0).getProductType() + " Listesi : ", filteredProducts);
    }
}
