select distinct city from station where lower(substr(city, 0, 1)) not in ('a', 'e', 'i', 'o', 'u') and lower(substr(city, length(city))) not in ('a', 'e', 'i', 'o', 'u');