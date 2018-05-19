drop table if exists Account;

drop table if exists Inventory;

drop table if exists LogisticsRecord;

drop table if exists `Order`;

drop table if exists Product;

drop table if exists PurchaseItem;

drop table if exists User;



/*==============================================================*/
/* Table: Account                                               */
/*==============================================================*/
create table Account
(
   id                   int(64) not null auto_increment,
   balance              int,
   userId               int,
   primary key (id)
);

/*==============================================================*/
/* Table: Inventory                                             */
/*==============================================================*/
create table Inventory
(
   id                   int(64) not null auto_increment,
   productId            int(64),
   count                int,
   primary key (id)
);

/*==============================================================*/
/* Table: LogisticsRecord                                       */
/*==============================================================*/
create table LogisticsRecord
(
   id                   int(64) not null auto_increment,
   deliveryMan          varbinary(20),
   outboundTime         date,
   signedTime           date,
   LogisticsStatus      varchar(20),
   primary key (id)
);

/*==============================================================*/
/* Table: `Order`                                               */
/*==============================================================*/
create table `Order`
(
   id                   int(64) not null auto_increment,
   productId            int(64),
   purchaseCount        int,
   recordId             int(64),
   userId               int(64),
   totalPrice           int,
   createTime           date,
   status               varchar(50),
   primary key (id)
);

/*==============================================================*/
/* Table: Product                                               */
/*==============================================================*/
create table Product
(
   id                   int(64) not null auto_increment,
   name                 varchar(50),
   description          varchar(800),
   price                double,
   primary key (id)
);

/*==============================================================*/
/* Table: PurchaseItem                                          */
/*==============================================================*/
create table PurchaseItem
(
   id                   int(64) not null auto_increment,
   orderId              int(64),
   primary key (id)
);

/*==============================================================*/
/* Table: User                                                  */
/*==============================================================*/
create table User
(
   id                   int(64) not null auto_increment,
   name                 varchar(20),
   password             varchar(50),
   primary key (id)
);

