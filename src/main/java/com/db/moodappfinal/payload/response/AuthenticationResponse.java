package com.db.moodappfinal.payload.response;


import com.db.moodappfinal.model.RefreshToken;

public record AuthenticationResponse(String jwt, RefreshToken refreshToken) {
}