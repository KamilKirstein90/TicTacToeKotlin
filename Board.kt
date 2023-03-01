
class Board{
    var board = Array(3){ CharArray(3){'#'}}
    
    fun printBoard()
    {
        
          print("  0 1 2")
          println()
          board.forEachIndexed{ i, row->
              print(i)
              row.forEach {
                print(" ${it}")
            }
            println()
           }
    }
    
    fun setValueToBoard(x: Int , y : Int, value : Char)
    {
        if (x <= 2 && y <= 2)
        {
            if (board[x][y] == '#')
            	board[x][y] = value
        }
    }
}
