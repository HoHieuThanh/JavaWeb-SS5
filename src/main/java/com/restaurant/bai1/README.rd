Lỗi 1: Sai đường dẫn thư mục (prefix)
resolver.setPrefix("/WEB-INF/views");
Vì: Đây là thư mục dùng cho JSP, Thymeleaf phải dùng /WEB-INF/templates/

Lỗi 2: Sai định dạng file (suffix)
resolver.setSuffix(".jsp");
Vì:.jsp là của JSP, Thymeleaf dùng .html