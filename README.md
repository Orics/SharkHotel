# SharkHotel
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


		
