package com.app.carhire.Model;

import javax.persistence.*;

@Entity
@Table(name ="CAR")
public class Car {
    @Id
    @Column(name = "CAR_ID")
    private Long carId;
    @Column(name = "CAR_NAME")
    private String name;

    @ManyToOne
    @JoinColumn(name = "OWNER_ID")
    private Owner owner;

    @OneToOne
    @JoinColumn(name = "CUSTOMER_ID")
    private Customer customer;

    @Column(name = "CAR_BRAND")
    private String brand;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "CAPACITY")
    private String capacity;
    @Column(name = "COLOR")
    private String color;
    @Column(name = "NUMBER_PLATE")
    private Long numberPlate;
    @Column(name = "STATUS")
    private String status;

    public Car(){

    }

    public Car(Long carId, String name, Owner owner, Customer customer, String brand, String model, String capacity, String color, Long numberPlate, String status) {
        this.carId = carId;
        this.name = name;
        this.owner = owner;
        this.customer = customer;
        this.brand = brand;
        this.model = model;
        this.capacity = capacity;
        this.color = color;
        this.numberPlate = numberPlate;
        this.status = status;
    }

    public Long getCarId() {
        return carId;
    }

    public void setCarId(Long carId) {
        this.carId = carId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCapacity() {
        return capacity;
    }

    public void setCapacity(String capacity) {
        this.capacity = capacity;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Long getNumberPlate() {
        return numberPlate;
    }

    public void setNumberPlate(Long numberPlate) {
        this.numberPlate = numberPlate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Car{" +
                "carId=" + carId +
                ", name='" + name + '\'' +
                ", owner=" + owner +
                ", customer=" + customer +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", capacity='" + capacity + '\'' +
                ", color='" + color + '\'' +
                ", numberPlate=" + numberPlate +
                ", status='" + status + '\'' +
                '}';
    }
}
