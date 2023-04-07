package com.example.spinner

import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import android.widget.Spinner
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {

    lateinit var spinner:Spinner
    lateinit var textView: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        spinner = findViewById(R.id.my_spinner)
        textView = findViewById(R.id.text_sp)


        val list = ArrayList<ItemData>()
        list.add(ItemData("Iphone s4", R.drawable.android1, "work with high speed"))
        list.add(ItemData("Iphone 3", R.drawable.android1, "work with max high speed"))
        list.add(ItemData("Iphone 5", R.drawable.android1, "work with bloooth"))
        list.add(ItemData("Iphone 6 plus", R.drawable.android1, "work with item s"))
        val adapter = SpinnerAdapter(this,R.id.mainview,list)
        spinner.adapter=adapter


    }


        /*  val spinner_array= listOf<String>("software","Enginner","Mathematic","Electric")
           val arrayAdapter :ArrayAdapter<String> = ArrayAdapter<String>(this,android.R.layout.simple_spinner_item,spinner_array)
           arrayAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item)

            spinner.adapter=arrayAdapter

            spinner.onItemSelectedListener=object :AdapterView.OnItemSelectedListener{
                override fun onItemSelected(p0: AdapterView<*>?, p1: View?, position: Int, id: Long) {
                    textView.text="index: "+ position+ " selectedText : "+spinner_array.get(position)
                }

                override fun onNothingSelected(p0: AdapterView<*>?) {
                    TODO("Not yet implemented")
                }

            }*/


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        return super.onCreateOptionsMenu(menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return super.onOptionsItemSelected(item)

        var id:Int=item.itemId
        if (id == androidx.appcompat.R.id.action_bar_spinner){

        }
    }


}
