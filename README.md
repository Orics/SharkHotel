# SharkHotel

## Các bước thiết lập project:
+ Link database: https://dbdiagram.io/d/5ebb520539d18f5553ff1c83
+ Download project về và giải nén ra thư mục
+ Mở NetBeans -> Open Projects -> dẫn tới thu mục vừa giải nén ỏ trên
+ Sau khi mở được project, tiến hành thêm thư viện JDBC: trong project vừa mở, tìm tới phần Libraries (Phía dưới Source Packages) -> chuột phải -> Add JAR/Folder -> tìm tới thư mục giải nén ở trên -> trong thu mục drivers, chọn file "mssql-jdbc-8.2.2.jre8.jar"
+ Mở SQLManagement, thực thi file SQL.sql trong thư mục sqlscript. Thiết lập account "sa" với mật khẩu "123456". 
+ Trong project, mở file SQLConnection.java (nằm trong thư mục SharkHotel). tìm tới dòng 25 'connectString = "jdbc:sqlserver://localhost\\DESKTOP-EJBMRCJ:1433;databaseName=SharkHotel";' sữa lại 'DESKTOP-EJBMRCJ' thành ServerName của máy mình
(SeverName khi lần đầu mở SQLManagement lên)


## Mô tả các thành phần trong project:
+ Lib: thư mục chứa các class, hàm đã xây dựng sẳn để dùng chung
+ Icons: chứa các  hình ảnh
+ DLL: 
	- Chứa các class nhằm truy vấn CSDL:
	- Quy tắc đặt tên: DLL_<TenFile> vd: DLL_DangNhap.java
	- Các phương thức trong DLL là các các phương thức tĩnh (static)
+ DTO: 
	- Chứa các class có vai trò là dữ liệu để lưu giữ lại và truyền đi 
	- Thường chỉ là các thuộc tính public . vd: NhanVien.java
+ GUI: 
	- Thư mục chứa các giao diện người dùng
	- gồm : GUI_<TenFile>.css,  GUI_<TenFile>.fxml,  GUI_<TenFile>.java
	- Nếu không dùng fxml thì có thể chỉ tạo file .java
	- file .java: chứa phải có phương thức static Stage/AnchorPane get(): là phương thức trả về Stage nếu là một cữa sổ, AnchorPane nếu là một AnchorPane để chứa các thành phần
	- Các AnchorPane chính có kích thước w:1150 x h:700
+ Các thư mục cá nhân để test và code: 
 
## Mô tả chức năng:
+ Dặt phòng:
	- đặt phòng trước: 
		* khách hàng thực hiện dặt phòng trên website(thông tin khách hàng đặt phòng, thời gian đên, thời gian di, các phòng đc đặt)
		* sau khi đặt xong khách hàng thanh toán 1 khoản tiền cọc theo quy định(50% tổng giá)
		* hệ thống sẽ tạo ra "DatPhong" và các "ChiTietDatPhong" tương ứng.

		* khi khách đến nhận phòng, sẽ kiểm tra thông tin khách đặt và thông tin đặt phòng (tìm theo SDT/CMND)
		* sau khi xác minh thông tin, lễ tân sẽ yêu cầu khách hàng thanh toán toàn bộ tiền phòng và 1 khoảng tiền thế chân(sẽ trả lại khi checkout)
		* để hoàn thành checkin, lễ tân sẽ ghi nhận các thông tin khách đến ở cho mỗi phòng 

	- thuê phòng trực tiếp:
		* khách hàng đến trực tiếp khách sạn để thuê phòng (thực hiện đồng thời đặt phòng, nhận phòng)
		
	- trong quá trình lưu trú :
		* khách hàng yêu cầu dịch vụ. Lễ tân sẽ thêm dịch vụ cho phòng thông qua tùy chọn ("Thêm dịch vụ" của phòng). khách hàng sẽ trả tiền ngay lúc này
		* khách hàng yêu cầu chuyển phòng. Thực hiện chuyển phòng thông qua tùy chọn ("Chuyển phòng" của phòng). nếu chuyển sang phòng cao cấp hơn thì thanh toán khoản chênh lệch này, nếu chuyển sang phòng thấp cấp hơn thì hệ thống sẽ lưu lại khoản chênh lệch này và trả lại cho khách lúc checkout
	- khi trả phòng:
		* kiểm tra phòng : kiểm tra số lượng dịch vụ đã sữ dụng (list dich vụ của phòng->chọn số lượng đã dùng->thành tiền) và hao tổn(tiền phụ thu, nội dung phụ thu) nếu có
		* xuất hóa đơn tổng :	nhân viên (mã, tên)
					thời gian xuất hóa đơn
					mã đặt phòng
					khách hàng đặt (mã, tên, tỷ lệ giảm giá)
					khuyên mãi (mã , tỷ lệ giảm giá)
					thời gian đặt
					danh sách phòng (số phòng, loại phòng(Đơn - Tiêu chuẩn), đơn giá , tiền thế chân đã nhận, thời gian nhận, thời gian trả, phụ thu , nội dung phụ thu, thành tiền)
					danh sách dich vụ (số phòng, tên dịch vụ, đơn giá, số lượng, thời gian, thành tiền)


+ Khach hang
	
+ Dich vu 

+ Nhan vien

+ Thong kê
