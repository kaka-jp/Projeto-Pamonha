const mineflayer = require('mineflayer')
const { pathfinder, Movements, goals } = require('mineflayer-pathfinder')
const pvp = require('mineflayer-pvp').plugin
const config = require("./config.json")

const bot = mineflayer.createBot({
  host: `${config.host}`, // optional
  //port:`${config.port}`,       // optional
  username: 'PamonhaPvp', // email and password are required only for
})

bot.loadPlugin(pvp)
bot.loadPlugin(pathfinder)




bot.on('chat', (username, message) => {
  if (message === 'go') {
    const player = bot.players[username]

    if (!player) {
      bot.chat("I can't see you.")
      return
    }

    bot.pvp.attack(player.entity)
  }

  if (message === 'stop') {
    bot.pvp.stop()
  }
})