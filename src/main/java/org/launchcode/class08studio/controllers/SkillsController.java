package org.launchcode.class08studio.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class SkillsController {
    @GetMapping()
    @ResponseBody
    public String defaultPage() {
        String html =
                "<html>" +
                    "<body>" +
                        "<h1>Skills Tracker</h1>" +
                        "<h2>We have a few skills we would like to learn. Here is the list!</h2>" +
                        "<ol>" +
                            "<li>Java</li>" +
                            "<li>JavaScript</li>" +
                            "<li>Python</li>" +
                        "<ol/>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @GetMapping("form")
    @ResponseBody
    public String updateWithNameAndLanguage() {
        String html =
                "<html>" +
                    "<body>" +
                        "<form method = 'post' action = '/form'>" +
                            "<p>Name:</p>" +
                            "<input type = 'text' name = 'name' />" +
                            "</br>" +
                            "<p>My favorite language:</p>" +
                            "<select name='favoriteLanguage1'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "</br>" +
                            "<p>My second favorite language:</p>" +
                            "<select name='favoriteLanguage2'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "</br>" +
                            "<p>My third favorite language:</p>" +
                            "<select name='favoriteLanguage3'>" +
                                "<option value='Java'>Java</option>" +
                                "<option value='JavaScript'>JavaScript</option>" +
                                "<option value='Python'>Python</option>" +
                            "</select>" +
                            "</br>" +
                            "<input type = 'submit' value = 'Submit'/>" +
                        "</form>" +
                    "</body>" +
                "</html>";
        return html;
    }

    @PostMapping(value = "form")
    @ResponseBody
    public String formSkills(@RequestParam String name, String favoriteLanguage1, String favoriteLanguage2, String favoriteLanguage3) {
        String html =
                "<html>" +
                    "<body>" +
                        "<h1>" + name + "</h1>" +
                        "</br>" +
                        "<ol>" +
                            "<li>" + favoriteLanguage1 + "</li>" +
                            "<li>" + favoriteLanguage2 + "</li>" +
                            "<li>" + favoriteLanguage3 + "</li>" +
                        "<ol/>" +
                    "</body>" +
                "</html>";
        return html;
    }
}
