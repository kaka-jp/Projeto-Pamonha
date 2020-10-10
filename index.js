const Discord = require("discord.js");
const mineflayer = require("mineflayer");
const client = new Discord.Client();
const config = require("./config.json");

<<<<<<< HEAD
//let prefix = ".";

let token = config.token;


let sending = false;
let chatData = []
=======
let prefix = ".";
>>>>>>> parent of 948154b... login está pronto (index.js)

let bot = mineflayer.createBot({
    host: `${config.serverip}`,
    port: `${config.port}`,
    username: `${config.username}`,
    version: "1.15.2",
<<<<<<< HEAD
=======
    host: "hub.dev-urandom.eu",
    username: "Pamonha",
>>>>>>> parent of 948154b... login está pronto (index.js)
})



client.on("ready", async => {
    console.log("Bot Online")
})

bot.on("login", async => {
    console.log("Ingame Bot Online")
    bot.chat("/register")
})


bot.on("message", message => {
<<<<<<< HEAD
    if(sending == true) {
        chatData.push(`${message}`)
    }


=======
>>>>>>> parent of 948154b... login está pronto (index.js)
    let channel = client.channels.cache.get("763069270845947944")
    if (!channel) return;
    
    channel.send(`${message}`)
})

<<<<<<< HEAD
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
=======
client.login("NzYzMDM5OTg5Nzc2NTE1MTAy.X3x6Xg.tbBjhdmS0djs7JnrN8mjNEpUI3c")
>>>>>>> parent of 948154b... login está pronto (index.js)
