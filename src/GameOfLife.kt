
import kotlin.nullable.toSet
import kotlin.dom.toXmlString
import com.sun.jmx.snmp.SnmpVarBindList

class GameOfLife(dialog : MainDialog) {
    val dialog = dialog

    fun run() {

        val thread = object: Thread() {
            public override fun run() {
                  gameOfLife() {
                      dialog.setText(it)
                  }
            }
        }

        thread.start();
        dialog.setVisible(true)
    }

    fun gameOfLife(action : (String) -> Unit) {
        var board = Board()

        // Blinker
        board.set(Cell(2, 0), 1)
        board.set(Cell(2, 1), 1)
        board.set(Cell(2, 2), 1)

        // Glider
        board.set(Cell(5, 5), 1)
        board.set(Cell(6, 6), 1)
        board.set(Cell(6, 7), 1)
        board.set(Cell(5, 7), 1)
        board.set(Cell(4, 7), 1)

        while(true) {
            Thread.sleep(500);

            var nextBoard = Board()
            board.cells {
                if(board.isAlive(it)) {
                    val newValue = when(board.countNeighbours(it)) {
                        2,3 -> 1
                        else -> 0
                    }
                    nextBoard.set(it, newValue)
                } else {
                    val newValue = if(board.countNeighbours(it) == 3) 1 else 0
                    nextBoard.set(it, newValue)
                }
            }

            board = nextBoard
            action(board.toText())
        }
    }


    class Cell(x : Int, y : Int) {
        public val x : Int = x
        public val y : Int = y
    }

    inner class Board {
        val boardSize = 50;
        var board = makeBoard()

        private fun makeBoard() : Array<Array<Int>> = Array<Array<Int>>(boardSize, { i -> Array<Int>(boardSize, { i -> 0})})

        fun set(cell : Cell, value : Int) {
           board[cell.x][cell.y] = value
        }

        fun countNeighbours(cell : Cell) : Int {
            var cellsToCheck = array(Cell(cell.x-1, cell.y -1),
                                     Cell(cell.x-1, cell.y),
                                     Cell(cell.x-1, cell.y+1),
                                     Cell(cell.x, cell.y-1),
                                     Cell(cell.x, cell.y+1),
                                     Cell(cell.x+1, cell.y-1),
                                     Cell(cell.x+1, cell.y),
                                     Cell(cell.x+1, cell.y+1))

            return cellsToCheck.filter { isAlive(it) }.count()
        }

        fun isAlive(cell : Cell) : Boolean {
            if(cell.x < 0 || cell.x >= boardSize) {
                return false
            }

            if(cell.y < 0 || cell.y >= boardSize) {
                return false
            }

            if(board[cell.x][cell.y] == 1) {
                return true
            }

            return false
        }

        fun cells(action : (Cell) -> Unit) {
            for(x in board.indices) {
                for(y in board.indices) {
                    action(Cell(x, y))
                }
            }
        }

        fun toText() : String {
            val builder = StringBuilder()
            for(x in board.indices) {
                for(y in board.indices) {
                    builder.append(if(board[x][y] == 1) 'X' else '-' )
                }
                builder.append('\n')
            }

            return builder.toString()
        }
    }
}







