select distinct city from station where lower(substr(city, 0,1)) in ('a', 'e', 'i', 'o', 'u') and lower(substr(city, length(city))) in ('a', 'e', 'i', 'o', 'u');
