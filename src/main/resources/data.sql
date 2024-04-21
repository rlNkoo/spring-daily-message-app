INSERT INTO
    devotional (id, quote, author, image_path, content, created_at, updated_at, published_at)
SELECT
    1, 'And she shall bring forth a son, and thou shalt call his name JESUS: for he shall save his people from their sins.', 'Matthew 1:21', 'images/1.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_DATE
WHERE
    NOT EXISTS (SELECT id FROM devotional WHERE id = 1);

INSERT INTO
    devotional (id, quote, author, image_path, content, created_at, updated_at, published_at)
SELECT
    2, 'Be careful for nothing; but in every thing by prayer and supplication with thanksgiving let your requests be made known unto God.', 'Philippians 4:6', 'images/2.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_DATE + 1
WHERE
    NOT EXISTS (SELECT id FROM devotional WHERE id = 2);

INSERT INTO
    devotional (id, quote, author, image_path, content, created_at, updated_at, published_at)
SELECT
    3, 'He shall see of the travail of his soul, and shall be satisfied: by his knowledge shall my righteous servant justify many; for he shall bear their iniquities.', 'Isaiah 53:11', 'images/3.jpg', 'Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur. Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_DATE + 2
WHERE
    NOT EXISTS (SELECT id FROM devotional WHERE id = 3);