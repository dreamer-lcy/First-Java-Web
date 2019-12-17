package com.dao.impl;

import com.dao.ProductDao;
import com.domain.Product;
import com.utils.DbUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDaoImpl1 implements ProductDao {
    //增加
    public int addProduct(Product product){
        int result=0;
        //获取连接
        DbUtil dbUtil=new DbUtil();
        Connection conn = dbUtil.getConnection();
        //sql
        String sql = "INSERT INTO fruit(name, price, number, description,create_date,update_date)"+
               "values("+"?,?,?,?,CURRENT_TIME (),CURRENT_TIME ())";
        //预编译
        PreparedStatement preparedStatement = null; //预编译SQL，减少sql执行
        try {
            preparedStatement = conn.prepareStatement(sql);
            //传参
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setDouble(3, product.getNumber());
            preparedStatement.setString(4, product.getDescription());

            //执行
            result=preparedStatement.executeUpdate();

            dbUtil.closeConn();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Product> showAll() {
        List<Product> list=new ArrayList<Product>();
        DbUtil dbUtil=new DbUtil();
        Connection conn=dbUtil.getConnection();
        String sql="select * from fruit";
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=conn.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Product product=new Product();
                product.setId(resultSet.getInt("ID"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setNumber(resultSet.getDouble("number"));
                product.setDescription(resultSet.getString("description"));
                product.setCreateDate(resultSet.getDate("create_date"));
                product.setUpdateDate(resultSet.getDate("update_date"));
                list.add(product);
            }
            dbUtil.closeConn();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }

    @Override
    public Product findProduct(int id) {
        Product product=new Product();
        ResultSet resultSet=null;
        DbUtil dbUtil=new DbUtil();
        Connection conn=dbUtil.getConnection();
        String sql="select * from fruit WHERE ID=?";
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=conn.prepareStatement(sql);
            preparedStatement.setInt(1,id);
            resultSet=preparedStatement.executeQuery();
            resultSet.next();
            product.setId(resultSet.getInt("ID"));
            product.setName(resultSet.getString("name"));
            product.setPrice(resultSet.getDouble("price"));
            product.setNumber(resultSet.getDouble("number"));
            product.setDescription(resultSet.getString("description"));
            product.setCreateDate(resultSet.getDate("create_date"));
            product.setUpdateDate(resultSet.getDate("update_date"));
            dbUtil.closeConn();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return product;
    }

    @Override
    public int updateProduct(Product product) {
        int result=0;
        //获取连接
        DbUtil dbUtil=new DbUtil();
        Connection conn = dbUtil.getConnection();
        //sql
        String sql = "UPDATE fruit SET name=?,number =?,description=?  where id=? ";
        //预编译
        PreparedStatement preparedStatement = null; //预编译SQL，减少sql执行
        try {
            preparedStatement = conn.prepareStatement(sql);
            //传参
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getNumber());
            preparedStatement.setString(3, product.getDescription());
            preparedStatement.setInt(4,product.getId());

            //执行
            result=preparedStatement.executeUpdate();

            dbUtil.closeConn();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public int deleteProduct(int id) {
        int result=0;
        //获取连接
        DbUtil dbUtil=new DbUtil();
        Connection conn = dbUtil.getConnection();
        //sql
        String sql = "DELETE FROM fruit where id=? ";
        //预编译
        PreparedStatement preparedStatement = null; //预编译SQL，减少sql执行
        try {
            preparedStatement = conn.prepareStatement(sql);
            preparedStatement.setInt(1,id);

            //执行
            result=preparedStatement.executeUpdate();

            dbUtil.closeConn();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    @Override
    public List<Product> queryProduct(String keyword) {
        List<Product> list=new ArrayList<Product>();
        DbUtil dbUtil=new DbUtil();
        Connection conn=dbUtil.getConnection();
        String sql="select * from fruit WHERE name LIKE '%"+keyword+"%'";
        PreparedStatement preparedStatement=null;
        try {
            preparedStatement=conn.prepareStatement(sql);
            ResultSet resultSet=preparedStatement.executeQuery();
            while (resultSet.next()){
                Product product=new Product();
                product.setId(resultSet.getInt("ID"));
                product.setName(resultSet.getString("name"));
                product.setPrice(resultSet.getDouble("price"));
                product.setNumber(resultSet.getDouble("number"));
                product.setDescription(resultSet.getString("description"));
                product.setCreateDate(resultSet.getDate("create_date"));
                product.setUpdateDate(resultSet.getDate("update_date"));
                list.add(product);
            }
            dbUtil.closeConn();

        } catch (SQLException e) {
            e.printStackTrace();
        }


        return list;
    }

}
