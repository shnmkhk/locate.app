DROP TABLE [IF EXISTS] Location;
CREATE TABLE Location (
    locName varchar(255) NOT NULL,
    pincode numeric NOT NULL,
    subDistName varchar(255) NOT NULL,
    distName varchar(255) NOT NULL,
    state VARCHAR(128) NOT NULL
);

