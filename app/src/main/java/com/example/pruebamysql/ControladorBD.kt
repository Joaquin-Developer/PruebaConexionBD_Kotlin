package com.example.pruebamysql

import java.sql.Connection
import java.sql.DriverManager;

class ControladorBD {
    var conexion: Connection? = null
    val driver = "com.mysql.jdbc.Driver"
    val url = "jdbc:mysql://localhost:3306/coronavirusUY"
    val user = "root"
    val password = ""

    fun getConnection(): Connection? {
        Class.forName(driver)
        conexion = DriverManager.getConnection(url, user, password)
        return conexion
    }

    @Throws(Exception::class)
    fun obtenerUnDato(): List<String> {
        var lista = mutableListOf<String>()
        val con = getConnection()
        val st = con!!.createStatement()
        val result = st.executeQuery("select nombre from usuarios")
        while (result.next()) {
            lista.add(result.getString("nombre"))
        }
        con.close()
        return lista
    }

}
