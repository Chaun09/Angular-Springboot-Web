package com.example.webecom.entity;

import lombok.Getter;

@Getter
public class ResponseMessage {
        private final String message;

        public ResponseMessage(String message) {
            this.message = message;
        }

}

