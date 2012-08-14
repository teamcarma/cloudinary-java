/*
 * Copyright © 2012 Avego Ltd., All Rights Reserved.
 * For licensing terms please contact Avego LTD.
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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
