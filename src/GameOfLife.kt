
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
        for(var n in 1..100) {
            Thread.sleep(500);
            action("Test ${n}")
        }
    }
}







