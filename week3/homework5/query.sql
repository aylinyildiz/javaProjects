/*Sql, case insensitive dir*/

/*Customer tablosundaki tüm kolonları getir */
SELECT * FROM Customers;

/*Customer tablosundan ContactName,City kolonlarını getir */
SELECT ContactName,City FROM Customers

/*SQL Takma Adları(ALİASES): bir tabloya veya sütuna geçici bir ad vermek için kullanılır */
SELECT ContactName Ad, City Şehir From Customers

/*Şehri London olanları getir */
SELECT * FROM Customers where City="London"

/*CategoryId 1 ve 3 olanları getir */
Select * From Products where categoryId=1 or categoryId=3

/*CategoryId 1 ve Price 10a eşit yada büyük olanlar gelsin */
Select * From Products where categoryId=1 and Price>=10

/*ProductName e göre sırala */
Select * From Products order by ProductName

/*Önce categoryId ye göre sonra onları kendi içinde ProductName e göre sırala */
Select * From Products order by CategoryId,ProductName

/* -- ascending -- descending*/
/*artan fiyata göre sıralar. default olarak sorgu asc(artan fiyat) a göre sıralanır */
select * from Products order by Price

/*azalan fiyata göre sıralanır */
select * from Products order by Price desc

/*categoryId 1 olanları azalan fiyata göre sırala */
select * from Products where categoryId=1 order by Price desc

/*product tablosundaki satırların(ürünlerin) sayısı*/ 
select count(*) from Products

/*categoryId 2 olanların sayısı*/
select count(*) from Products where categoryId=2

/*kategorileri tekrar etmeyecek şekilde sıralar */
select categoryId from Products group by CategoryId

/*hangi kategoride kaç ürün olduğunu gösterir */
select categoryId,count(*) from Products group by categoryId

/*içerisinde 10dan az ürün olan kategorileri getir */
select categoryId,count(*) from Products group by categoryId having count(*)<10 

/*price ı 20den az  olan ürünleri categoryId ye göre grupla. Onlardan sayısı 10 dan az olanları getir
-- Having ifadesine gruplama işlemlerinde kullanılan şart ifadesi diyebiliriz. -- */
select categoryId,count(*) from Products where Price>20 group by categoryId having count(*)<10 


/*inner join sadece iki tabloda eşleşenleri bir araya getirir. Eşleşmeyen data varsa getirmez*/
/* on : şart olarak düşünebiliriz */
select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryId = Categories.CategoryId

 
/*Productsda fiyatı 10dan büyük olanlar için onları categorylerle join et ve getir */
select Products.ProductId, Products.ProductName, Products.Price, Categories.CategoryName
from Products inner join Categories 
on Products.CategoryId = Categories.CategoryId
where Products.Price >10 

/*alttaki yazıma göre solda olup sağda olmayanları da getir demektir. */
select * from Products p left join OrderDetails od
on p.ProductId = od.ProductId 

/*hiç siparişi olmayan müşteriyi getir */
select * from Customers c left join Orders o
on c.CustomerId = o.CustomerId
where o.CustomerId is null 


/*ikiden fazla tabloyu join etmek */
select * from Products p inner join OrderDetails od
on p.ProductId = od.ProductId
inner join Orders o
on o.OrderId = od.OrderId




