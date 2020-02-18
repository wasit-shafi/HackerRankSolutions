select distinct city from station where lower(substr(city, length(city), 1)) in ('a', 'e', 'i', 'o', 'u');
--or
--select distinct city from station where city like '%a' or city like '%A'or city like '%e'or city like '%E'or city like '%i'or city like '%I'or city like '%o'or city like '%O'or city like '%u'or city like '%U';
