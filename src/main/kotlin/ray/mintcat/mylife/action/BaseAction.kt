package ray.mintcat.mylife.action

import org.bukkit.entity.Player

abstract class BaseAction {

    abstract val action: String

    //action.type info
    abstract fun run(player: Player, type: String, info: String)

    abstract val introduce: String

    abstract val format: String

    fun register() {
        Actions.actions.add(this)
    }

}