import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Stack;

public class MainClassWS1 {
    public static void main(String[] args) {
        //new initMemento();
        WeatherMonitoringSystem ws = WeatherMonitoringSystem.theInstance();
        MonitoringScreen p_MonitorScreen = new MonitoringScreen(ws);
        Log p_log = new Log(ws);
        AlarmClock nimbus1Clock = Nimbus1Clock.theInstance();
    }
}

/*
class initMemento {
    ManageMemento manageMemento = new ManageMemento();

    Board board = new Board();

    public initMemento() {

        try {
            board.score = 20;
            manageMemento.Add(board.saveStateTOMemento());

            board.score = 30;
            manageMemento.mementos.add(board.saveStateTOMemento());

            board.restoreFromMemento(manageMemento.GetLastState());
            System.out.println(board.score);

            board.score = 40;
            manageMemento.mementos.add(board.saveStateTOMemento());

            board.score = 50;
            manageMemento.mementos.add(board.saveStateTOMemento());
            board.restoreFromMemento(manageMemento.GetLastState());
            System.out.println(board.score);
            board.restoreFromMemento(manageMemento.GetLastState());
            System.out.println(board.score);
            board.restoreFromMemento(manageMemento.GetLastState());
            System.out.println(board.score);
            board.restoreFromMemento(manageMemento.GetLastState());
            System.out.println(board.score);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}


class Memento {
    private int score;

    public Memento(int _score) {
        score = _score;
    }

    public int getScore() {
        return score;
    }
}

class BoardSaveState {
    Board board;

    public BoardSaveState(Board _board) {
        board = _board;
    }

    public Memento saveStateTOMemento(int score) {
        return new Memento(score);
    }

    public void restoreFromMemento(Memento memento) {
        board.score = memento.getScore();
    }
}

class Board {
    int score;
    private BoardSaveState boardSaveState;

    public Board() {
        boardSaveState = new BoardSaveState(this);
    }

    public Memento saveStateTOMemento() {
        return boardSaveState.saveStateTOMemento(score);
    }

    public void restoreFromMemento(Memento memento) {
        boardSaveState.restoreFromMemento(memento);
    }
}

class ManageMemento {
    public Stack<Memento> mementos = new Stack<>();

    public void Add(Memento memento) {
        mementos.add(memento);
    }

    public Memento GetLastState() throws Exception {
        if (!mementos.empty()) {
            return mementos.pop();
        }
        throw new Exception("There is no states to restore");
    }
}

*/