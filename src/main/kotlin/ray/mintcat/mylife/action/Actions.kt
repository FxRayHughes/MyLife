package ray.mintcat.mylife.action

import org.bukkit.entity.Player
import ray.mintcat.mylife.action.impl.CommandAction

object Actions {

    val actions = ArrayList<BaseAction>()

    fun loadActions(){
        CommandAction().register()
    }

    //action格式: command.op OP Ray_Hughes

    fun runAction(action:String,info:String,player: Player){

    }


}