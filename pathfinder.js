const MinecraftData = require('minecraft-data')
const mineflayer = require('mineflayer')
const { pathfinder, Movements, goals } = require('mineflayer-pathfinder')
const GoalFollow = goals.GoalFollow


const bot = mineflayer.createBot({
  host: 'localhost', // optional
  port: 25565,       // optional
  username: 'PamonhaPathfinder', // email and password are required only for
  version: false                 // false corresponds to auto version detection (that's the default), put for example "1.8.8" if you need a specific version
})


bot.loadPlugin(pathfinder)

function followPlayer() {
  const playerCI = bot.players ['Hue100']

  if (!playerCI) {
    bot.chat("I can't see CI")
    return
  }
  
  const mcData = require ('minecraft-data')(bot.version)
  const movements = new Movements(bot, mcData)



  bot.pathfinder.setMovements(movements)



  const goal = new GoalFollow(playerCI.entity,1 )
  bot.pathfinder.setGoal(goal, true)
} 


bot.once('spawn', followPlayer)