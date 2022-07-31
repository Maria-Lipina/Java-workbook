package Agency;

import Agency.Agency.Position;
import Agency.Agency.Task;

class Worker {
    private String wName;
    private Position pos;
    private Task task;

    public Worker(String wName, Position pos) {
        this.wName = wName;
        this.pos = pos;
    }

    public String geWName() {
        return wName;
    }

    public Position getPosition() {
        return pos;
    }

    
}

