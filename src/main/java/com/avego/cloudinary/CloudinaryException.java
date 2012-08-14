package com.avego.cloudinary;

/**
 * The CloudinaryException represents an Exception caused by some failure to interact with Cloudinary
 * @version $Id$
 * @author eoghancregan
 */
@SuppressWarnings("serial")
public class CloudinaryException extends Exception {

	/**
	 * Instantiates a new Cloudinary exception.
	 * @param msg the msg
	 */
	public CloudinaryException(String msg) {
		super(msg);
	}

	/**
	 * Instantiates a new Cloudinary exception.
	 * @param message the message
	 * @param cause the cause
	 */
	public CloudinaryException(String message, Throwable cause) {
		super(message, cause);
	}

	/**
	 * Instantiates a new Cloudinary exception.
	 * @param cause the cause
	 */
	public CloudinaryException(Throwable cause) {
		super(cause);
	}
}
