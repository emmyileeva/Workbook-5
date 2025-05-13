# Workbook 5 – Java Practice Projects

This folder contains my Java exercises from Workbook 5.

---

## 📘 Exercises Included

### ✅ Vehicles
- Builds a class hierarchy using inheritance to represent different vehicle types
- Defines and uses the following classes:
  - `Vehicle` – parent class containing shared properties like color, fuel capacity, and passenger info
  - `Moped`, `Car`, `SemiTruck`, `Hovercraft` – child classes that extend `Vehicle`
- Used setters in the first exercise to assign values and test object behavior in a `main()` method
- Added constructors to all classes:
  - `Vehicle` constructor accepts color, number of passengers, cargo capacity, and fuel capacity
  - Each child class uses `super()` to call the parent constructor and pass the correct values
- Great practice for:
  - Designing inheritance hierarchies
  - Using setters and constructors to initialize object data
  - Understanding how and why to use `super()` in subclass constructors
  - Testing constructor logic in a structured `main()` method
 
### ✅ AssetManager
- Simulates an asset tracking system with polymorphic behavior
- Defines a superclass `Asset` and two subclasses:
  - `House` – calculates value based on condition, square footage, and lot size
  - `Vehicle` – calculates value based on age, depreciation rules, and odometer
- In `main()`, an `ArrayList<Asset>` stores a mix of houses and vehicles
- Uses `instanceof` and downcasting to access subclass-specific data like address or make/model
- Great practice for:
  - Overriding methods with custom logic (`getValue()`)
  - Using polymorphism and casting to process mixed-type collections
  - Applying real-world logic to depreciation and asset evaluation
  - Organizing and outputting object data clearly using inheritance

---

## ✨ What I Learned
- How to design reusable class structures using inheritance  
- How to store shared properties in a superclass and extend them in child classes  
- How subclasses can use methods and constructors from their parent  
- How to properly use `super()` to initialize inherited fields  
- How to test object creation and output using constructors instead of setters  

