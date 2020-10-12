
const mineflayer = require('mineflayer')
const acc = require("./bot.json")
const config = require("./config.json")
const Discord = require("discord.js")


const client = new Discord.Client()

client.on("ready", () => {
  console.log(`Client logged in ${client.user.tag}`)
})

const bot = mineflayer.createBot({
  host: config.minecraft.serverIP, // optional
  port: 25565,
  username: acc.minecraft.Username, // email and password are required only for
  version: false                 // false corresponds to auto version detection (that's the default), put for example "1.8.8" if you need a specific version
})

bot.on("login", () => {
    console.log(`Logged in as ${bot.username} \nServer: ${config.minecraft.serverIP}\n\n`)
    bot.chat (`${config.minecraft.joinCMD}`)

})  


bot.on("message", async message =>{
    let chat = message.toString()
    console.log(chat)
    if(chat.length < 1) return;
    if(chat == undefined) return;
    client.channels.cache.get(config.channels.serverchat).send(`${chat}`)


})


client.on("message", async message => {
  if(message.content.startsWith(prefix)) return
  let cmd = message.content.slice(1).split(/\ + /) [0]
  let args = message.content.split(/\+/).slice(1)


  if(cmd == "send"){
    if(!args[0]) return message.channel.send(`Not Enough argumentos`)
    bot.chat(`${args.join(" ")}`)

    let embed = new Discord.RichEmbed()
    .setColor(0x54da32)
    .setDescription(`Send: \` ${args.join(" ")}\``)
    message.channel.send(embed)

  }




})




client.login(config.discord.token)
