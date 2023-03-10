package com.crud.tasks.domain;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Data
@JsonIgnoreProperties(ignoreUnknown = true)
public class TrelloBadgesDto {

    @JsonProperty("votes")
    private int votes;

    @JsonProperty("attachments")
    private AttachmentByTypeDto attachments;
}
