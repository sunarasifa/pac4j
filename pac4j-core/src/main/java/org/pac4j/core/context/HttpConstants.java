/*
  Copyright 2012 - 2014 Jerome Leleu

   Licensed under the Apache License, Version 2.0 (the "License");
   you may not use this file except in compliance with the License.
   You may obtain a copy of the License at

       http://www.apache.org/licenses/LICENSE-2.0

   Unless required by applicable law or agreed to in writing, software
   distributed under the License is distributed on an "AS IS" BASIS,
   WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
   See the License for the specific language governing permissions and
   limitations under the License.
 */
package org.pac4j.core.context;

/**
 * Some HTTP constants.
 * 
 * @author Jerome Leleu
 * @since 1.4.0
 */
public interface HttpConstants {

    public static final int OK = 200;

    public static final int UNAUTHORIZED = 401;

    public static final int FORBIDDEN = 403;

    public static final int TEMP_REDIRECT = 302;

    public static final int DEFAULT_PORT = 80;

    public static final String LOCATION_HEADER = "Location";

    public static final String AUTHORIZATION_HEADER = "Authorization";

    public static final String AUTHENTICATE_HEADER = "WWW-Authenticate";

    public static final String CONTENT_TYPE_HEADER = "Content-Type";

    public final static String HTML_CONTENT_TYPE = "text/html; charset=utf-8";

    /* Use Pac4jConstants.REQUESTED_URL instead */
    @Deprecated
    public final static String REQUESTED_URL = "pac4jRequestedUrl";

    /* Use Pac4jConstants.USER_PROFILE instead */
    @Deprecated
    public final static String USER_PROFILE = "pac4jUserProfile";

}
