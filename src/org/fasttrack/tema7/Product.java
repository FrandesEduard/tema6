package org.fasttrack.tema7;

import javax.xml.xpath.XPathEvaluationResult;

public class Product {

    public String name;
    public int price;
    public int quantity;
    public String category;

    public Product(String nume, int pret, int cantitate, String categorie) {
        name = nume;
        price = pret;
        quantity = cantitate;
        category = categorie;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public boolean hasStock() {
        if (quantity != 0) {
            return true;
        } else {
            return false;
        }

    }

    public boolean isCategory() {
        if (category == category) {
            return true;
        } else {
            return false;
        }
    }
}
