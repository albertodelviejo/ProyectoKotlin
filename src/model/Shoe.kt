package model

class Shoe{
    var size: Int = 34 //Mínimo sea 34
        set(value) {
            if (value>= 34)
                field = value
            else
                field = 34
        }
    get() = field
    var color: String = "White"
    var model: String = "Boots" // No se ponga Tenis
        set(value) {
            if(value.equals("Tennis"))
                field = "Boots"
            else
                field = value
        }
    get() = field
}