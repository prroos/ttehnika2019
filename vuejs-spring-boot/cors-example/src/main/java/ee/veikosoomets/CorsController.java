package ee.veikosoomets;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CorsController {
    private final Logger log = LoggerFactory.getLogger(this.getClass());

    @PostMapping("/cors-example")
    public void logPostParameters(@RequestBody PostParams postParams) {
        log.info("Message: " + postParams.getMsg() + " with checked value: " + postParams.isChecked());
    }

    static class PostParams {
        private String msg;
        private boolean checked;

        private PostParams() {}

        public String getMsg() {
            return msg;
        }

        public void setMsg(String msg) {
            this.msg = msg;
        }

        public boolean isChecked() {
            return checked;
        }

        public void setChecked(boolean checked) {
            this.checked = checked;
        }
    }
}
