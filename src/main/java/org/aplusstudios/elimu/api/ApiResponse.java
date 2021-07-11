package org.aplusstudios.elimu.api;

public record ApiResponse<T>(boolean success,T data,String message) {
}
