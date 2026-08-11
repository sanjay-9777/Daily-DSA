WITH RankedCustomers AS (
    SELECT 
        customer_number,
        COUNT(order_number) AS order_count,
        DENSE_RANK() OVER (ORDER BY COUNT(order_number) DESC) as rnk
    FROM 
        Orders
    GROUP BY 
        customer_number
)
SELECT 
    customer_number
FROM 
    RankedCustomers
WHERE 
    rnk = 1;