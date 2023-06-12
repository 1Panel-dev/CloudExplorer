package com.fit2cloud.controller.request;

import com.fit2cloud.common.validator.group.ValidationGroup;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import jakarta.validation.constraints.NotBlank;

@Data
public class DemoRequest {

    @Schema(title = "Demo值", required = true)
    @NotBlank(groups = {ValidationGroup.UPDATE.class}, message = "{i18n.demo.value.is.not.empty}")
    private String value;


}
