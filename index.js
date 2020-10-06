var mineflayer = require('mineflayer')
var D = require('discord.js')
var client = new D.Client();

var bot = mineflayer.createBot({
  host: 'CantinhodoWifi.aternos.me', // optional
  username: 'Pamonha', // email and password are required only for
  version: false                 // false corresponds to auto version detection (that's the default), put for example "1.8.8" if you need a specific version
})

client.on('ready', async () => {
  console.log(`Discord Bot on. Loggined as ${client.user.tag}`)
})

bot.on('login', async () => {
  console.log(`bot is on At ${ip}`)
})



bot.on("message", message => {
  let channel = client.channels.cache.get('715203209333047306')
  if (!channel) return;
  channel.send(`From Server Chat >> ${message}`)

})






client.login('NzYzMDM5OTg5Nzc2NTE1MTAy.X3x6Xg.tbBjhdmS0djs7JnrN8mjNEpUI3c')
.catch(error => {
  console.log('cant login');
})