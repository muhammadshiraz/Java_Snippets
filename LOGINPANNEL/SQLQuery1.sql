create database LoginExample
use LoginExample

create table users(u_id int primary key identity,username varchar(50),userpassord varchar(50))

insert into users values('ali','ahmed')
insert into users values('salman','khan')
insert into users values('uzair','ali')

create table roles(role_id int primary key identity, rolename varchar(50))

insert into roles values('admin')
insert into roles values('teacher')
insert into roles values('student')

create table user_roles(us_rl_id int primary key identity, u_id int foreign key references users(u_id),
role_id int foreign key references roles(role_id))

insert into user_roles values(1,1)
insert into user_roles values(2,2)
insert into user_roles values(3,3)

select * from users
select * from roles
select * from user_roles

select users.username, roles.rolename from users
inner join user_roles on user_roles.u_id = users.u_id
inner join roles on user_roles.role_id = roles.role_id
where username = 'ali' and userpassord = 'ahmed'





