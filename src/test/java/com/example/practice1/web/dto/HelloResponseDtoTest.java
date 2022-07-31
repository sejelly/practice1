package com.example.practice1.web.dto;

import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class HelloResponseDtoTest {

    @Test
    public void lomboktest(){
        //given
        String name = "test";
        int amount = 10000;

        //when
        HelloResponseDto dto = new HelloResponseDto(name,amount);

        //then
        assertThat(dto.getName()).isEqualTo(name);
        assertThat(dto.getAmount()).isEqualTo(amount);
    }

    @Test
    public void getName() {
    }

    @Test
    public void getAmount() {
    }
}