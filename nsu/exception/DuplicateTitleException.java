package nsu.exception;

public class DuplicateTitleException extends Exception {
    public DuplicateTitleException(String title) {
        super("게시물 제목이 중복되었습니다.");
    }
}
