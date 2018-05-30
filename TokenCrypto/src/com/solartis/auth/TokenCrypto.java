package com.solartis.auth;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.solartis.util.security.AESSymmentricAlgorithm;

public class TokenCrypto {

	public static void main(String[] args) {
		
		try {
			if (args.length >= 2) {
				AESSymmentricAlgorithm aesSymmentricAlgorithm = new AESSymmentricAlgorithm();
				String encryptionKey = "2547B86F04C9A7F5";
				for (int i = 0; i < args.length; i++) {
					switch (args[i].toLowerCase()) {
					case "-k":
						encryptionKey = args[i + 1];
						break;
					case "-e":
						System.out.println();
						String encryptedToken = aesSymmentricAlgorithm.encrypt(encryptionKey, args[i + 1]);
						System.out.println(encryptedToken.replaceAll(System.getProperty("line.separator"), ""));
						break;
					case "-d":
						System.out.println();
						System.out.println(aesSymmentricAlgorithm.decrypt(encryptionKey, args[i + 1]));
						break;
					case "-c":
						System.out.println();
						isValidToken(args[i + 1], encryptionKey);
						break;
					case "-h":
						printHelp();
						break;
					}
				}
			} else {
				printHelp();
			}
		} catch (Exception e) {
			System.err.println(e.getMessage());
			printHelp();
		}
	}

	private static boolean isValidToken(String token, String encryptionKey) throws Exception {
		AESSymmentricAlgorithm aesSymmentricAlgorithm = new AESSymmentricAlgorithm();
		String decryptedToken = aesSymmentricAlgorithm.decrypt(encryptionKey, token);

		boolean isValid = false;
		Date currentDate = new Date();
		List<String> tokenDetailList = new ArrayList<>();

		Pattern pattern = Pattern.compile("(\\[)(.*?)(\\])");
		Matcher matcher = pattern.matcher(decryptedToken);

		while (matcher.find()) {
			tokenDetailList.add(matcher.group(2));
		}

		SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEE MMM d HH:mm:ss z yyyy");
		Date expiryDate = simpleDateFormat.parse((String) tokenDetailList.get(5));

		if (currentDate.before(expiryDate)) {
			System.out.println("Given Token is Valid. This token will expire on " + expiryDate);
		} else {
			System.err.println("Given Token is Invalid. This token was expire on " + expiryDate);
		}

		return isValid;
	}
	
	private static void printHelp() {
		System.out.println("HELP:\n-----\n -c <Token> \n To automatically check the validity of the token. \n \n -h \n Help \n\n -k <EncryptionKey> \n To specify the AESKey to be used for both encryption and decryption. If not specified It will pick the default one Hardcoded in the program. \n\n -d <Token> \n To decrypt the token and display the content of the token \n\n -e <DecryptedToken> \n To encrypt the decrypted form of the token.");
		
		
		/*System.out.println(
				"For Encryption: Try using \"TokenCrypto -e ka5KJ7wkvfesx14zU5nlB4+U19gRsGs6p9dSX8+actJV==\"");
		System.out.println(
				"For Decryption: Try using \"TokenCrypto -d [1][6][username][host_timestamp][start_date][end_date]{privilege_1}{privilege_2}\"");
		System.out.println(
				"To Automatically check the validity: Try using \"TokenCrypto -c ka5KJ7wkvfesx14zU5nlB4+U19gRsGs6p9dSX8+actJV==\"");
	*/}
}
