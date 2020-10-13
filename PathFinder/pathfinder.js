const mineflayer = require('mineflayer')
const { pathfinder, Movements, goals } = require('mineflayer-pathfinder')
const GoalFollow = goals.GoalFollow
const GoalBlock = goals.GoalBlock
const config = require("./config.json")

const bot = mineflayer.createBot({
    host: `${config.host}`,
    //port: `${config.port}`,
    username: 'pathfinder_Bot'
})

bot.loadPlugin(pathfinder)

bot.on('chat', (username,message) => {

    function followPlayer() {
        const playerCI = bot.players['Hue100']
    
        if (!playerCI || !playerCI.entity) {
            bot.chat("I can't see CI!")
            return
        }
}
})

    const mcData = require('minecraft-data')(bot.version)
    const movements = new Movements(bot, mcData)
    movements.scafoldingBlocks = []

    bot.pathfinder.setMovements(movements)

    const goal = new GoalFollow(playerCI.entity, 1)
    bot.pathfinder.setGoal(goal, true)




bot.once('spawn', followPlayer)
