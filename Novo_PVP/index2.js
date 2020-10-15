const mineflayer = require('mineflayer')
const pvp = require('mineflayer-pvp').plugin
const {pathfinder, Movements, goals} = require('mineflayer-pathfinder')
const armorManager = require('mineflayer-armor-manager')
const config = require("./config.json")

const bot = mineflayer.createBot({
    host: `${config.host}`,
    port: `${config.port}`,
    username: 'pvp_Bot2'
})

bot.loadPlugin(pvp)
bot.loadPlugin(armorManager)
bot.loadPlugin(pathfinder)


bot.on('playerCollect', (collector, itemDrop) => {
    if (collector !== bot.entity) return
  
    setTimeout(() => {
      const sword = bot.inventory.items().find(item => item.name.includes('sword'))
      if (sword) bot.equip(sword, 'hand')
    }, 150)
  })

  bot.on('playerCollect', (collector, itemDrop) => {
    if (collector !== bot.entity) return
  
    setTimeout(() => {
      const shield = bot.inventory.items().find(item => item.name.includes('shield'))
      if (shield) bot.equip(shield, 'off-hand')
    }, 250)
  })
  

  bot.on('chat', (username, message) => {

    if (message === 'guard') {
      const player = bot.players[username]

      if (!player) {
        bot.chat("Cade tu de novo?")
        return
      }
      bot.chat('De prontidão na area')
      guardArea(player.entity.position)
    }


    
      if (message === 'x1') {
          const player = bot.players['pvp_Bot']

          if (!player) {
              bot.chat('Cade tu?')
              return
          }
          bot.chat('Banzai!')
          bot.pvp.attack(player.entity)
      }

      if (message === 'stop') {
          bot.chat('Estou de guarda')
          bot.pvp.attack(null)
      }
  })


  let guardPos = null

  function guardArea (pos) {
    guardPos = pos.clone()

    if (!bot.pvp.target) {
      moveToGuardPos()
    }
  }

  function stopGuarding () {
    guardPos = null
    bot.pvp.stop()
    bot.pathfinder.setGoal(null)
  }

  function moveToGuardPos () {
    const mcData = require('minecraft-data')(bot.version)
    bot.pathfinder.setMovements(new Movements(bot, mcData))
    bot.pathfinder.setGoal(new goals.GoalBlock(guardPos.x, guardPos.y, guardPos.z))
  }

  bot.on('physicTick', () => {
    if (!guardPos) return
  
    const filter = e => e.type === 'mob' && e.position.distanceTo(bot.entity.position) < 16 &&
                        e.mobType !== 'Armor Stand' // Mojang classifies armor stands as mobs for some reason?
  
    const entity = bot.nearestEntity(filter)
    if (entity) {
      bot.pvp.attack(entity)
    }
  })

  bot.on('stoppedAttacking', () => {
    if (guardPos) {
      moveToGuardPos()
    }
  })

  bot.on('physicTick', () => {
    if (bot.pvp.target) return
    if (bot.pathfinder.isMoving()) return
  
    const entity = bot.nearestEntity()
    if (entity) bot.lookAt(entity.position.offset(0, entity.height, 0))
  })