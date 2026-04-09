User click "Chỉnh sửa" (View dish-list.html)
Gửi request: /bai3/edit/{id}
Controller nhận @PathVariable id
Gọi Service lấy Dish theo id
Nếu tồn tại -> addAttribute("dish", dish)
Trả về View edit-dish.html
Thymeleaf dùng th:object + th:field để bind dữ liệu vào form
