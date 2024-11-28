package com.swproject.hereforus.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.constraints.NotBlank;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class ScheduleDto {

    @Schema(hidden = true)
    private Long id;

    @NotBlank(message = "내용을 입력해주세요.")
    private String content;

    private LocalDate scheduleDate;
}
