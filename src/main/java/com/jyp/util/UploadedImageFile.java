package com.jyp.util;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author 明宇
 * @version 1.0
 * @date 2022/11/17 20:24
 */
public class UploadedImageFile {
    MultipartFile image;

    public MultipartFile getImage() {
        return image;
    }

    public void setImage(MultipartFile image) {
        this.image = image;
    }

}

