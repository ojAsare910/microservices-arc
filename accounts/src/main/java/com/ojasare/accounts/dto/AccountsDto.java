package com.ojasare.accounts.dto;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.Id;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Pattern;
import lombok.Data;

@Data
@Schema(
        name = "Accounts",
        description = "Schema to hold Account Information"
)
public class AccountsDto {


    @NotEmpty(message = "Account number can not be a null or empty")
    @Pattern(regexp = "(^$|[0-9]{10})", message = "Account number must be 10 digits")
    @Schema(
            description = "Account number of Test Bank account", example = "3582740264"
    )
    private Long accountNumber;


    @NotEmpty(message = "Account type can not be a null or empty")
    @Schema(
            description = "Account type of Test Bank account", example = "Savings"
    )
    private String accountType;


    @NotEmpty(message = "Branch address can not be a null or empty")
    @Schema(
            description = "Test Bank branch address", example = "UCC Branch"
    )
    private String branchAddress;
}
