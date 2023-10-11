-- SELECT
-- e.empid, e.lastname, e.firstname, e.title, e.mgrid, m.lastname, m.firstname AS mgrfirstname
-- FROM HR.Employees AS e
-- INNER JOIN HR.Employees AS m ON e.mgrid = m.empid
-- WHERE
-- m.lastname = N'Buck';

-- SELECT
--     c.custid, c.companyname, o.orderid, o.orderdate

-- FROM Sales.Customers AS c
-- INNER JOIN Sales.Orders AS o
--     ON c.custid = o.custid
-- WHERE o.orderdate >= '2008-04-01'
-- ORDER BY o.orderdate DESC, c.custid ASC;

SELECT
e.empid, e.lastname AS emplastname, e.firstname AS empfirstname, e.title, e.mgrid, m.lastname, m.firstname
FROM HR.Employees AS e
INNER JOIN HR.Employees AS m ON e.mgrid = m.empid
ORDER BY m.firstname ASC;