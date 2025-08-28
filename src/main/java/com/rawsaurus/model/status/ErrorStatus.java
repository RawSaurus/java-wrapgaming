package com.rawsaurus.model.status;

public class ErrorStatus {
    private String status;
    private ErrorOfStatus error;

    public String getStatus() {
        return status;
    }

    public ErrorOfStatus getError() {
        return error;
    }

    public static class ErrorOfStatus {
        private String field;
        private String message;
        private String code;
        private String value;

        public String getValue() {
            return value;
        }

        public String getCode() {
            return code;
        }

        public String getMessage() {
            return message;
        }

        public String getField() {
            return field;
        }

        @Override
        public String toString() {
            return "ErrorOfStatus{" +
                    "field='" + field + '\'' +
                    ", message='" + message + '\'' +
                    ", code='" + code + '\'' +
                    ", value='" + value + '\'' +
                    '}';
        }
    }
}
