const mineflayer = require('mineflayer')
const mineflayerViewer = require('prismarine-viewer').mineflayer
const { pathfinder, Movements, goals } = require('mineflayer-pathfinder')
const GoalFollow = goals.GoalFollow
const GoalBlock = goals.GoalBlock

  
/*
 *
 * A simple bot demo https://github.com/PrismarineJS/prismarine-viewer
 * Start it then open your browser to http://localhost:3007 and enjoy the view
 *
 */

const bot = mineflayer.createBot({
    host: 'localhost', // optional
    port: 54365,       // optional
    username: 'PamonhaOlho', // email and password are required only for
    version: false                 // false corresponds to auto version detection (that's the default), put for example "1.8.8" if you need a specific version
  })

  bot.once('spawn', () => {
    mineflayerViewer(bot, { port: 54365, firstPerson: false })
  })

  bot.loadPlugin(pathfinder)

function followPlayer() {
    const playerCI = bot.players['Hue100']

    if (!playerCI || !playerCI.entity) {
        bot.chat("I can't see CI!")
        return
    }

    const mcData = require('minecraft-data')(bot.version)
    const movements = new Movements(bot, mcData)
    movements.scafoldingBlocks = []

    bot.pathfinder.setMovements(movements)

    const goal = new GoalFollow(playerCI.entity, 1)
    bot.pathfinder.setGoal(goal, true)
}



bot.once('spawn', followPlayer)