const mineflayer = require('mineflayer')
const mineflayerViewer = require('prismarine-viewer').mineflayer
const config = require("./config.json")

const bot = mineflayer.createBot({
  host: `${config.host}`,
  //port: `${config.port}`,
  username: 'BotViewer'
})

bot.once('spawn', () => {
  mineflayerViewer(bot, { port: `${config.port}` }) 

  // Draw the path followed by the bot
  const path = [bot.entity.position.clone()]
  bot.on('move', () => {
    if (path[path.length - 1].distanceTo(bot.entity.position) > 1) {
      path.push(bot.entity.position.clone())
      bot.viewer.drawLine('path', path)
    }
  })
})