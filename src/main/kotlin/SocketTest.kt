import java.net.Socket
import java.util.Scanner
import kotlin.concurrent.thread

fun main(){

    thread {
        while(true){
            val socket = Socket("192.168.1.4", 12345)
            socket.getOutputStream().write(readln().toByteArray())
            socket.close()
        }
    }
}