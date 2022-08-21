CREATE TABLE IF NOT EXISTS OUTBOX
(
    ID            uuid         NOT NULL PRIMARY KEY,
    PAYLOAD       jsonb        NOT NULL,
    AGGREGATETYPE varchar(255) NOT NULL,
    AGGREGATEID   varchar(255) NOT NULL,
    TYPE          varchar(255) NOT NULL
);

INSERT INTO outbox (ID, PAYLOAD, AGGREGATETYPE, AGGREGATEID, TYPE) VALUES ('4ca27243-6a55-4855-b0e6-d6e1d957f289','{"type": "mobile", "phone": "001001"}', 'aaa', '1', 'T1');
UPDATE outbox SET TYPE = 'T2' WHERE ID = '4ca27243-6a55-4855-b0e6-d6e1d957f289';