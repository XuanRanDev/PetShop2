package club.controller;

import club.config.FileConfig;

import javax.servlet.ServletException;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * Created by XuanRan on 2022/10/14
 */

@WebServlet("/getClothesImg")
public class ImageController extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        FileInputStream fileInputStream = new FileInputStream(FileConfig.IMAGE_PATH + name);
        resp.setContentType("image/png");
        ServletOutputStream outputStream = resp.getOutputStream();
        int len = 0;
        byte[] buffer = new byte[1024 * 10];
        while ((len = fileInputStream.read(buffer)) != -1) {
            outputStream.write(buffer, 0, len);
        }
        outputStream.flush();
        fileInputStream.close();
        outputStream.close();
    }
}
