package com.jyp.controller;

import com.jyp.pojo.ProductImage;
import com.jyp.service.ProductImageService;
import com.jyp.util.ImageUtil;
import com.jyp.util.UploadedImageFile;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpSession;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/20 20:42
 */

@Controller
public class ProductImageController {
    @Autowired
    ProductImageService productImageService;

    @RequestMapping("findFirstProductImageId/{pid}")
    @ResponseBody
    public String findFirstProductImageId(@PathVariable("pid") Integer pid) {
        String firstProductImageId = productImageService.findFirstProductImageId(pid);
        return firstProductImageId;
    }

    @RequestMapping("image/{pid}")//pid是productId
    public String ProductImage() {
        return "admin/productimage_edit";
    }

    @RequestMapping("findSingleImageByPid/{pid}")
    @ResponseBody
    public List<ProductImage> findSingleImageByPid(@PathVariable("pid") Integer pid) {
        List<ProductImage> singleImageByPid = productImageService.findSingleImageByPid(pid);
        return singleImageByPid;
    }

    @RequestMapping("findDetailImageByPid/{pid}")
    @ResponseBody
    public List<ProductImage> findDetailImageByPid(@PathVariable("pid") Integer pid) {
        List<ProductImage> detailImageByPid = productImageService.findDetailImageByPid(pid);
        return detailImageByPid;
    }

    @RequestMapping("deleteImage/{piid}")//piid是图片id
    @ResponseBody
    public HttpStatus deleteImage(@PathVariable("piid") Integer piid) {
        productImageService.deleteImage(piid);
        return HttpStatus.OK;
    }


    @RequestMapping("admin_ProductImage_add")
    public String addImage(ProductImage p, HttpSession session, UploadedImageFile uploadedImageFile) throws IOException {
        productImageService.addImage(p);
//        System.out.println(p);
        if (p.getType().equals("type_single")) {
            File imageFolder = new File(session.getServletContext().getRealPath("img/productSingle"));
            File file = new File(imageFolder, p.getId() + ".jpg");
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            uploadedImageFile.getImage().transferTo(file);
            BufferedImage img = ImageUtil.change2jpg(file);
            ImageIO.write(img, "jpg", file);

        /*
            写入到本地硬盘
        */
            File outputfile = new File("D:\\jvyoupin\\src\\main\\webapp\\img\\productSingle\\" + p.getId() + ".jpg");
            ImageIO.write(img, "jpg", outputfile);
        } else {
            File imageFolder = new File(session.getServletContext().getRealPath("img/productDetail"));
            File file = new File(imageFolder, p.getId() + ".jpg");
            if (!file.getParentFile().exists())
                file.getParentFile().mkdirs();
            uploadedImageFile.getImage().transferTo(file);
            BufferedImage img = ImageUtil.change2jpg(file);
            ImageIO.write(img, "jpg", file);

        /*
            写入到本地硬盘
        */
            File outputfile = new File("D:\\jvyoupin\\src\\main\\webapp\\img\\productDetail\\" + p.getId() + ".jpg");
            ImageIO.write(img, "jpg", outputfile);
        }

        return "redirect:/image/" + p.getPid();
    }
}
