package pages.components;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.$;
import static com.codeborne.selenide.Selenide.$$;

public class CalendarComponent {

    public void setDate(String day, String month, String year) {
        // Выбираем год
        $(".react-datepicker__year-select").selectOption(year);

        // Выбираем месяц
        $(".react-datepicker__month-select").selectOption(month);

        // Выбираем день (убираем ведущий ноль)
        String dayNumber = day.startsWith("0") ? day.substring(1) : day;
        $$(".react-datepicker__day:not(.react-datepicker__day--outside-month)")
                .findBy(text(dayNumber))
                .click();
    }
}