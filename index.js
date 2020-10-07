var mineflayer = require('mineflayer')
var D = require('discord.js')
var client = new D.Client();


let ip = "PamonhaW.aternos.me";
let username = "Pamonha";
let ver = "1.15.2";
var bot = mineflayer.createBot({
  host: ip,
  username: username,
  version: ver
})

client.on('ready', async () => {
  console.log(`Discord Bot on. Loggined as ${client.user.tag}`)
})  

bot.on('login', async () => {
  console.log(`bot is on At ${ip}`)
})



bot.on("message", message => {
  var channel = client.channels.cache.get('763069270845947944')
  if (!channel) return;
  channel.send(`From Server Chat >> ${message}`)

})


client.login('NzYzMDM5OTg5Nzc2NTE1MTAy.X3x6Xg.tbBjhdmS0djs7JnrN8mjNEpUI3c')
.catch(error => {
  console.log('cant login');
})
    