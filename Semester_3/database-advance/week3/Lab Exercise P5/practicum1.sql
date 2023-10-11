SELECT
    GETDATE() AS currentdatetime,
    CONVERT(DATE, GETDATE()) AS currentdatetime,
    CONVERT(TIME, GETDATE()) AS currenttime,
    YEAR(GETDATE()) AS currentyear,
    MONTH(GETDATE()) AS currentmonth,
    DAY(GETDATE()) AS currentday,
    DATEPART(WEEK, GETDATE()) AS currentweeknumber,
    DATENAME(MONTH, GETDATE()) AS currentmonthname;