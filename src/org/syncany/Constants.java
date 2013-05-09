/*
 * Syncany, www.syncany.org
 * Copyright (C) 2011 Philipp C. Heckel <philipp.heckel@gmail.com> 
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */
package org.syncany;

import java.util.regex.Pattern;


/**
 *
 * @author Philipp C. Heckel
 */
public abstract class Constants {
    /**
     * Default cipher to encrypt the chunks.
     */
    public static final String DEFAULT_ENCRYPTION_CIPHER = "AES";

    /**
     * Default keylength for the given cipher in bit.
     */
    public static final int DEFAULT_ENCRYPTION_KEYLENGTH = 128;
    

    public static final Pattern PLUGIN_NAME_REGEX_PLUGIN_INFO = Pattern.compile("org\\.syncany\\.connection\\.plugins\\.([^.]+)\\.[\\w\\d]+PluginInfo");
    public static final String PLUGIN_FQCN_PREFIX = "org.syncany.connection.plugins.";
    public static final String PLUGIN_FQCN_SUFFIX = "PluginInfo";
    public static final String PLUGIN_FQCN_PATTERN = PLUGIN_FQCN_PREFIX+"%s.%s"+PLUGIN_FQCN_SUFFIX;

    /**
     * If an indexed file is not found in the DB by its path, the file is looked
     * up by its checksum. If more than one file with the same checksum is found,
     * the one with the smallest Leivenstein distance is used as previous version.
     * This value sets an upper bound. If the Levenshtein distance exceeds this
     * value, the file is assumed to be new.
     *
     * <p>The Levenshtein distance represents the number of edits required to
     * change one string into another. Example: d(aab, ccb) = 2
     *
     * @see http://en.wikipedia.org/wiki/Levenshtein_distance
     */
    public static final int MAXIMUM_FILENAME_LEVENSHTEIN_DISTANCE = 4;

    /**
     * File separator in the database; Does not have to be equal to the file 
     * system separator.
     */
    public static final String DATABASE_FILE_SEPARATOR = "/";

    public static final String FILE_IGNORE_PREFIX = ".ignore";
}
