package ru.netology.order;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AppOrderTest {
    @Test

void shouldSubmitRequest() {

        open("http://localhost:9999/");
    $("[name='name']").setValue("Филипп Кошечкин");
    $("[name='phone']").setValue("+79000000000");
    $(".checkbox__box").click();
    $(".button__text").click();
    $(".Success_successBlock__2L3Cw").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim()));




    }
}