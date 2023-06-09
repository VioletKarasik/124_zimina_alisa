class ShoppingCart {
    constructor() {
        this.items = [];
    } 
    
    
    addItem(item) {
        this.items.push(item);
    }

    removeItem(itemName) {
        this.items = this.items.filter(item => item.name !== itemName);
    }

    updateQuantity(itemName, newQuantity) {
        this.items.forEach(item => {
            if (item.name === itemName) {
                item.quantity = newQuantity;
            }
        });
    }

    getTotalCost() {
        let totalCost = 0;
        this.items.forEach(item => {
            totalCost += item.price * item.quantity;
        });
        return totalCost
    }
}

//Основная программа
let cart = new ShoppingCart();

let item1 = {
    name: 'Футболка',
    description: 'Белая',
    price: 10,
    quantity: 2
};

let item2 = {
    name: 'Джинсы',
    description: 'Синие',
    price: 20,
    quantity: 1
};


cart.addItem(item1);
cart.addItem(item2);

//console.log('Общая стоимость:', cart.getTotalCost());
alert('Общая стоимость: ' + cart.getTotalCost())

cart.updateQuantity('Футболка', 3)

//console.log('Общая стоимость после обновления:',cart.getTotalCost());
alert('Общая стоимость после обновления: ' + cart.getTotalCost());

cart.removeItem('Джинсы');

//console.log('Общая стоимость после удаления:', cart.getTotalCost());
alert('Общая стоимость после удаления: ' + cart.getTotalCost());
