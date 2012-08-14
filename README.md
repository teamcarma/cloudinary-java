Cloudinary Integration for Java.  

Sample initialisation:

	private static final Cloudinary CLOUDINARY = new Cloudinary(new CloudinaryRepository(REPO_NAME, SECRET_KEY, API_KEY));

Upload:

	byte[] existingPhotoBytes = IOUtils.toByteArray(photo.getPhotoStream());
	String publicId;

	try {
		publicId = CLOUDINARY.postPhotoToCloudinary(existingPhotoBytes, photo.getMimeType());
	} catch (CloudinaryException e) {
		throw new CDNException("Exception occured while attempting to Upload Existing Photo to Cloudinary.", e);
	}

Download:

	try {
		return CLOUDINARY.buildCloudinaryPhotoURI(remoteImageKey, mimeType, width, height);
	} catch (CloudinaryException e) {
		throw new CDNException("Exception occured while attempting to build Cloudinary URL.", e);
	}

Deletion:

	try {
		CLOUDINARY.deleteImageFromCloudinary(remoteImageKey);
	catch (CloudinaryException e) {
		throw new CDNException("Exception occured while attempting to Delete Existing Photo from Cloudinary.", e);
	}


