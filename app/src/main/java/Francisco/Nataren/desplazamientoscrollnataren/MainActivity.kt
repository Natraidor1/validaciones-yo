package Francisco.Nataren.desplazamientoscrollnataren

import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val txtNombre = findViewById<EditText>(R.id.txtNombre)
        val txtApellido = findViewById<EditText>(R.id.txtApellido)
        val txtEdad = findViewById<EditText>(R.id.txtEdad)
        val txtProfesion = findViewById<EditText>(R.id.txtDireccion)
        val txtNumeroDeTarjeta = findViewById<EditText>(R.id.txtTarjeta)
        val txtFechaDeVencimiento = findViewById<EditText>(R.id.txtFechaDeVencimiento)
        val txtTelefono = findViewById<EditText>(R.id.txtTelefono)
        val txtCorreo = findViewById<EditText>(R.id.txtCorreo)
        val txtTipoDeSangre = findViewById<EditText>(R.id.txtTipoDeSangre)
        val txtEstadoCivil = findViewById<EditText>(R.id.txtEstadoCivil)
        val btnGuardar = findViewById<Button>(R.id.btnGuardar)

        btnGuardar.setOnClickListener{

            val nombre = txtNombre.text.toString()
            val apellido = txtApellido.text.toString()
            val edad = txtEdad.text.toString()
            val profesion = txtProfesion.text.toString()
            val tarjeta = txtNumeroDeTarjeta.text.toString()
            val vencimiento = txtFechaDeVencimiento.text.toString()
            val telefono = txtTelefono.text.toString()
            val correo = txtCorreo.text.toString()
            val tipoSangre = txtTipoDeSangre.text.toString()
            val estadocivil = txtEstadoCivil.text.toString()

            var hayErrores = false


            if (nombre.isEmpty()){

                txtNombre.error = "nombre obligatorio"
                hayErrores = true
            }
            else{
                
            }
        }


    }
}