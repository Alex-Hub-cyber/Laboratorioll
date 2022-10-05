package com.example.app

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.*

 class MainActivity : AppCompatActivity() {

    private lateinit var edt_Nombre:EditText
    private lateinit var edt_Edad:EditText
    private lateinit var edt_Departamento:EditText
    private lateinit var vd_resultado: TextView
    private  lateinit var lv_lista:ListView


    val Nombre = arrayListOf<String>()
    val Edad = arrayListOf<String>()
    val Departamento = arrayListOf<String>()
    val lista = arrayListOf<String>()


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        edt_Nombre=findViewById(R.id.edt_Nombre)
        edt_Edad =findViewById(R.id.edt_Edad)
        edt_Departamento=findViewById(R.id.edt_Departamento)
        vd_resultado=findViewById(R.id.vd_resultado)
        lv_lista=findViewById(R.id.lv_lista)

      /*  Log.i("info","Valor Informacion");
        Log.d("Debug","Valor Debug");
        Log.w("Warning","Valor Warning");
        Log.e("Error","Valor Error");
        Log.v("Ver","Valor Verbose");
       */
      //  val helloText = findViewById<TextView>(R.id.Hello_Text)
        // "Hello Welcome ".also { helloText.text = it }
    }
    fun AgregarLista(view:View){
        if(!edt_Nombre.text.toString().isEmpty() && !edt_Edad.text.toString().isEmpty() && !edt_Departamento.text.toString().isEmpty()) {
            Nombre.add(edt_Nombre.text.toString())
            Edad.add(edt_Edad.text.toString())
            Departamento.add(edt_Departamento.text.toString())

            var adaptador: ArrayAdapter<String> = ArrayAdapter<String>(this, R.layout.nuevo, Nombre)
            lv_lista?.adapter = adaptador

        lv_lista?.onItemClickListener=object : AdapterView.OnItemClickListener {
            override fun onItemClick(p0: AdapterView<*>?, p1: View?, p2: Int, p3: Long) {
                vd_resultado.setText(
                    "Tu nombre es ${Nombre.get(p2)} y tu  edad es de  ${Edad.get(p2)} Y vives en el departamento de ${
                        Departamento.get(
                            p2
                        )
                    }"
                )

            }
        }
        }else{
                Toast.makeText(this, "Rellene todos los datos",     Toast.LENGTH_SHORT).show()
        }


    }


}