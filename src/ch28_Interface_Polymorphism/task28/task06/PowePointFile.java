package ch28_Interface_Polymorphism.task28.task06;

public class PowePointFile implements ReadFile {

    @Override
    public String open() {
        return "opening.ppt";
    }

    @Override
    public String read() {
        return "reading.ppt";
    }

    @Override
    public String save() {
        return "saving.ppt";
    }

    @Override
    public String close() {
        return "closing.ppt";
    }
}
