## `Deep note:` If you pay attention, you will see my notes

- Plan: `I prefer to plan before starting to code to avoid wasting time`
  - First, translate everything into English `For English improvement`
  - Game intro - `🌋 Welcome to the Escape from Volcanic Island game`
  - Name prompt - `Enter your name: `
  - Energy and point tracking system `Energy 100 points, Score 0 points will be noted`
  - Zone 1 – Math question
    - Example: `Ali is 3 years old, his brother is 2 years younger. When Ali is 10, how old will his brother be?`
      - `Not bad logic! Energy -10, Score +5`
      - `Improve your logic! Energy -10`
  - Zone 2 – Moving in the cave with for loop
    - Example: `To pass the cave, you must take 9 steps...`
      - `You passed the cave! Energy -10, Score +5`
      - `You couldn't pass the cave! Energy -10`
  - Zone 3 – Path selection (if/else)
    - Example: `There are two ways: [L]eft and [R]ight, Which do you choose? (If you choose the wrong way, you will fall into a trap!)`
      - `Safe way! Score +10`
      - `You fell into a trap! Energy -20`
  - Zone 4 – Door selection (do-while, switch)
    - Example: `There are 3 doors. 1, 2, and 3. Find the correct door!`
      - `Door 1: An empty room. Energy -5`
      - `Door 2: Lava flow! Energy -15"`
      - `Door 3: Emergency rescue helicopter! ✅`
  - Different endings based on the final result (🏆, ⚠️, 💀)
    - Example:
      - `1.) GREAT ESCAPE! You survived like a hero! (Game over, go write some code!)`
      - `2.) You are weak, but you survived!`
      - `3.) Unfortunately, you burned, and we don't have health insurance...`

# **🧩 : “🌋Escape from the Volcanic Island”**

**🎮 Game Story:**

One day you wake up on a mysterious island…

But something is very wrong.

A powerful and active volcano beneath your feet is about to erupt soon!

To escape, you must pass through four dangerous zones and reach the emergency rescue helicopter located in the north of the island.

Each zone presents its own unique challenge:

- 📊 Math questions
- 🧭 Path choices
- 🔁 Repeated obstacles
- 🚪 Door puzzles

If you use your Java skills, you will survive and escape the island!

**🔧 What Will You Use?**

For this game, you will use the following Java topics:

| **Java Topic**   | **Purpose of Use**                                  |
| ---------------- | --------------------------------------------------- |
| Scanner          | To get input from the user                          |
| Primitive Types  | To use int, char, byte, etc.                        |
| if / else        | To make decisions based on answers                  |
| switch-case      | To choose between doors or paths                    |
| for loop         | For repeated actions (e.g., steps in the cave)      |
| while, do-while  | To loop until the correct choice is made            |
| Console Output   | For a fun and engaging text-based game experience   |

**🎯 What Should You Do**

You should write a text-based adventure game.

The game should include:

- A story and decision points
- User input
- Energy and score tracking
- Fun outputs with emojis and texts

⚠️Each zone will have a different logic or math task.

⚠️You will do calculations, choose paths, repeat steps, and use all the knowledge you learned in class.

⚠️At the end, different endings will be shown based on your final score and remaining energy:

- 🏆 Successful escape
- ⚠️ Weak but survived
- 💀 Lost in the volcano

**🗺️ General Overview of Zone Checks**

| **Zone**                        | **Task Type**            | **Java Topics Used**                |
| ------------------------------- | ------------------------ | ----------------------------------- |
| 🌋 Zone 1 – Math Canyon         | Simple calculation       | Scanner, if-else                    |
| ⛏️ Zone 2 – Dark Cave           | Step-by-step loop, obstacle | for loop, variables              |
| 🌉 Zone 3 – Broken Bridge       | Left or right path choice| char, if-else                       |
| 🔥 Zone 4 – Volcano Gates       | Door selection loop      | do-while, switch-case               |

**📌 Learning Objectives**

When you complete this game:

- You will learn basic input/output practice using Scanner
- You will learn to control game flow using conditional logic
- You will learn to apply loops in real life
- You will learn to track state using variables (score, energy)
- You will learn to build a real interactive console game
- You will improve your creative problem-solving skills with Java!

**✨ Tips**

- Be creative! You can personalize your game story.
- Add emojis and dramatic outputs to make it more fun.
- Keep your code clean and well-commented.

**✅ Submission Checklist**

Make sure your game includes:

- A story introduction and name input
- 4 unique zones and different logic tasks
- Score and energy tracking
- Loops (for, while, do-while)
- if-else, switch conditions
- Final result with an ending message

**💡 Bonus :**

- Add sound effects (as text!) as shown below.

```java
System.out.println(
"💀 *Grrr...* Last sounds are heard inside the volcano. You are already too late...");

System.out.println("🌋💥 BOOM! The volcano erupts violently! Ash and hot lava fly through the air!");
```

- Create a restart option
- Write your own creative “You Win” or “You