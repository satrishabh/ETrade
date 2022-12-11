package com.project.rishabh.etrade.validations;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class AccountTypeValidator implements ConstraintValidator<AccountType, String> {
    /**
     * Implements the validation logic.
     * The state of {@code value} must not be altered.
     * <p>
     * This method can be accessed concurrently, thread-safety must be ensured
     * by the implementation.
     *
     * @param accountType object to validate
     * @param context     context in which the constraint is evaluated
     * @return {@code false} if {@code value} does not pass the constraint
     */
    @Override
    public boolean isValid(String accountType, ConstraintValidatorContext context) {
        return (accountType.equals("saving") || accountType.equals("current"));
    }
}
