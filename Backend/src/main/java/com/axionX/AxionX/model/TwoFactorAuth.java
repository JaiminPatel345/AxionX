package com.axionX.AxionX.model;

import com.axionX.AxionX.domain.VerificationType;
import lombok.Data;


@Data
public class TwoFactorAuth {
    private boolean isEnabled = false;
    private VerificationType sendTo;


}
