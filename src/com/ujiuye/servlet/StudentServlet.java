package com.ujiuye.servlet;

import com.ujiuye.pojo.Student;
import com.ujiuye.service.StudentService;
import com.ujiuye.utils.MyUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;
import java.util.UUID;

/**
 * @Author Bob
 * @Create 2021-07-18-19:04
 */
@MultipartConfig
@WebServlet("/studentServlet")
public class StudentServlet extends BaseServlet {

    private MyUtil myUtil = new MyUtil();
    private StudentService ss = new StudentService();

    public void insertStudent(HttpServletRequest req , HttpServletResponse resp) throws ServletException, IOException {
        String sname = req.getParameter("sname");
        String sex = req.getParameter("sex");
        String sbir = req.getParameter("sbir");
        String[] hobbies = req.getParameterValues("hobby");
        String hobby = MyUtil.arrayToString(hobbies);

        Student student = new Student(sname,Integer.parseInt(sex),sbir,hobby);

        // 上传图片
        Part photo = req.getPart("photo");
        String header = photo.getHeader("content-disposition");
        String filename = header.substring(header.indexOf("filename") + 10, header.length() - 1);
        if(!"".equals(filename)) {
            File file = new File("D:\\User\\stuPhoto");
            if(!file.exists()) {
                file.mkdir();
            }
            filename = UUID.randomUUID() + ".jpg";
            photo.write(file + "/" + filename);
            student.setPhoto(filename);
        }else {
            student.setPhoto("beau.jpg");
        }

        int i = ss.insertStudent(student);

        if(i > 0) {
//            req.getRequestDispatcher("studentServlet?mark=queryStudent").forward(req,resp);
            resp.sendRedirect("index.jsp");
        }else {
            System.out.println("添加失败");
        }

    }

}
