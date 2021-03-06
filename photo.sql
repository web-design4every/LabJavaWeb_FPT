USE [Photographer]
GO
/****** Object:  Table [dbo].[contact]    Script Date: 28/03/2021 22:33:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[contact](
	[telephone] [nvarchar](max) NULL,
	[email] [nvarchar](max) NULL,
	[address] [nvarchar](max) NULL,
	[city] [nvarchar](max) NULL,
	[country] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[gallery]    Script Date: 28/03/2021 22:33:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[gallery](
	[ID] [int] NOT NULL,
	[title] [nvarchar](max) NULL,
	[description] [nvarchar](max) NULL,
	[name] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[homepage]    Script Date: 28/03/2021 22:33:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[homepage](
	[image_url] [nvarchar](50) NULL,
	[description] [nvarchar](50) NULL,
	[about] [nvarchar](50) NULL,
	[aboutDetail] [nvarchar](max) NULL
) ON [PRIMARY] TEXTIMAGE_ON [PRIMARY]
GO
/****** Object:  Table [dbo].[image]    Script Date: 28/03/2021 22:33:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[image](
	[id] [int] NULL,
	[gallery_id] [int] NULL,
	[image_url] [nvarchar](50) NULL
) ON [PRIMARY]
GO
/****** Object:  Table [dbo].[share]    Script Date: 28/03/2021 22:33:51 PM ******/
SET ANSI_NULLS ON
GO
SET QUOTED_IDENTIFIER ON
GO
CREATE TABLE [dbo].[share](
	[url_image] [nvarchar](50) NULL,
	[content] [nvarchar](50) NULL
) ON [PRIMARY]
GO
INSERT [dbo].[contact] ([telephone], [email], [address], [city], [country]) VALUES (N'0906166559', N'hungnthe141370', N'Hong Bang', N'Hai Phong', N'Viet Nam')
GO
INSERT [dbo].[gallery] ([ID], [title], [description], [name]) VALUES (1, N'View Gallery 1', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'Gallery 1')
INSERT [dbo].[gallery] ([ID], [title], [description], [name]) VALUES (2, N'View Gallery 2', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'Gallery 2')
INSERT [dbo].[gallery] ([ID], [title], [description], [name]) VALUES (3, N'View Gallery 3', N'Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis nostrud exerci tation', N'Gallery 3')
GO
INSERT [dbo].[homepage] ([image_url], [description], [about], [aboutDetail]) VALUES (N'img1.jpg', N'Lorem ipsum dolor sit amet', N'About me', N' Lorem ipsum dolor sit amet, consectetuer adipiscing elit, sed diam nonummy nibh euismod 
                        tincidunt ut laoreet dolore magna aliquam erat volutpat. Ut wisi enim ad minim veniam, quis 
                        nostrud exerci tation ullamcorper suscipit lobortis nisl ut aliquip ex ea commodo consequat.
                        Duis autem vel eum iriure dolor in hendrerit in vulputate velit esse molestie consequat, vel 
                        illum dolore eu feugiat nulla facilisis at vero eros et accumsan et iusto odio dignissim qui 
                        blandit praesent luptatum zzril delenit augue duis dolore te feugait nulla facilisi. Nam liber 
                        tempor cum soluta nobis eleifend option congue nihil imperdiet doming id quod mazim')
GO
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (1, 1, N'img7.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (2, 1, N'img5.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (3, 1, N'img4.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (4, 1, N'img6.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (5, 1, N'img1.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (6, 1, N'img2.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (7, 1, N'img3.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (8, 1, N'img8.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (4, 2, N'img6.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (6, 2, N'img2.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (8, 2, N'img8.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (1, 2, N'img7.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (7, 2, N'img3.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (2, 2, N'img5.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (3, 2, N'img4.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (5, 2, N'img1.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (8, 3, N'img8.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (7, 3, N'img3.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (3, 3, N'img4.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (6, 3, N'img2.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (4, 3, N'img6.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (5, 3, N'img1.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (2, 3, N'img5.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (1, 3, N'img7.jpg')
INSERT [dbo].[image] ([id], [gallery_id], [image_url]) VALUES (9, 3, N'img5.jpg')
GO
INSERT [dbo].[share] ([url_image], [content]) VALUES (N'face.png', N'Share on Facebook')
INSERT [dbo].[share] ([url_image], [content]) VALUES (N'twitter.png', N'Share on Twitter')
INSERT [dbo].[share] ([url_image], [content]) VALUES (N'google.png', N'Share on Google+')
GO
