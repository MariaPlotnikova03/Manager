package ru.netology.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode(callSuper = true)
@Data
public class SmartPhone extends Product {
    private String manufacturer;

    public SmartPhone() {
    }

    public SmartPhone(int id, String name, int price, String manufacturer) {
        super(id, name, price);
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (search.equalsIgnoreCase(manufacturer)) {
            return true;
        }
        return false;
    }
}