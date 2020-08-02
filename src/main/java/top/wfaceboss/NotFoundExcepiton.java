package top.wfaceboss;


import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

/*
*
*
* @ResponseStatus(HttpStatus.NOT_FOUND) 找不到的状态
*
* */


@ResponseStatus(HttpStatus.NOT_FOUND)
public class NotFoundExcepiton extends RuntimeException {

    public NotFoundExcepiton() {
    }

    public NotFoundExcepiton(String message) {

        super(message);
    }

    public NotFoundExcepiton(String message, Throwable cause) {

        super(message, cause);

    }

}
