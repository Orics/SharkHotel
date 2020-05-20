CREATE DATABASE hotel;
GO
USE hotel;
GO

CREATE TABLE [Room] (
  [RoomNumber] int PRIMARY KEY,
  [RoomTypeId] int,
  [Floor] int,
  [Status] nvarchar(50)
)
GO

CREATE TABLE [Floor] (
  [Floor] int PRIMARY KEY
)
GO

CREATE TABLE [RoomType] (
  [RoomTypeId] int PRIMARY KEY IDENTITY(1, 1),
  [Type] nvarchar(50),
  [Capacity] nvarchar(50),
  [DailyRates] int,
  [HourlyRates] int,
  [Deposit] int
)
GO

CREATE TABLE [Booking] (
  [BookingId] int PRIMARY KEY IDENTITY(1, 1),
  [GuestId] int,
  [BookingTime] datetime,
  [PromotionId] int,
  [FromDate] datetime,
  [ToDate] datetime,
  [CancellationTime] datetime,
  [AdvancePayment] int,
  [Subtotal] int,
  [Discount] int,
  [Deposit] int,
  [Total] int,
  [AmountPaid] INT,
  [Status] nvarchar(50)
)
GO

CREATE TABLE [BookingDetail] (
  [BookingDetailId] int PRIMARY KEY IDENTITY(1, 1),
  [BookingId] int,
  [RoomNumber] int,
  [CheckinTime] datetime,
  [CheckoutTime] datetime,
  [ExtraCharge] int,
  [ExtraNote] nvarchar(1000),
  [OldBookingDetailId] INT,
  [ReasonForChange] nvarchar(1000),
  [Status] nvarchar(50)
)
GO

CREATE TABLE [Stay] (
  [StayId] int PRIMARY KEY IDENTITY(1, 1),
  [BookingDetailId] int,
  [GuestId] int
)
GO

CREATE TABLE [Service] (
  [ServiceId] int PRIMARY KEY IDENTITY(1, 1),
  [ServiceName] nvarchar(500),
  [Category] nvarchar(50),
  [RoomTypeId] int,
  [Price] int
)
GO

CREATE TABLE [UsedService] (
  [UsedServiceId] int PRIMARY KEY IDENTITY(1, 1),
  [BookingId] int,
  [BookingDetailId] int,
  [RequiredTime] datetime,
  [ServiceId] int,
  [UnitCount] int,
  [Total] int
)
GO

CREATE TABLE [Guest] (
  [GuestId] int PRIMARY KEY IDENTITY(1, 1),
  [FullName] nvarchar(50),
  [GuarantorId] int,
  [IdCard] nvarchar(50),
  [Phone] nvarchar(50),
  [Points] int,
  [GuestTypeId] int
)
GO

CREATE TABLE [GuestType] (
  [GuestType] int PRIMARY KEY IDENTITY(1, 1),
  [Type] nvarchar(50),
  [LevelPoints] int,
  [DiscountRate] int
)
GO

CREATE TABLE [Invoice] (
  [InvoiceId] int PRIMARY KEY IDENTITY(1, 1),
  [BookingId] int,
  [EmployeeId] int,
  [Time] datetime,
  [PaymentType] nvarchar(50),
  [RoomCharge] int,
  [ServiceCharge] int,
  [ExtraCharge] int,
  [Subtotal] INT,
  [Discount] int,
  [AmountPaid] int,
  [Total] int,
  [Note] nvarchar(1000)
)
GO

CREATE TABLE [Promotion] (
  [PromotionId] int PRIMARY KEY IDENTITY(1, 1),
  [PromoCode] nvarchar(50),
  [FromDate] datetime,
  [ToDate] datetime,
  [DiscountRate] int
)
GO

CREATE TABLE [Employee] (
  [EmployeeId] int PRIMARY KEY IDENTITY(1000, 1),
  [Password] nvarchar(50),
  [Position] nvarchar(50),
  [FullName] nvarchar(50),
  [Gender] nvarchar(50),
  [BirthDay] date,
  [Phone] nvarchar(50),
  [Status] nvarchar(50)
)
GO

CREATE TABLE [Spending] (
  [SpendingId] int PRIMARY KEY IDENTITY(1, 1),
  [Time] datetime,
  [EmployeeId] int,
  [SpendingType] nvarchar(50),
  [SpendFor] nvarchar(1000),
  [Total] int
)
GO





CREATE PROCEDURE pro_InsertRoomType
AS 
BEGIN
	INSERT INTO RoomType(Type) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertBooking
AS 
BEGIN
	INSERT INTO Booking(Status) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertBookingDetail
AS 
BEGIN
	INSERT INTO BookingDetail(Status) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertStay
AS 
BEGIN
	INSERT INTO Stay(GuestId) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertSevice
AS 
BEGIN
	INSERT INTO Service(Price) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertUsedService
AS 
BEGIN
	INSERT INTO UsedService(Total) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertGuest
AS 
BEGIN
	INSERT INTO dbo.Guest(Points) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertGuestType
AS 
BEGIN
	INSERT INTO GuestType(DiscountRate) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertInvoice
AS 
BEGIN
	INSERT INTO Invoice(Note) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertPromotion
AS 
BEGIN
	INSERT INTO Promotion(DiscountRate) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertEmployee
AS 
BEGIN
	INSERT INTO Employee(Status) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO

CREATE PROCEDURE pro_InsertSpending
AS 
BEGIN
	INSERT INTO Spending(Total) VALUES (null);
	SELECT SCOPE_IDENTITY() AS ID;
END;
GO



----------------------------------------------------------------
----------------------------------------------------------------
----------------------------------------------------------------

INSERT INTO dbo.Employee
        ( Password ,
          Position ,
          FullName ,
          Gender ,
          BirthDay ,
          Phone ,
          Status
        )
VALUES  ( N'1' , -- Password - nvarchar(50)
          N'Manager' , -- Position - nvarchar(50)
          N'Nguyen Van A' , -- FullName - nvarchar(50)
          N'Male' , -- Gender - nvarchar(50)
          '1990/02/08' , -- BirthDay - date
          N'0987654321' , -- Phone - nvarchar(50)
          N'offline'  -- Status - nvarchar(50)
        )