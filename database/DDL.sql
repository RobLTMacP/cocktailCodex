-- Create Drinks Table
CREATE TABLE drinks (
                        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        name VARCHAR(100) UNIQUE NOT NULL,
                        description TEXT,
                        price DECIMAL(6,2) NOT NULL CHECK (price > 0),
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create Ingredients Table
CREATE TABLE ingredients (
                             id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                             name VARCHAR(100) UNIQUE NOT NULL,
                             type ENUM('LIQUOR', 'MIXER', 'GARNISH', 'OTHER') NOT NULL
);

-- Junction Table for Many-to-Many Relationship between Drinks & Ingredients
CREATE TABLE drink_ingredients (
                                   drink_id INT NOT NULL,
                                   ingredient_id INT NOT NULL,
                                   amount VARCHAR(50) NOT NULL, -- Example: "2 oz", "1 slice", "Dash"
                                   PRIMARY KEY (drink_id, ingredient_id),
                                   FOREIGN KEY (drink_id) REFERENCES drinks(id) ON DELETE CASCADE,
                                   FOREIGN KEY (ingredient_id) REFERENCES ingredients(id) ON DELETE CASCADE
);

-- Create Customers Table
CREATE TABLE customers (
                           id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                           name VARCHAR(100) NOT NULL,
                           email VARCHAR(100) UNIQUE,
                           phone VARCHAR(15) UNIQUE,
                           created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

-- Create Orders Table
CREATE TABLE orders (
                        id INT NOT NULL AUTO_INCREMENT PRIMARY KEY,
                        customer_id INT,
                        total_price DECIMAL(8,2) NOT NULL CHECK (total_price >= 0),
                        status ENUM('PENDING', 'COMPLETED', 'CANCELLED') NOT NULL DEFAULT 'PENDING',
                        created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
                        FOREIGN KEY (customer_id) REFERENCES customers(id) ON DELETE SET NULL
);

-- Order Items (Drinks in Orders)
CREATE TABLE order_items (
                             order_id INT NOT NULL,
                             drink_id INT NOT NULL,
                             quantity INT NOT NULL CHECK (quantity > 0),
                             price DECIMAL(6,2) NOT NULL,
                             PRIMARY KEY (order_id, drink_id),
                             FOREIGN KEY (order_id) REFERENCES orders(id) ON DELETE CASCADE,
                             FOREIGN KEY (drink_id) REFERENCES drinks(id) ON DELETE CASCADE
);
