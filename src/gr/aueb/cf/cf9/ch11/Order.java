package gr.aueb.cf.cf9.ch11;

import java.util.List;


    public class Order {
        private int id;


        private String orderDate;
        private String status; // "Pending", "Shipped", "Delivered"
        private double totalPrice;

        public Order(int id, String orderDate, double totalPrice, String status) {
            this.id = id;
            this.orderDate = orderDate;
            this.totalPrice = totalPrice;
            this.status = status;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


        public String getOrderDate() {
            return orderDate;
        }

        public void setOrderDate(String orderDate) {
            this.orderDate = orderDate;
        }

        public String getStatus() {
            return status;
        }

        public void setStatus(String status) {
            this.status = status;
        }

        public double getTotalPrice() {
            return totalPrice;
        }

        public void setTotalPrice(double totalPrice) {
            this.totalPrice = totalPrice;
        }
    }
