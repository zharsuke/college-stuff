SELECT
    CAST('1945-08-17' AS date) AS somedate,
    CONVERT(VARCHAR(50), '1945-08-17', 107) AS somedate,
    PARSE('1945-08-17' AS date using 'en-US') AS somedate;