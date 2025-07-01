## **Java Home Task: "Fitness Tracker Assistant"**

### 🎯 **Goal:**

Create a small console-based **Fitness Tracker Assistant** that collects user input, performs calculations using operators, and prints meaningful feedback.

---

### 📝 **Step-by-Step Requirements:**

### 1. **Collect User Info**

Use the `Scanner` class to collect the following inputs from the user:

- Name (String)
- Age (int)
- Weight in kg (double)
- Height in meters (double)
- Has Gym Membership? (boolean)

### ➕ 2. **Calculate and Display BMI**

- Use the formula: `BMI = weight / (height * height)`
- Print the result and check if the BMI is:
  - `< 18.5` → Underweight
  - `18.5 - 24.9` → Normal
  - `25 - 29.9` → Overweight
  - `30+` → Obese

Use **comparison operators** to determine and display the category.

### 🧮 3. **Apply Assignment and Arithmetic Operators**

Now update the values using assignment operators:

- Increase weight by 2.5 kg (`+=`)
- Reduce age by 1 (`=`)
- Multiply height by 1.01 to simulate slight growth (`=`)

Print the updated values.

---

### ⚖️ 4. **Logical Checks**

Check and print the following results using logical operators:

- Is the user over 18 **AND** has a gym membership?
- Is the user under 18 **OR** has a BMI over 25?
- Is the user **not** a gym member?

### 🔁 5. **Final Output**

Print a summary of:

- Original and updated age, weight, and height
- BMI and category
- Logical check results (as true/false)

---

### 💡 **Bonus Challenge (Optional):**

Let the user enter their **daily steps count** (int), and use `%` to check:

- If it's divisible by 10,000 → print “🎉 Great job!”
- Else → print “🚶 Keep going!”
