import discord
import random

intents = discord.Intents.default()
intents.members = True
client = discord.Client(intents=intents)

@client.event
async def on_ready():
    print('{0.user}'.format(client))

@client.event
async def on_message(message):
    if message.author == client.user:
        return    
    
    if message.content.startswith('guess!'):
        number = random.randint(1,100)
        await message.channel.send('Я загадал число, попробуй угадать!')
        
        def check(msg):
            return msg.author == message.author and msg.channel == message.channel and msg.content.isdigit()
        
        for i in range(10):
            try:
                guess = await client.wait_for('message', check=check, timeout=30.0)
            except:
                await message.channel.send('Время вышло, попробуйте снова')
                return
            
            guess = int(guess.content)
            if guess == number:
                await message.channel.send(f"Вы угадали число {number} за {i + 1} попыток!")
            elif guess < number:
                await message.channel.send(f"Ваше число меньше загаданного. Попробуйте еще раз") 
            else:
                await message.channel.send(f"Ваше число больше загаданного. Попробуйте еще раз")    
            
        await message.channel.send(f'Вы проиграли! Я загадал число {number}')


client.run("MTA5Njg4MzkyMTA4MzQ0OTQ5NA.Gp3mTi.asIuMyYvC0cs49vkeR4urMpVzGNPBTXT027cIg")