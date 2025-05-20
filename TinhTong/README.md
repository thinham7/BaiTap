# TinhTong - Ứng dụng kiểm tra số nguyên

## Giới thiệu
TinhTong là một ứng dụng Java đơn giản được phát triển để thực hiện các phép tính và kiểm tra số nguyên. Dự án này bao gồm các dịch vụ để kiểm tra số âm, số dương và thực hiện các phép tính toán cơ bản.

## Tính năng
- Kiểm tra số nguyên âm
- Kiểm tra số nguyên dương
- Tính tổng các số đã nhập
- Tính tổng các số lẻ đã nhập
- Tính trung bình cộng
- Các phép tính cơ bản (cộng, trừ, nhân, chia)

## Cấu trúc dự án
Dự án được tổ chức thành các package sau:
- `com.example.tinhtong.Service`: Chứa các lớp dịch vụ thực hiện các phép tính và kiểm tra
- `com.example.tinhtong.Test`: Chứa các lớp kiểm thử để đảm bảo tính chính xác của các dịch vụ

## Các lớp dịch vụ chính
- `KiemTraSoAmDuongService`: Kiểm tra xem một số có phải là số nguyên âm hay dương
- `TinhTongNSoDaNhapService`: Tính tổng của n số đã nhập
- `TinhTongNSoLeDaNhapService`: Tính tổng của n số lẻ đã nhập
- `TinhTrungBinhService`: Tính trung bình cộng của các số
- `TinhToanService`: Thực hiện các phép tính cơ bản

## Cách sử dụng
Để sử dụng các dịch vụ trong dự án này, bạn có thể tham khảo các lớp kiểm thử trong package `com.example.tinhtong.Test`. Ví dụ:

```java
// Kiểm tra số âm
boolean laSoAm = KiemTraSoAmDuongService.SoAm(-5);  // Trả về true

// Kiểm tra số dương
boolean laSoDuong = KiemTraSoAmDuongService.SoDuong(5);  // Trả về true
```

## Kiểm thử
Dự án bao gồm các kiểm thử đơn vị để đảm bảo tính chính xác của các dịch vụ. Các kiểm thử được viết bằng JUnit và có thể được chạy để xác minh rằng các dịch vụ hoạt động như mong đợi.

## Yêu cầu
- Java 8 trở lên
- Maven

## Cài đặt
1. Clone repository này
2. Mở dự án trong IDE của bạn (IntelliJ IDEA, Eclipse, v.v.)
3. Chạy các kiểm thử để đảm bảo mọi thứ hoạt động đúng

## Đóng góp
Nếu bạn muốn đóng góp vào dự án này, vui lòng tạo một pull request với các thay đổi của bạn.