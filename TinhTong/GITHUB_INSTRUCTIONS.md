# Hướng dẫn đẩy code lên GitHub

## 1. Cài đặt Git

Trước tiên, bạn cần cài đặt Git trên máy tính của mình:

1. Truy cập trang web chính thức của Git: https://git-scm.com/downloads
2. Tải xuống phiên bản phù hợp với hệ điều hành của bạn (Windows, macOS, Linux)
3. Cài đặt Git theo hướng dẫn trên màn hình
4. Sau khi cài đặt, mở Command Prompt hoặc PowerShell và kiểm tra cài đặt bằng lệnh: `git --version`

## 2. Cấu hình Git

Sau khi cài đặt Git, bạn cần cấu hình thông tin người dùng:

```
git config --global user.name "Tên của bạn"
git config --global user.email "email@example.com"
```

## 3. Tạo tài khoản GitHub

Nếu bạn chưa có tài khoản GitHub:

1. Truy cập https://github.com
2. Nhấp vào "Sign up" và làm theo hướng dẫn để tạo tài khoản mới

## 4. Tạo repository mới trên GitHub

1. Đăng nhập vào GitHub
2. Nhấp vào dấu "+" ở góc trên bên phải và chọn "New repository"
3. Đặt tên cho repository (ví dụ: "TinhTong")
4. Thêm mô tả (tùy chọn)
5. Chọn "Public" hoặc "Private" tùy theo nhu cầu
6. Không chọn "Initialize this repository with a README"
7. Nhấp vào "Create repository"

## 5. Đẩy code lên GitHub

Mở Command Prompt hoặc PowerShell, sau đó di chuyển đến thư mục dự án của bạn:

```
cd D:\Student\Java5-SD20102\Btvn\TinhTong
```

Khởi tạo Git repository (nếu chưa có):

```
git init
```

Thêm tất cả các file vào Git:

```
git add .
```

Commit các thay đổi:

```
git commit -m "Initial commit"
```

Thêm remote repository:

```
git remote add origin https://github.com/username/TinhTong.git
```

(Thay "username" bằng tên người dùng GitHub của bạn)

Đẩy code lên GitHub:

```
git push -u origin master
```

hoặc nếu bạn đang sử dụng branch main:

```
git push -u origin main
```

## 6. Xác thực với GitHub

Khi đẩy code lên GitHub, bạn sẽ được yêu cầu đăng nhập. Có hai cách để xác thực:

### Cách 1: Sử dụng username và password
Nhập username và password GitHub của bạn khi được yêu cầu.

### Cách 2: Sử dụng Personal Access Token (Khuyến nghị)
1. Truy cập https://github.com/settings/tokens
2. Nhấp vào "Generate new token"
3. Đặt tên cho token và chọn phạm vi "repo"
4. Nhấp vào "Generate token"
5. Sao chép token và sử dụng nó thay cho mật khẩu khi được yêu cầu

## 7. Kiểm tra

Sau khi đẩy code lên GitHub, truy cập repository của bạn trên GitHub để kiểm tra xem code đã được đẩy lên thành công chưa.

## Lưu ý

- Nếu bạn gặp lỗi khi đẩy code lên GitHub, hãy đảm bảo rằng bạn đã cấu hình đúng remote repository.
- Nếu bạn đang sử dụng Windows và gặp lỗi "LF will be replaced by CRLF", bạn có thể bỏ qua lỗi này hoặc chạy lệnh `git config --global core.autocrlf false` để tắt tính năng này.