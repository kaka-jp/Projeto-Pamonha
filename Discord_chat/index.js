const Discord = require("discord.js");
const mineflayer = require("mineflayer");
const client = new Discord.Client();
const { pathfinder, Movements, goals } = require('mineflayer-pathfinder')
const GoalFollow = goals.GoalFollow
const GoalBlock = goals.GoalBlock
const config = require("./config.json")



let sending = false;
let chatData = []
let token = config.token;

let bot = mineflayer.createBot({
    //host: "to.play-ml.ru",
    //username: "Pamonha",
    host:`${config.host}`,
    port: `${config.port}`,
    username: "Kurihara_P",
})



client.on("ready", async => {
    console.log("Bot Online")
})

bot.on("ready", async => {
    console.log("Ingame Bot Online")
})


bot.on("message", message => {

    if(sending == true) {
        chatData.push(`${message}`)
    }


    let channel = client.channels.cache.get("763069270845947944")
    if (!channel) return;
    
    channel.send(`${message}`)
})


client.on("message", async msg => {
    let args = msg.content.split(" ").slice(1)

    if (msg.content.startsWith(".runcmd")) {
        let toSend = args.join(" ");
        if(!toSend) return msg.reply("No Args")

        bot.chat(toSend)
        sending = true
        msg.channel.send(`${msg.author.tag} just sent ${toSend}`)


        setTimeout(() => {
            sending = false
            msg.channel.send(chatData.join("\n"))
            chatData = []

        }, 750)






    }



})

client.login(token)



  bot.loadPlugin(pathfinder)

function followPlayer() {
    const playerCI = bot.players['Hue100']

    if (!playerCI || !playerCI.entity) {
        bot.chat("I can't see CI!")
        return
    }

    const mcData = require('minecraft-data')(bot.version)
    const movements = new Movements(bot, mcData)
    movements.scafoldingBlocks = []

    bot.pathfinder.setMovements(movements)

    const goal = new GoalFollow(playerCI.entity, 1)
    bot.pathfinder.setGoal(goal, true)
}



bot.once('spawn', followPlayer)