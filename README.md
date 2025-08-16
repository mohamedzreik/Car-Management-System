# Car-Management-System

A Java-based car management system that demonstrates multiple design patterns including Strategy, Bridge, Builder, and Factory patterns.
Features

Car Models: Support for BMW, Mercedes, and Audi
Car Types: SUV, Sport, and Sedan configurations
Search Functionality: Search cars by brand, price, purpose, or year
Car Purposes: Renting and selling with different pricing
Flexible Car Building: Build cars with custom specifications

Design Patterns Used
1. Strategy Pattern

Package: Strategy
Purpose: Allows switching between different search algorithms
Classes: SearchStrategy, SearchByBrand, SearchByPrice, SearchByPurpose, SearchByYear

2. Bridge Pattern

Package: Bridge
Purpose: Separates car purpose from car implementation
Classes: CarPurpose, RentingPurpose, SellingPurpose

3. Builder Pattern

Package: Builder
Purpose: Constructs cars step by step with different configurations
Classes: CarBuilder, SUVBuilder, SportBuilder, SedanBuilder, Director

4. Factory Pattern

Purpose: Creates different car types and brands
Note: Factory classes are mentioned but not included in the provided files
