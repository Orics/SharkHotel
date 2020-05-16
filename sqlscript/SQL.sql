
CREATE DATABASE hotel;
GO
USE hotel;
GO

----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE DichVu 
(
	MaDichVu INT PRIMARY KEY IDENTITY(1,1),
	TenDichVu NVARCHAR(50),
	LoaiDichVu NVARCHAR(50),
	MaLoaiPhongKS INT,
	DonGia INT
);
GO
CREATE PROCEDURE pro_create_DichVu
AS 
BEGIN
	INSERT INTO DichVu(TenDichVu) VALUES (NULL);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE SuDungDichVu(
	MaSuDungDichVu INT PRIMARY KEY IDENTITY(1,1),
	MaDatPhong INT,
	MaPhong INT,
	ThoiGianYeuCau DATETIME,
	MaDichVu INT,
	SoLuong INT,
	ThanhTien INT
);
GO
CREATE PROCEDURE pro_create_SuDungDichVu
AS 
BEGIN
	INSERT INTO SuDungDichVu(MaDatPhong) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
Go


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE PhieuChi(
	MaPhieuChi INT PRIMARY KEY IDENTITY(1,1),
	MaNhanVien INT,
	ThoiGianChi DATETIME,
	LoaiChi NVARCHAR(50),
	NoiDungChi NVARCHAR(50),
	TienChi INT
);
GO
CREATE PROCEDURE pro_create_PhieuChi
AS 
BEGIN
	INSERT INTO PhieuChi(MaNhanVien) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
Go


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE LoaiKhachHang(
	MaLoaiKhachHang INT PRIMARY KEY IDENTITY(1,1),
	TenLoaiKhachHang NVARCHAR(50),
	MucDiem INT,
	TyLeGiamGia INT
)
GO
CREATE PROCEDURE pro_create_LoaiKhachHang
AS 
BEGIN
	INSERT INTO LoaiKhachHang(TenLoaiKhachHang) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE KhachHang (
	MaKhachHang INT PRIMARY KEY IDENTITY(1,1),
	HoTen NVARCHAR(50),
	GioiTinh NVARCHAR(50),
	NgaySinh DATE,
	MaNguoiBaoHo INT,
	CMND NVARCHAR(50),
	SDT NVARCHAR(50),
	DiemTichLuy INT,
	MaLoaiKhachHang INT
)
GO
CREATE PROCEDURE pro_create_KhachHang
AS 
BEGIN
	INSERT INTO KhachHang(HoTen) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE DatPhong(
	MaDatPhong INT PRIMARY KEY IDENTITY(1,1),
	MaKhachHang INT,
	MaKhuyenMai NVARCHAR(50),
	ThoiGianDat DATETIME,
	ThoiGianDen DATETIME,
	ThoiGianDi DATETIME,
	ThoiGianHuy DATETIME,
	TienCoc INT,
	TienPhong INT,
	TienPhongSauGiamGia INT,
	TrangThai NVARCHAR(50) 
)
GO
CREATE PROCEDURE pro_create_DatPhong
AS 
BEGIN
	INSERT INTO DatPhong(MaKhachHang) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE HoaDon(
	MaHoaDon INT PRIMARY KEY IDENTITY(1,1),
	MaDatPhong INT,
	MaNhanVien INT,
	ThoiGianTao DATETIME,
	HinhThucTT NVARCHAR(50),
	TienPhong INT,
	TienDichVu INT,
	PhuThu INT,
	GhiChu NVARCHAR(1000),
	ThanhTien INT
)
GO
CREATE PROCEDURE pro_create_HoaDon
AS 
BEGIN
	INSERT INTO HoaDon(MaDatPhong) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE NhanVien(
	MaNhanVien INT PRIMARY KEY IDENTITY(1000,1),
	MatKhau NVARCHAR(50),
	ChucVu NVARCHAR(50),
	HoTen NVARCHAR(50),
	GioiTinh NVARCHAR(50),
	NgaySinh DATE,
	SDT NVARCHAR(50),
	Email NVARCHAR(50),
	TrangThai NVARCHAR(50) -- online, offline
)
GO
CREATE PROCEDURE pro_create_NhanVien
AS 
BEGIN
	INSERT INTO NhanVien(HoTen) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE KhuyenMai(
	MaKhuyenMai NVARCHAR(50) PRIMARY KEY,
	BatDau DATETIME,
	KetThuc DATETIME,
	TyLeGiamGia INT
)
GO
CREATE PROCEDURE pro_create_KhuyenMai
AS 
BEGIN
	INSERT INTO KhuyenMai(TyLeGiamGia) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO



----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE LoaiPhongKS(
	MaLoaiPhongKS INT PRIMARY KEY IDENTITY(1,1),
	LoaiPhong NVARCHAR(50), -- Đơn, Đôi, Gia Đình,
	KieuPhong NVARCHAR(50), -- Standard, Superior, Deluxe
	DonGiaNgay INT,
	DonGiaGio INT,
	GiaTheChan INT
)
GO
CREATE PROCEDURE pro_create_LoaiPhongKS
AS 
BEGIN
	INSERT INTO LoaiPhongKS(LoaiPhong) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO



----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE Phong(
	SoPhong INT PRIMARY KEY,
	MaLoaiPhongKS INT,
	Tang INT,
	TrangThai NVARCHAR(50) --Trống, 
)
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE ChiTietDatPhong(
	MaChiTietDatPhong INT PRIMARY KEY IDENTITY(1,1),
	MaDatPhong INT,
	SoPhong INT,
	ThoiGianNhan DATETIME,
	ThoiGianTra DATETIME,
	GiaApDung INT,
	PhuThu INT,
	NoiDungPhuThu NVARCHAR(1000),
	TrangThai NVARCHAR(50)
)
GO
CREATE PROCEDURE pro_create_ChiTietDatPhong
AS 
BEGIN
	INSERT INTO ChiTietDatPhong(MaDatPhong) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
CREATE TABLE LuuTru(
	MaLuuTru INT PRIMARY KEY IDENTITY(1,1),
	MaChiTietDatPhong INT,
	MaKhachHang INT
)
GO
CREATE PROCEDURE pro_create_LuuTru
AS 
BEGIN
	INSERT INTO LuuTru(MaKhachHang) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

SELECT * FROM dbo.NhanVien WHERE MaNhanVien = 


----------------------------------------------------------------------
----------------------------------------------------------------------
----------------------------------------------------------------------
SET DATEFORMAT DMY;
INSERT INTO dbo.NhanVien ( MatKhau, ChucVu, HoTen ,GioiTinh ,NgaySinh ,SDT ,Email ,TrangThai)
VALUES  ( N'123456' , -- MatKhau - nvarchar(50)
          N'QuanLy' , -- ChucVu - nvarchar(50)
          N'Nguyễn Văn A' , -- HoTen - nvarchar(50)
          N'Nam' , -- GioiTinh - nvarchar(50)
          '24/11/1980', -- NgaySinh - date
          N'0987654321' , -- SDT - nvarchar(50)
          N'nva@gmail.com' , -- Email - nvarchar(50)
          N'offine'  -- TrangThai - nvarchar(50)
        )


SELECT * FROM dbo.NhanVien
