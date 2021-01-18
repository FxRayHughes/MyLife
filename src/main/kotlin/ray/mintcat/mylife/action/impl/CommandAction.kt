package ray.mintcat.mylife.action.impl

import io.izzel.taboolib.util.Features
import org.bukkit.Bukkit
import org.bukkit.entity.Player
import ray.mintcat.mylife.action.BaseAction

class CommandAction : BaseAction() {
    override val action: String
        get() = "command"

    override val introduce: String
        get() = "以一定权限执行命令"

    override val format: String
        get() = "command.[type] [info]"

    override fun run(player: Player, type: String, info: String) {
        when (type) {
            "player" -> Features.dispatchCommand(player, info)
            "op" -> Features.dispatchCommand(player, info, true)
            "server" -> Features.dispatchCommand(Bukkit.getConsoleSender(), info)
        }
    }
}