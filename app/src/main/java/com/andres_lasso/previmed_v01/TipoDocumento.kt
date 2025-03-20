package com.andres_lasso.previmed_v01

class TipoDocumento {
    var id: Int = 0
    var tipo: String? = null

    constructor()


    constructor(tipo: String?, id: Int) {
        this.tipo = tipo
        this.id = id
    }
}