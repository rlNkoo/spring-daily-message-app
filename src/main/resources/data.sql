INSERT INTO
    devotional (id, quote, author, image_path, content, created_at, updated_at, published_at)
SELECT
    1, 'The only way to do great work is to love what you do.', 'Steve Jobs', 'images/1.jpg', 'This quote from Steve Jobs emphasizes the importance of passion and love for ones work. Jobs believed that when you are truly passionate about what you do, it transcends mere job tasks and becomes a pursuit of excellence. Loving your work fuels motivation, creativity, and perseverance, ultimately leading to the creation of something extraordinary.', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_DATE
WHERE
    NOT EXISTS (SELECT id FROM devotional WHERE id = 1);

INSERT INTO
    devotional (id, quote, author, image_path, content, created_at, updated_at, published_at)
SELECT
    2, 'In the middle of difficulty lies opportunity.', 'Albert Einstein', 'images/1.jpg', 'Albert Einsteins words remind us that challenges often conceal opportunities for growth and advancement. When faced with difficulties, it is easy to become discouraged, but Einstein suggests that within these challenges lie the potential for innovation and progress. By reframing setbacks as opportunities to learn and improve, we can harness their transformative power.', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_DATE + 1
WHERE
    NOT EXISTS (SELECT id FROM devotional WHERE id = 2);

INSERT INTO
    devotional (id, quote, author, image_path, content, created_at, updated_at, published_at)
SELECT
    3, 'The journey of a thousand miles begins with one step.', 'Lao Tzu', 'images/1.jpg', 'This ancient proverb by Lao Tzu encapsulates the idea that every great accomplishment starts with a single action. It underscores the importance of taking that initial step, no matter how daunting the journey ahead may seem. Each small step forward builds momentum and propels us closer to our goals, reminding us that persistence and perseverance are key on the path to success.', CURRENT_TIMESTAMP, CURRENT_TIMESTAMP, CURRENT_DATE + 2
WHERE
    NOT EXISTS (SELECT id FROM devotional WHERE id = 3);