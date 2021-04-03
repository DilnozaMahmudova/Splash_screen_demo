package uz.dilnoza.mobiuz.ui

import android.app.AlertDialog
import android.content.Context
import android.content.DialogInterface
import android.view.LayoutInflater
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.dialog.*
import kotlinx.android.synthetic.main.dialog.view.*
import kotlinx.android.synthetic.main.list_item.*
import uz.dilnoza.mobiuz.R
import uz.dilnoza.mobiuz.data.Info
import uz.dilnoza.mobiuz.extensions.SingleBlock
import kotlin.system.exitProcess

class Dialog(context: Context, actionName: String) : AlertDialog(context) {
    private val contentView = LayoutInflater.from(context).inflate(R.layout.dialog, null, false)
    private var listener: SingleBlock<Info>? = null
    private var info: Info? = null

    init {
        setView(contentView)
        contentView.apply {
            but.setOnClickListener {  Toast.makeText(context,"So'rovingiz qabul qilindi. Javobini SMS orqali kuting!",
                Toast.LENGTH_SHORT).show()
            }
        }
        setButton(DialogInterface.BUTTON_NEGATIVE,"Exit"){_,_ ->}
        val data = info ?: Info("", "", "", "", "", "", "", "", "", "", "")
        data.Tmin = contentView.inf_1.text.toString()
        data.min = contentView.inf_2.text.toString()
        data.trafik = contentView.inf_3.toString()
        data.sms = contentView.inf_4.toString()
        data.costMin = contentView.inf_5.toString()
        data.costSms = contentView.inf_6.toString()
        data.costSmsInter = contentView.inf_7.toString()
        data.costMB = contentView.inf_8.toString()
        listener?.invoke(data)
    }

    fun setData(info: Info) = with(contentView) {
        this@Dialog.info = info
        inf_1.setText(info.Tmin)
        inf_2.setText(info.min)
        inf_3.setText(info.trafik)
        inf_4.setText(info.sms)
        inf_5.setText(info.costMin)
        inf_6.setText(info.costSms)
        inf_7.setText(info.costSmsInter)
        inf_8.setText(info.costMB)
    }

    fun setOnClickListener(block: SingleBlock<Info>) { listener = block }
}