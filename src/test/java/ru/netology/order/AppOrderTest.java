package ru.netology.order;

import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.exactText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.open;

public class AppOrderTest {
    @Test
    void shouldSubmitRequest() {

        open("http://localhost:9999/");
        $("[name='name']").setValue("Филипп Кошечкин-Лукошечкин");
        $("[name='phone']").setValue("+79000000000");
        $("[data-test-id='agreement']").click();
        $(".button__text").click();
        $("[data-test-id='order-success").shouldHave(exactText("Ваша заявка успешно отправлена! Наш менеджер свяжется с вами в ближайшее время.".trim()));

    }
}