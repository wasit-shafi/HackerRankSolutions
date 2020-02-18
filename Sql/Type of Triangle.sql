-- i am checking first whether it does not form a triangle or not is so then simply print 'Not a triangle' if we change the order of conditions(first condition) then it will not work properly
select case
        when a + b <= c or b + c <= a or c + a <= b then 'Not A Triangle'
        when (a = b and b <> c) or (b = c and c <> a) or (c = a and a <> b) then 'Isosceles'
        when a = b and b = c and c = a then 'Equilateral'
        when a <> b and b <> c and c <> a then 'Scalene'
       end
from triangles;
-- or
/*
SELECT CASE WHEN A + B > C AND A+C>B AND B+C>A THEN
                CASE WHEN A = B AND B = C THEN 'Equilateral'
                     WHEN A = B OR B = C OR A = C THEN 'Isosceles'
                     WHEN A != B OR B != C OR A != C THEN 'Scalene' 
                     END 
                ELSE 'Not A Triangle' END FROM TRIANGLES;
*/