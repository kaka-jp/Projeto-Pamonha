const { Message } = require('discord.js')
const mineflayer = require('mineflayer')
const acc = require("./bot.json")
const config = require("./config.json")

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
})