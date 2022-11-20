package com.jyp.controller;

import com.jyp.pojo.Product;
import com.jyp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/20 16:02
 */
@Controller
public class ProductController {
    @Autowired
    ProductService productService;

    @RequestMapping("product/{cid}")
    public String Products() {
        return "admin/product_list";
    }

    @RequestMapping("listproduct/{cid}")
    @ResponseBody
    public List<Product> listProducts(@PathVariable("cid") Integer cid) {
        List<Product> productsByCid = productService.getProductsByCid(cid);
        return productsByCid;
    }

    @RequestMapping("admin_product_add")
    public String addProduct(Product p) {
        productService.addProduct(p);
        return "redirect:/product/" + p.getCid();
    }

    @RequestMapping("deleteProduct/{id}")
    @ResponseBody
    public String deleteProduct(@PathVariable("id") Integer id) {
        productService.deleteProductById(id);
        return "200";
    }

    @RequestMapping("editProduct/{pid}")
    public String editProduct() {
        return "admin/product_edit";
    }

    @RequestMapping("findproduct/{pid}")
    @ResponseBody
    public Product findproductByPid(@PathVariable("pid") Integer pid) {
        Product product = productService.findproductByPid(pid);
        return product;
    }

    @RequestMapping("admin_product_update")
    public String update(Product p) {
        System.out.println(p);
        productService.update(p);
        Product product = productService.selectByid(p.getId());
        return "redirect:/product/" + product.getCid();
    }
}
