package com.gentech.security;

import javax.crypto.SecretKey;

import org.junit.jupiter.api.Test;
import io.jsonwebtoken.Jwts;
import jakarta.xml.bind.DatatypeConverter;

public class JwtSecretMakerTest {
	
	@Test
	public void geenrateSecretKey()
	{
		SecretKey key=Jwts.SIG.HS512.key().build();
		String encodedKey=DatatypeConverter.printHexBinary(key.getEncoded());
		System.out.println("Secret Key :"+encodedKey);
	} 

}
