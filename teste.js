if (process.argv.length < 4 || process.argv.length > 6) {
    console.log("Usage: node index.js <host> <port> [username] [password]")
    return
}

const mineflayer = require('mineflayer')
const { pathfinder, Movements, goals } = require('mineflayer-pathfinder')
const pvp = require('mineflayer-pvp').plugin
const { TaskQueue } = require('mineflayer-utils')
const armorManager = require('mineflayer-armor-manager')

const bot = mineflayer.createBot({
    host: process.argv[2],
    port: process.argv[3],
    username: process.argv[4] || 'Pamonha_F',
    password: process.argv[5],
})


bot.loadPlugin(pvp)
bot.loadPlugin(pathfinder)
bot.loadPlugin(armorManager)

bot.on('chat', (username, message) => {
  if (message === 'fight me') {
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