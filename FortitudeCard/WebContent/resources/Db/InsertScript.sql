
SET FOREIGN_KEY_CHECKS=0;
INSERT INTO `fortitudedb`.`projects`
(`project_id`,
`project_name`,
`project_owner`,
`project_amount`,
`project_details`,
`project_external_link`,
`minimum_amount_to_invest`,
`project_start_time`,
`project_scheduled_end_time`,
`project_actual_end_time`,
`target_met`,
`returned_promised`,
`return_type`,
`current_investment`)
VALUES
('P003','Financialprojects Startup',
'1',1000000,'Nice project, invest dude!', 'none',1000.0, '2017-01-01', '2017-03-03', '2017-04-04',false, 8.7, 'Monthly',50000);

