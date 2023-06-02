class Animal:
    def __init__(self, name, age, species):
        self.name = name
        self.age = age
        self.species = species

    def eat(self):
        pass

    def sleep(self):
        pass

    def make_sound(self):
        pass

    def __str__(self):
        return f"{self.species} named {self.name}, age {self.age}"

class Mammal(Animal):
    def __init__(self, name, age, species, fur_color, num_legs):
        super().__init__(name, age, species)
        self.fur_color = fur_color
        self.num_legs = num_legs

    def give_birth(self):
        pass

    def nurse_young(self):
        pass    

class Bird(Animal):
    def __init__(self, name, age, species, wing_span, beak_length):
        super().__init__(name, age, species)
        self.wing_span = wing_span
        self.beak_length = beak_length

    def fly(self):
        pass

    def build_nest(self):
        pass

class Reptile(Animal):
    def __init__(self, name, age, species, scale_color, venom_type):
        super().__init__(name, age, species)
        self.scale_color = scale_color
        self.venom_type = venom_type

    def lay_eggs(self):
        pass

    def shed_skin(self):
        pass

class Enclosure:
    def __init__(self, size, temperature):
        self.size = size
        self.temperature = temperature
        self.animals = []

    def add_animal(self, animal):
        self.animals.append(animal)

    def remove_animal(self, animal):
        self.animals.remove(animal)

    def __str__(self):
        return f"Enclosure of size {self.size}, temperature {self.temperature}. {len(self.animals)} animals"

class Zookeeper:        
    def __init__(self, name, years_of_experience):
        self.name = name
        self.years_of_experience = years_of_experience

    def feed_animals(self):
        pass

    def clean_enclosures(self):
        pass

class Zoo:    
    def __init__(self, name, location):
        self.name = name
        self.location = location
        self.animals = []
        self.enclosures = []
        self.zookeepers = []


    def add_animal(self, animal):
        self.animals.append(animal)

    def remove_animal(self, animal):
        self.animals.remove(animal)
    
    def add_enclosure(self, enclosure):
        self.enclosures.append(enclosure)

    def remove_enclosure(self, enclosure):
        self.enclosures.remove(enclosure)

    def add_zookeeper(self, zookeeper):
        self.zookeepers.append(zookeeper)

    def remove_zookeeper(self, zookeeper):
        self.zookeepers.remove(zookeeper)

    def __str__(self):
        return f'{self.name} located in {self.location} with {len(self.enclosures)} enclosures and {len(self.zookeepers)} zookeepers'


lion = Mammal("Leo", 5, "Lion", "Golden", 4)
eagle = Bird("Baldy", 2, "Eagle", 150, 10)
snake = Reptile("Shh", 3, "Snake", "Green", "Venomous")

enclosure1 = Enclosure("Large", 25)
enclosure1.add_animal(eagle)
enclosure2 = Enclosure("Medium", 30)
enclosure2.add_animal(lion)

zookeeper1 = Zookeeper("Ivan", 10)
zookeeper1 = Zookeeper("John", 5)

zoo = Zoo("MegaZoo", "City Center")

zoo.add_animal(lion)
zoo.add_animal(eagle)
zoo.add_animal(snake)

zoo.add_enclosure(enclosure1)
zoo.add_enclosure(enclosure2)

zoo.add_zookeeper(zookeeper1)
zoo.add_zookeeper(zookeeper1)

print(zoo)
print(lion)
print(enclosure1)