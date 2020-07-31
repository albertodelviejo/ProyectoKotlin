package model

class Camera{

    var isOn: Boolean = false
    var flash: Boolean = false
    var brillo: Int = 0
    var resolution: Int = 640

    fun turnOn(){
        isOn = true
    }

    fun turnOff(){
        isOn = false
    }

    fun setFlash(flash: Boolean){
        this.flash = flash
    }
    
    fun getFlash(): Boolean{
        return this.flash
    }
    
    fun setBrillo(brillo: Int){
        this.brillo = brillo
    }
    
    fun getBrillo(): Int{
        return this.brillo
    }
    
    fun setResolution(resolution: Int){
        this.resolution = resolution
    }
    
    fun getResolution(): Int{
        return this.resolution
    }
    
    fun flashOn(){
        flash = true
    }
    
    fun flashOff(){
        flash = false
    }
    
    fun getcameraStatus(): String{
        return if (isOn)"Camera is Turned" else "Camera is not Turned"
    }
    
    fun getflashStatus(): String{
        return if (flash)"El flash de tu camara esta encendido" else "El flash de tu camara esta apagado"
    }
    
    /*fun setCameraStatus(onoff: Boolean){
        isOn = onoff
    }*/

}