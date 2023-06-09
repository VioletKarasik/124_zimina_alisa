function getComputerChoice() {
    var choices = ['камень', 'ножницы', 'бумага', 'ящерица', 'спок'];
    var randomIndex = Math.floor(Math.random() * choices.length);
    return choices[randomIndex];
}

function getPlayerChoice() {
    var choice = prompt("Введите ваш выбор: Камень, Ножницы, Бумага, Ящерица или Спок").toLowerCase();

    while (choice !== 'камень' && choice !== 'ножницы' && choice !== 'бумага' && choice !== 'ящерица' && choice !== 'спок') {
        var choice = prompt("Некорректный выбор! Введите ваш выбор: Камень, Ножницы, Бумага, Ящерица или Спок").toLowerCase();
    }
    
    return choice
}

function determineWinner(playerChoice, computerChoice) {
    if (playerChoice === computerChoice) {
        return 'Ничья!';
    } else if (
        (playerChoice === "камень" && (computerChoice === "ножницы" || computerChoice === "ящерица")) ||
        (playerChoice === "ножницы" && (computerChoice === "бумага" || computerChoice === "ящерица")) ||
        (playerChoice === "бумага" && (computerChoice === "камень" || computerChoice === "спок")) ||
        (playerChoice === "ящерица" && (computerChoice === "бумага" || computerChoice === "спок")) ||
        (playerChoice === "спок" && (computerChoice === "ножницы" || computerChoice === "камень"))
    ) {
        return "Вы победили!";
    } else {
        return "Победил компьютер!";
    }
}

function playGame() {
    var playerChoice = getPlayerChoice();
    var computerChoice = getComputerChoice();

    alert("Ваш выбор: " + playerChoice + "\nВыбор компьютера: " + computerChoice);

    var result = determineWinner(playerChoice, computerChoice);
    alert(result)

    var playAgain = confirm("Хотите сыграть еще раз?");
    if (playAgain) {
        playGame();
    } else {
        alert("Спасибо за игру! До свидания!");
    }
}

playGame();
