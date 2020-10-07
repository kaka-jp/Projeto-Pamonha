const mineflayer = require('mineflayer')
const mineflayerViewer = require('prismarine-viewer').mineflayer

const bot = mineflayer.createBot({
    host: 'PamonhaW.aternos.me', // optional
    port: 25565,       // optional
    username: 'PamonhaOlho', // email and password are required only for
    version: false                 // false corresponds to auto version detection (that's the default), put for example "1.8.8" if you need a specific version
  })

bot.once('spawn', () => {
  mineflayerViewer(bot, { port: 3000 }) // Start the viewing server on port 3000

  // Draw the path followed by the bot
  const path = [bot.entity.position.clone()]
  bot.on('move', () => {
    if (path[path.length - 1].distanceTo(bot.entity.position) > 1) {
      path.push(bot.entity.position.clone())
      bot.viewer.drawLine('path', path)
    }
  })
})