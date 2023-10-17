SELECT
    p.productid, p.productname, p.totalsalesamount
FROM dbo.fnGetTop3ProductsFOrCustomer(1) AS p;