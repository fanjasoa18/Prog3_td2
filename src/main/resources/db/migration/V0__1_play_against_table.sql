create table if not exists "play_against"
    {
    id_play int primary key,
    id_team int references team(id_team),
    datetime datetime,
    stadium varchar(150)
    }