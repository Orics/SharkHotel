# SharkHotel

## Các bước thiết lập project:
+ Download project về và giải nén ra thư mục
+ Mở NetBeans -> Open Projects -> dẫn tới thu mục vừa giải nén ỏ trên
+ Sau khi mở project, tiến hành gỡ các thư viện lỗi và thêm thư viện mới vào: 
	Trong phần câu thư mục của project (ở góc bên trái) tìm tới phần Libraries (Phía dưới Source Packages) -> chuột phải -> Kiểm tra các gói thư viện lỗi (các dòng tô đỏ) -> chọn Remove và OK để gỡ bỏ.
	Trong phần câu thư mục của project (ở góc bên trái) tìm tới phần Libraries (Phía dưới Source Packages) -> chuột phải -> Add JAR/Folder -> tìm tới thư mục giải nén ở trên -> trong thu mục drivers, chọn file "mssql-jdbc-8.2.2.jre8.jar" -> Ok để thêm thư viện
+ Mở SQLManagement, thực thi file SQL.sql trong thư mục sqlscript. Thiết lập account "sa" với mật khẩu "123456". 
+ Trong project, mở file SQLConnection.java (nằm trong thư mục SharkHotel). tìm tới dòng 25 'connectString = "jdbc:sqlserver://localhost\\DESKTOP-EJBMRCJ:1433;databaseName=hotel";' sữa lại 'DESKTOP-EJBMRCJ' thành ServerName của máy mình
(SeverName khi lần đầu mở SQLManagement lên)



## Mô tả các thành phần trong project:
+ Lib: thư mục chứa các class, hàm đã xây dựng sẳn để dùng chung
+ Icons: chứa các  hình ảnh
+ DLL: 
	- Chứa các class nhằm truy vấn CSDL:
	- Quy tắc đặt tên: DLL<FileName> vd: DLLLogin.java
	- Các phương thức trong DLL là các các phương thức tĩnh (static)
+ DTO: 
	- Chứa các class có vai trò là dữ liệu để lưu giữ lại và truyền đi 
	- Quy tắc đặt tên: DTO<FileName> vd: DTOEmployee.java
	- Thường chỉ là các thuộc tính public.
+ GUI: 
	- Thư mục chứa các giao diện người dùng
	- gồm : 
		* File GUI<FileName>.java . vd: GUILogin.java : là các class đại diện cho giao diện 
		* Thư mục chứa các file cáo thành giao diện (nếu có) : GUI<FileName>.css, GUI<FileName>.fxml, GUI<FileName>Controller.java
	- Các giao diện chức năng chính có kích thước w:1150 x h:700

+ Các thư mục cá nhân: Để test và code có cấu trúc tương tự bên trên. Sẽ chủ yếu code trong thư mục mày
 


## Database:
+ Link để xem : https://dbdiagram.io/d/5e9ac6eb39d18f5553fdcdfc  ( hotel(EN) )
+ File SQL.sql nằm trong thu mục SharkHotel/sqlscript/. Thực thi file này trên SQLSever để tạo csdl
+ CHÚ Ý: Để tránh các lỗi và dễ dàng để thực hiện các bảng trong csdl KHÔNG khóa ngoại với nhau, khóa ngoại chỉ để xem quan hệ tướng đối giữa các bảng. KHÔNG export file từ dbdiagram.io rồi thực thi trong SQLSever. 
+ Mô tả các bảng:
		
	-	``` sql
		table Room{ --//Phòng
			RoomNumber int [pk] --// Số phòng
			RoomTypeId int --// Mã loại phòng
			Floor int --// Tầng
			Status nvarchar(50) --// Trạng thái phòng
		}
		``` 
	-	``` sql	
		table Floor{
			Floor int [pk]
		}
		```
	-	``` sql	
		table RoomType{--//Loại phòng
			RoomTypeId int [pk, increment]--//Mã loại phòng
			Type nvarchar(50) //(Standard, Superior, Deluxe
			Capacity nvarchar(50) //Single
			DailyRates int--//Giá phòng theo ngày
			HourlyRates int--//Giá phòng theo giờ
			Deposit int--//Tiền thế chân/tiền đặt cọc, sẽ trả lại khi trả phòng
		}
		```
	-	``` sql	
		table Booking{ --// Đặt phòng
			BookingId int [pk, increment] --// Mã đặt phòng
			GuestId int --// Mã khách hàng đặt phòngi
			BookingTime datetime --// Thời gian đặt phòng
			PromotionId int --// Mã hương trình khuyến mãi
			FromDate datetime --// Thời gian dự định đến
			ToDate datetime --// Thời gian dự định đi
			CancellationTime datetime --// Thời gian có thể hủy (trước thời gian nay có thể huy và nhận lại tiền qua thẻ tín dụng ), nếu hủy phòng thành công thời gian này sẽ dc cập nhật lại thời gian hủy thực tế
			AdvancePayment int --// Thanh toán trước, số tiền trả trước phải thanh toán để xác nhận đặt phòng
			Subtotal int --// Tổng tiền phòng khi chưa áp dụng giảm giá
			Discount int --// Tiền giảm Giá
			
			Deposit int --// Tiền thế chân/tiền đặt cọc
			Total int --// Tiền phòng phải trả
			AmountPaid int --// Số tiền khách hàng đã trả
			
			Status nvarchar(50) --// Trạng thái đặt phòng (Confirmed, Cancelled, Checked-In, Overstay,Checked-Out )
		}
		```
	-	``` sql	
		table BookingDetail{--//Chi tiết đặt phòng
			BookingDetailId int [pk, increment]--//Mã chi tiết đặt phòng
			BookingId int--//Mã đặt phòng
			RoomNumber int--//Số phòng
			CheckinTime datetime--//Thời gian nhận phòng
			CheckoutTime datetime--//Thời gian trả phòng
			ExtraCharge int--//Phí phụ thu trong trường hợp phòng bị hư hỏng, mất mát
			ExtraNote nvarchar(1000)--//Nội dung phụ thu
			OldBookingDetailId int --// Mã chi tiết đặt phòng cũ (chuyển phòng)
  			ReasonForChange nvarchar(1000) --// Lý do chuyển phòng
			Status nvarchar(50)--//Trạng thái (Confirmed,Cancelled, Occupied, No-show, Overstay, Checked-Out)
		}
		```
	-	``` sql	
		table Stay{--//Lưu trú
			StayId int [pk, increment]--//Mã lưu trú
			BookingDetailId int--//Mã chi tiết đătk phòng
			GuestId int--//Mã khách hàng lưu trú
		}
		```
	-	``` sql	
		table Service{--//Dich vụ
			ServiceId int [pk, increment] //Mã dịch vụ
			ServiceName nvarchar(500)--//Tên dịch vụ
			Category nvarchar(50)--//Loại dịch vụ
			RoomTypeId int--//Mã loại phòng áp dụng dịch vụ này làm dịch vụ mặc định (vd: rượu vang, nước giải khát, quần áo, )
			Price int--//Đơn giá
		}
		```
	-	``` sql	
		table UsedService{--//Dịch vụ được sử dụng
			UsedServiceId int [pk, increment]--//Mã dịch vụ được sử dụng
			BookingId int--//Mã đặt phòng đặt dịch vụ này
			BookingDetailId int--//Mã chi tiêt đặt phòng, cho biết phòng nào đặt dịch vụ này, nếu là null dịch vụ sẽ tính cho booking
			RequiredTime datetime--//Thời gian yêu cầu dịch vụ
			ServiceId int--//Mã dich vụ
			UnitCount int--//Số lượng đơn vị dịch vụ 
			Total int--//Tiền dịch v
		}
		```
	-	``` sql	
		table Guest{--//Khách hàng
			GuestId int [pk, increment]--//Mã khách hàng
			FullName nvarchar(50)--//Họ tên
			GuarantorId int--//Mã người bảo lãnh, đối với trẻ không có CMND
			IdCard nvarchar(50)--//CMND
			Phone nvarchar(50)--//SĐT
			Points int--//Điểm tích lũy
			GuestTypeId int--//Mã loại khách hàng
		}
		```
	-	``` sql	
		table GuestType{--//Mã loại khách hàng
			GuestType int [pk, increment]--//Mã loại khách hàng
			Type nvarchar(50)--//Tên loại khách hàng
			LevelPoints int--//Mức điểm
			DiscountRate int--//Tỷ lệ giảm giá
		}
		```
	-	``` sql	
		table Invoice{--//hoa don khi checkout
			InvoiceId int [pk, increment]--//Mã hóa đơn
			BookingId int--//Mã đặt phòng
			EmployeeId int--//Mã nhân viên
			Time datetime--//Thời gian
			PaymentType nvarchar(50)--//Loại hình thanh toán (Cash, Credit, eBanking)
			RoomCharge int--//Tổng tiền phòng
			ServiceCharge int--//Tổng tiền dịch vụ	
			ExtraCharge int--//Tổng tiền phụ thu
			Subtotal int --//Tổng tiền phải trả chưa tính giảm giá =RoomCharge+ServiceCharge+ExtraCharge
  			Discount int --// Tiền khuyến mãi
  			AmountPaid int --// Tiền đã trả trươc (tiền phòng, tiền đặt cọc)
  			Total int  --// Tổng tiền phải thanh toán = Subtotal-Discount-AmountPaid
			Note nvarchar(1000)--//Ghi chú
		}
		```
	-	``` sql	
		table Promotion{--//Chương trình khuyến mãi
			PromotionId int [pk, increment]--//Mã khuyến mãi
			PromoCode nvarchar(50) --//Mã khuyến mãi
			FromDate datetime--//Thời gian bắt đầu
			ToDate datetime--//Thời gian kết thúc
			DiscountRate int--//Tỷ lệ giảm giá
		}
		```
	-	``` sql	
		table Employee{--//Nhân viên
			EmployeeId int [pk, increment]--//Mã nhân viên
			Password nvarchar(50)--//Mật khẩu
			Position nvarchar(50)--//Chức vụ
			FullName nvarchar(50)--//Họ tên
			Gender nvarchar(50)--//Giới tính
			BirthDay date--//Ngày sinh
			Phone nvarchar(50)--//SĐT
			Status nvarchar(50)--//Trạng thái đăng nhập (Online, Offline)
		}
		```
	-	``` sql	
		table Spending{--//Phiếu chi tiêu
			SpendingId int [pk, increment]--//Mã phiếu chi
			Time datetime--//Thời gian
			EmployeeId int--//Nhân viên thực hiện chi
			SpendingType nvarchar(50)--//Loại chi tiêu ()
			SpendFor nvarchar(1000)--//Chi tiêu cho/nội dung chi
			Total int--//Tiền phải chi
		}
		```



## Mô tả chức năng:

