package com.neiten.rest;

import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
public class Comment {
    private String text;
}
