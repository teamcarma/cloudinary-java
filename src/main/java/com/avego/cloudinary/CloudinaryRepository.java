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
 * The CloudinaryRepository represents the Details of a Cloudinary Repository
 * @version $Id$
 * @author eoghancregan
 */
public class CloudinaryRepository {

	private String repositoryName;
	private String secretkey;
	private String apiKey;

	/**
	 * This creates a CloudinaryRepository
	 * @param repositoryName
	 * @param secretKey
	 * @param apiKey
	 */
	public CloudinaryRepository(String repositoryName, String secretKey, String apiKey) {

		this.repositoryName = repositoryName;
		this.secretkey = secretKey;
		this.apiKey = apiKey;
	}

	/**
	 * This returns the Repository Name
	 * @return
	 */
	public String getRepositoryName() {
		return this.repositoryName;
	}

	/**
	 * This sets the Repository Name
	 * @param repositoryName
	 */
	public void setRepositoryName(String repositoryName) {
		this.repositoryName = repositoryName;
	}

	/**
	 * This returns the Repository Secret Key
	 * @return
	 */
	public String getSecretkey() {
		return this.secretkey;
	}

	/**
	 * This sets the Repository Secret Key
	 * @param secretkey
	 */
	public void setSecretkey(String secretkey) {
		this.secretkey = secretkey;
	}

	/**
	 * This returns the Repository API Key
	 * @return
	 */
	public String getApiKey() {
		return this.apiKey;
	}

	/**
	 * This sets the Repository API Key
	 * @param apiKey
	 */
	public void setApiKey(String apiKey) {
		this.apiKey = apiKey;
	}

	/**
	 * This returns the REST end point for Uploading Images
	 * @return
	 */
	public String getUploadUrl() {

		StringBuilder url = new StringBuilder();

		url.append("http://api.cloudinary.com/v1_1/");
		url.append(this.repositoryName);
		url.append("/image/upload");

		return url.toString();
	}

	/**
	 * This returns the REST end point for Downloading Images
	 * @return
	 */
	public String getDownloadUrl() {

		StringBuilder url = new StringBuilder();

		url.append("http://res.cloudinary.com/");
		url.append(this.repositoryName);
		url.append("/image/upload");

		return url.toString();
	}

	/**
	 * This returns the REST end point for Deleting Images
	 * @return
	 */
	public String getDeletionUrl() {

		StringBuilder url = new StringBuilder();

		url.append("http://api.cloudinary.com/v1_1/");
		url.append(this.repositoryName);
		url.append("/image/destroy");

		return url.toString();
	}

}
