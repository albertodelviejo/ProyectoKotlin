package model

class Shoe(name: String, description : String, sku: Int, var marca: String) :
        Product(name,description,sku), ICrudActions{

    override fun toString(): String {
        return super.toString() + "Marca: $marca"
    }

    override fun create() : String{
        return "Create Shoe"
    }

    override fun read() : String{
        return "Read Shoe"
    }

    override fun update(): String{
        return "Update Shoe"
    }

    override fun delete(): String{
        return "Delete Shoe"
    }




    init {
        println("SKU ID: ${sku}")
        println("Marca: ${marca}")
    }

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