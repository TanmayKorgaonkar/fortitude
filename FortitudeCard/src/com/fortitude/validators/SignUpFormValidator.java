package com.fortitude.validators;

import java.text.Normalizer.Form;

import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

import com.fortitude.dto.AccountDto;
public class SignUpFormValidator implements Validator{
	
	private static final String EMAIL_PATTERN = "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	
	@Override
	public boolean supports(Class<?> paramClass) {
		return AccountDto.class.equals(paramClass);
	}

	@Override
	public void validate(Object object, Errors errors) {
		AccountDto form = (AccountDto)object;
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountId", "valid.accountId");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountFirstName", "valid.accountFirstName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountLastName", "valid.accountLastName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountNickName", "valid.accountNickName");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "rank", "valid.rank");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "dateOfBirth", "valid.dateOfBirth");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "gender", "valid.gender");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "mobileNumber", "valid.mobileNumber");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "country", "valid.country");
		if(!form.getEmail().matches(EMAIL_PATTERN)){
			errors.rejectValue("email", "valid.email");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "liteCoinAddress", "valid.liteCoinAddress");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "sponsorLink", "valid.sponsorLink");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "accountPassword", "valid.accountPassword");
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "passwordConfirmation", "valid.passwordConfirmation");
		if(!form.getAccountPassword().equals(form.getPasswordConfirmation())){
			errors.rejectValue("passwordConfirmation", "valid.passwordConfDiff");
		}
		ValidationUtils.rejectIfEmptyOrWhitespace(errors, "userRole", "userRole");
	}

}
