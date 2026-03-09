package org.example.demo;

@RestController
public class HelloController {

    @GetMapping("/")
    public String index() {
        return """
                <!DOCTYPE html>
                <html lang=\"es\">
                <head>
                    <meta charset=\"UTF-8\">
                    <title>MicroSpringBoot</title>
                </head>
                <body>
                    <h1>Servidor Web en Java</h1>
                    <p>Proyecto del taller usando sockets y reflexion.</p>
                    <p>Enlaces de prueba:</p>
                    <ul>
                        <li><a href=\"/hello\">/hello</a></li>
                        <li><a href=\"/pi\">/pi</a></li>
                        <li><a href=\"/greeting?name=Tomas\">/greeting?name=Tomas</a></li>
                        <li><a href=\"/index.html\">/index.html</a></li>
                    </ul>
                </body>
                </html>
                """;
    }

    @GetMapping("/pi")
    public String getPI() {
        return "PI: "+ Math.PI;
    }

    @GetMapping("/hello")
    public String helloWorld() {
        return "Hello World";
    }
}
