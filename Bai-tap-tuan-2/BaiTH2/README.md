# Ứng dụng kiểm tra định dạng Email (Kotlin)

Ứng dụng được viết bằng Kotlin trên Android Studio. Giao diện cho phép người dùng nhập email và kiểm tra tính hợp lệ theo điều kiện định dạng.

---

## Công nghệ sử dụng

- Ngôn ngữ: Kotlin  
- IDE: Android Studio  
- UI: XML Layout  
- Android SDK: API 21+

---

## Cách chạy ứng dụng

1. Mở Android Studio.
2. Chọn `File > Open` và trỏ đến thư mục dự án (ví dụ: `BaiTH2/`).
3. Chờ Android Studio sync Gradle hoàn tất.
4. Kết nối thiết bị ảo (AVD) hoặc điện thoại thật.
5. Nhấn nút **Run** (hoặc `Shift + F10`) để chạy ứng dụng.

---

## Quy tắc kiểm tra email

- Nếu email là `null` hoặc **rỗng** → hiện thông báo:  
  **"Email không hợp lệ"**
  
- Nếu email **không chứa ký tự "@"** → hiện thông báo:  
  **"Email không đúng định dạng"**
  
- Nếu email hợp lệ → hiện thông báo:  
  **"Bạn đã nhập email hợp lệ"**

---

## Giao diện demo

### 1. Giao diện khi chưa nhập gì (null hoặc rỗng)

![Giao diện demo 1](images/email_1_ui_demo.jpg)

### 2. Giao diện khi nhập sai định dạng (không có @)

![Giao diện demo 2](images/email_2_ui_demo.jpg)

### 3. Giao diện khi nhập đúng định dạng

![Giao diện demo 3](images/email_3_ui_demo.jpg)

- Trường nhập email với placeholder.
- Nút **Kiểm tra**.
- Thông báo lỗi hoặc hợp lệ hiển thị bên dưới tùy vào kết quả kiểm tra.

---
