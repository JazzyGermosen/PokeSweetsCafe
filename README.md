🍰 PokeSweetsCafe

A whimsical Pokémon-themed café application

📚 Table of Contents

✨ Project Description

🌳 Project Structure

💡 Interesting Code Snippet

✨ Project Description

PokeSweetsCafe is a fun and interactive café application inspired by the world of Pokémon.
The project showcases a menu of Pokémon-themed drinks, snacks, and desserts—such as a Pikachu Latte or a Bulbasaur Berry Tart—and presents them through a colorful, themed interface.

This application was created as a capstone project to demonstrate:

🌳 Project Structure

PokeSweetsCafe/
├── .idea/
├── src/
│   └── main/
│       └── java/
│           └── com/
│               └── pluralsight/     ← main Java package
├── pom.xml
├── .gitignore
└── README.md


💡 Interesting Code Snippet

One of the notable pieces of code used to dynamically retrieve and display menu items:

// MenuController.java
@GetMapping("/menu")
public String showMenu(Model model) {
    List<MenuItem> items = menuService.getAllItems();
    model.addAttribute("items", items);
    return "menu";
}

✨ Why this is interesting:

I think the biggest thing about this code tis that it allows me to be able to reference the object properties from that class and really helps show the connection between the class 
