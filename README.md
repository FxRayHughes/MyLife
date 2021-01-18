# MyLife

##### 采集 钓鱼 禁止附魔 禁止执行指令 食物

###### 为了参加比赛写的插件是没有灵魂的

## Action

```kotlin
//第一步写个类
class CommandAction : BaseAction() {
    //方法的识别根
    override val action: String
        get() = "command"
    //介绍 通过指令可以调用
    override val introduce: String
        get() = "以一定权限执行命令"
    //格式写法
    override val format: String
        get() = "command.[type] [info]"
    //动作
    //这里是 command.op xxx 的一个写法
    override fun run(player: Player, type: String, info: String) {
        when (type) {
            "player" -> Features.dispatchCommand(player, info)
            "op" -> Features.dispatchCommand(player, info, true)
            "server" -> Features.dispatchCommand(Bukkit.getConsoleSender(), info)
        }
    }
}
//第二步注册
//主类要在 onEable时注册
object MyLife : Plugin() {

    override fun onEnable() {
        CommandAction().register()
    }

}
//注册完成

```

## Release Source Code

````groovy
processResources {
    from(sourceSets.main.allSource) {
        exclude 'plugin.yml'
    }
````
