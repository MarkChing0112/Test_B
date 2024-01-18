SELECT tote_number, COUNT(*) AS tote_count
FROM order_tote_process_log
WHERE action_code = 'PACKED'
AND process_date >= '10:00:00' AND process_date <= '10:59:59'
GROUP BY tote_number;

--ANS
--tote_number|tote_count
--123789      1
--124554      1