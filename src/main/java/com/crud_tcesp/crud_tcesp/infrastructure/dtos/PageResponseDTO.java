package com.crud_tcesp.crud_tcesp.infrastructure.dtos;

import lombok.Builder;
import lombok.Getter;

import java.util.List;

@Getter
@Builder
public class PageResponseDTO<T> {

    private List<T> content;

    private int currentPage;

    private int totalPages;

    private long totalElements;

    private int size;

    private boolean first;

    private boolean last;
}