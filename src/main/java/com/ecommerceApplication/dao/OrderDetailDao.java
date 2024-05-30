package com.ecommerceApplication.dao;

import com.ecommerceApplication.entity.OrderDetail;
import com.ecommerceApplication.entity.User;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface OrderDetailDao extends CrudRepository<OrderDetail, Integer> {
    public List<OrderDetail> findByUser(User user);

    public List<OrderDetail> findByOrderStatus(String status);
}
