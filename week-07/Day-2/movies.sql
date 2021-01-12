-- Exercise 1
select mID, title from movie where director like "Steven Spielberg";

-- Exercise 2
select Distinct year from movie
inner join rating on movie.mID = rating.mID
where stars>=4 
order by year asc;

-- Exercise 3
select title, stars from movie left join rating on movie.mID = rating.mID where stars is null;

-- Exercise 4
select name from movie inner join rating on movie.mID = rating.mID inner join reviewer  on  rating.rID = reviewer.rID where ratingDate is null;

-- Exercise 5
select name, title, stars, ifnull(ratingDate,"<n/a>") from movie inner join rating on movie.mID = rating.mID inner join reviewer  on  rating.rID = reviewer.rID order by name,title,stars;

-- Exercise 6
select re.name, m.title from reviewer re 
inner join rating r1 on re.rID = r1.rID 
inner join rating r2 on r2.rID = re.rID 
inner join movie m on  m.mid = r1.mid
where r1.mid = r2.mid and r1.ratingdate < r2.ratingdate and r1.stars < r2.stars;

-- Exercise 7
select distinct  title, max(stars) as max from movie as m
inner join rating as rate on rate.mID=m.mID
inner join reviewer as rev on rev.rID =rate.rID 
group by title;

-- Excersise 8	
select  title, max(stars)-min(stars) as rating_spread 
from movie inner join rating on rating.mID =movie.mID 
group by title 
order by rating_spread desc;

-- Exercise 9
select (select avg(t1.average1) as a
from(
select  avg(stars) as average1
from movie inner join rating on movie.mID=rating.mID where year<1980 group by title
) t1)
-
(select avg(t2.average1) as b
from(
select  avg(stars) as average1
from movie inner join rating on movie.mID=rating.mID where year>1980 group by title
) t2) as Avg_diff;


