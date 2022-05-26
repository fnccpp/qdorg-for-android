package com.example.organik

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.widget.EditText
import org.json.JSONObject
import org.json.JSONTokener
import java.io.File

class MainActivity : AppCompatActivity() {

    private var tasks: Array<String?> = arrayOfNulls(15)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        if (!File("/data/data/com.example.organik/files/tasks.json").exists()){
            //Log.d("bo","file non c'era, è stato creato")
            createJSON()
        }
        loadJSON()

        val t08 = findViewById<EditText>(R.id.text08)
        t08.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[1] = t08.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t09 = findViewById<EditText>(R.id.text09)
        t09.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[2] = t09.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t10 = findViewById<EditText>(R.id.text10)
        t10.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[3] = t10.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t11 = findViewById<EditText>(R.id.text11)
        t11.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[4] = t11.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t12 = findViewById<EditText>(R.id.text12)
        t12.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[5] = t12.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                            count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t13 = findViewById<EditText>(R.id.text13)
        t13.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[6] = t13.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t14 = findViewById<EditText>(R.id.text14)
        t14.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[7] = t14.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t15 = findViewById<EditText>(R.id.text15)
        t15.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[8] = t15.text.toString()
                writeJSON()
            }override fun beforeTextChanged(s: CharSequence, start: Int,
                                            count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }

        })
        val t16 = findViewById<EditText>(R.id.text16)
        t16.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[9] = t16.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t17 = findViewById<EditText>(R.id.text17)
        t17.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[10] = t17.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t18 = findViewById<EditText>(R.id.text18)
        t18.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[11] = t18.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t19 = findViewById<EditText>(R.id.text19)
        t19.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[12] = t19.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t20 = findViewById<EditText>(R.id.text20)
        t20.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[13] = t20.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })
        val t21 = findViewById<EditText>(R.id.text21)
        t21.addTextChangedListener(object : TextWatcher {

            override fun afterTextChanged(s: Editable) {
                tasks[14] = t21.text.toString()
                writeJSON()
            }
            override fun beforeTextChanged(s: CharSequence, start: Int,
                                           count: Int, after: Int) {
            }

            override fun onTextChanged(s: CharSequence, start: Int,
                                       before: Int, count: Int) {
            }
        })


    }

    fun writeJSON(){
        var filejson = ""
        filejson += "{"
        for (i in 1..13){
            var ora = i+7
            filejson += ( "\n\t\"task" + ora.toString() + "\":\""+ tasks[i] + "\"," )
        }
        filejson += "\n\t\"task21\":\""+tasks[14]+"\"\n}"
        val fo = File("/data/data/com.example.organik/files/tasks.json").outputStream()
        fo.write(filejson.toByteArray())
    }

    fun loadJSON(){
        // In futuro, prima sincronizzare con drive
        val fi = File("/data/data/com.example.organik/files/tasks.json").inputStream().readBytes().toString(Charsets.UTF_8)
        val jsonObject = JSONTokener(fi).nextValue() as JSONObject
        for (i in 1..14){
            var task = "task" + (i+7).toString()
            tasks[i] = jsonObject.getString(task)
        }
        //orribile
        var textbox = findViewById<EditText>(R.id.text08)
        textbox.setText(tasks[1])
        textbox = findViewById<EditText>(R.id.text09)
        textbox.setText(tasks[2])
        textbox = findViewById<EditText>(R.id.text10)
        textbox.setText(tasks[3])
        textbox = findViewById<EditText>(R.id.text11)
        textbox.setText(tasks[4])
        textbox = findViewById<EditText>(R.id.text12)
        textbox.setText(tasks[5])
        textbox = findViewById<EditText>(R.id.text13)
        textbox.setText(tasks[6])
        textbox = findViewById<EditText>(R.id.text14)
        textbox.setText(tasks[7])
        textbox = findViewById<EditText>(R.id.text15)
        textbox.setText(tasks[8])
        textbox = findViewById<EditText>(R.id.text16)
        textbox.setText(tasks[9])
        textbox = findViewById<EditText>(R.id.text17)
        textbox.setText(tasks[10])
        textbox = findViewById<EditText>(R.id.text18)
        textbox.setText(tasks[11])
        textbox = findViewById<EditText>(R.id.text19)
        textbox.setText(tasks[12])
        textbox = findViewById<EditText>(R.id.text20)
        textbox.setText(tasks[13])
        textbox = findViewById<EditText>(R.id.text21)
        textbox.setText(tasks[14])
    }

    fun createJSON(){
        var filejson = ""
        filejson += "{"
        for (i in 1..13){
            var ora = i+7
            //filejson += ( "\n\t\"task" + ora.toString() + "\":\"pr\"," )
            filejson += ( "\n\t\"task" + ora.toString() + "\":\""+ i + "\"," )
        }
        filejson += "\n\t\"task21\":\"14\"\n}"
        try{
            var fo = openFileOutput("tasks.json", MODE_PRIVATE)
            fo.write(filejson.toByteArray())
            fo.close()
        }
        catch (ex:Exception){
            print(ex.message)
        }

        /*
        val xmlSerializer = Xml.newSerializer()
        val writer = StringWriter()
        xmlSerializer.setOutput(writer)
        xmlSerializer.startDocument("UTF-8", false)
        xmlSerializer.startTag("", "tasks")
        for (i in 1..14) {
            xmlSerializer.startTag("", "task")
            xmlSerializer.endTag("", "task")
        }
        xmlSerializer.endDocument()
        */
    }
}

