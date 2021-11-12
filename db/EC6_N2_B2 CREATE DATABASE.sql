USE [master]
GO
;

DROP DATABASE [6BI_N2]
GO
;

CREATE DATABASE [6BI_N2]
GO
    DROP USER [dbuser]
GO
;

CREATE USER [dbuser] FOR LOGIN [dbuser] WITH DEFAULT_SCHEMA = [dbo]
GO
;

CREATE LOGIN [dbuser] WITH PASSWORD = N 'dbuser@123',
DEFAULT_DATABASE = [master],
DEFAULT_LANGUAGE = [us_english],
CHECK_EXPIRATION = OFF,
CHECK_POLICY = OFF
GO
;

USE [6BI_N2]
GO
;

EXEC sp_addrolemember N'db_datareader',
N'dbuser'
GO
;

EXEC sp_addrolemember N'db_datawriter',
N'dbuser'
GO
;