const Discord = require("discord.js");
const mineflayer = require("mineflayer");
const client = new Discord.Client();
const config = require("./config.json");



let sending = false;
let chatData = []

let bot = mineflayer.createBot({
    version: "1.15.2",
    host: "to.play-ml.ru",
    //host: "hub.dev-urandom.eu",
    //username: "Pamonha",
    //host:"localhost",
    //port: 49518,
    username: "Kurihara_P",
})



client.on("ready", async => {
    console.log("Bot Online")
    bot.chat("/login biluteteia")
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

client.login("NzYzMDM5OTg5Nzc2NTE1MTAy.X3x6Xg.tbBjhdmS0djs7JnrN8mjNEpUI3c")
