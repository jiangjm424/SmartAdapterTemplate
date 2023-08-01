package other.card.src

fun jmdroidCardKt(
        applicationPackage: String, //jm.example.droid.demo
        packageName: String,  //jm.example.droid.demo.app
        lastClassNameFormat: String,  //MainCard
        layoutCamelCase: String, //MainCardLayout
        cardModel: String,   //MainDataModel
        cardType: String   //3
): String {
    val bindingBlock = layoutCamelCase + "Binding"
    return """
package $packageName

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import com.squareup.moshi.Moshi
import $applicationPackage.databinding.$bindingBlock
import $packageName.model.$cardModel
import jm.droid.lib.samatadapter.core.IDataParse
import jm.droid.lib.samatadapter.core.ViewBindingDelegate

class $lastClassNameFormat : ViewBindingDelegate<$cardModel, $bindingBlock>() {
    override fun onCreateViewBinding(context: Context, parent: ViewGroup): $bindingBlock {
        return $bindingBlock.inflate(LayoutInflater.from(context), parent, false)
    }
    /**
     * 创建的时候对view进行一些初始化操作，比如点击事件，recycle view的初始化等操作
     */
    override fun onConfigViewHolder(holder: Holder<$bindingBlock>) {
//        holder.itemView.setOnClickListener {
//            val item = holder.data as? $cardModel
//        }
    }
    override fun onBindItem(view: $bindingBlock, pos: Int, item: $cardModel) {
        TODO("Not yet implemented")
    }

    class Factory : IDataParse.IDataParseFactory<$cardModel> {
        override val dataType: Int
            get() = $cardType

        override fun createDataParse(moshi: Moshi): IDataParse<$cardModel> =
            object : IDataParse<$cardModel> {
                override fun parse(data: Any): $cardModel {
                    TODO("Not yet implemented")
                }
            }

    }
}
""".trimIndent()
}