package co.com.sofka.admisiones.general.values;

import co.com.sofka.domain.generic.Identity;

public class Email extends Identity {
    private Email(String value) {
        super(value);
    }

    public static Email of(String value) {
        return new Email(value);
    }
}
