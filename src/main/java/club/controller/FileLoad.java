package club.controller;

import club.config.FileConfig;
import org.springframework.stereotype.Controller;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.UUID;

@Controller
public class FileLoad {


    public static String uploadAdminPic(MultipartFile file) {
        String picName = UUID.randomUUID().toString().replaceAll("-","");

        //获取上传文件得元素得名称
        String fileName = file.getOriginalFilename();
        String substring = fileName.substring(fileName.lastIndexOf("."));
        //上传文件
        try {
            file.transferTo(new File(FileConfig.IMAGE_PATH + picName + substring));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String name = picName + substring;

        return name;
    }

    public static String uploadUserPic(MultipartFile file) {
        String picName = UUID.randomUUID().toString().replaceAll("-","");

        //获取上传文件得元素得名称
        String fileName = file.getOriginalFilename();
        String substring = fileName.substring(fileName.lastIndexOf("."));
        //上传文件
        try {
            file.transferTo(new File(FileConfig.IMAGE_PATH + picName + substring));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String name = picName + substring;

        return name;
    }

    public static String uploadPetPic(MultipartFile file) {
        String picName = UUID.randomUUID().toString().replaceAll("-","");
        //获取上传文件得元素得名称
        String fileName = file.getOriginalFilename();
        String substring = fileName.substring(fileName.lastIndexOf("."));
        //上传文件
        try {
            file.transferTo(new File(FileConfig.IMAGE_PATH + picName + substring));
        } catch (IOException e) {
            e.printStackTrace();
        }
        String name = picName + substring;

        return name;
    }


}
