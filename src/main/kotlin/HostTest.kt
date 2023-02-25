import java.net.ServerSocket

fun main(){

    val server = ServerSocket(12345)
    val socket = server.accept()

    println(String(socket.getInputStream().readAllBytes()))
    socket.close()

}