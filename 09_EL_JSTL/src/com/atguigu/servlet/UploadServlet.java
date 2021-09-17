package com.atguigu.servlet;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.FileItemFactory;
import org.apache.commons.fileupload.FileUploadException;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.util.List;

/**
 * @author k
 * @create 2021-06-02 23:56
 */
public class UploadServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        System.out.println("文件上传过来了");
//        ServletInputStream inputStream = req.getInputStream();
//
//        byte[] bytes = new byte[1024];
//        int len = 0;
//        while ((len = inputStream.read(bytes))!= 1){
//            System.out.println(new String(bytes,0,len));
//        }
        if(ServletFileUpload.isMultipartContent(req)){
            FileItemFactory fileItemFactory= new DiskFileItemFactory();
            ServletFileUpload servletFileUpload = new ServletFileUpload(fileItemFactory);
            try {
                List<FileItem> list = servletFileUpload.parseRequest(req);
                for (FileItem fileItem : list) {
                    if(fileItem.isFormField()){
                        System.out.println(fileItem.getFieldName()+"="+fileItem.getString("UTF-8"));
                    }else {
                        System.out.println(fileItem.getFieldName()+"="+fileItem.getName());
                        fileItem.write(new File("g:\\"+fileItem.getName()));
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
