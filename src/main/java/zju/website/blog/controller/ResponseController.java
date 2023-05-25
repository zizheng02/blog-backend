package zju.website.blog.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class ResponseController {
    @GetMapping("/example")
    public String getExampleData() {
        // 这里返回一些示例数据
        return "Hello from the backend!";
    }

    @PostMapping("/example")
    public String postExampleData(@RequestBody String requestData) {
        // 在这里处理从前端发送的数据并返回响应
        return "Received data: " + requestData;
    }
}
