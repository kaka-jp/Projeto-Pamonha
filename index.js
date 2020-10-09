const Discord = require("discord.js");
const mineflayer = require("mineflayer");
const client = new Discord.Client();

let prefix = ".";

let bot = mineflayer.createBot({
    version: "1.15.2",
    host: "hub.dev-urandom.eu",
    username: "Pamonha",
})

client.on("ready", async => {
    console.log("Bot Online")
})

bot.on("login", async => {
    console.log("Ingame Bot Online")
    bot.chat("/register")
})


bot.on("message", message => {
    let channel = client.channels.cache.get("763069270845947944")
    if (!channel) return;
    
    channel.send(`${message}`)
})

client.login("NzYzMDM5OTg5Nzc2NTE1MTAy.X3x6Xg.tbBjhdmS0djs7JnrN8mjNEpUI3c")