/*
 * PowerAuth Server and related software components
 * Copyright (C) 2021 Wultra s.r.o.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.wultra.security.powerauth.client.model.request;

import lombok.Data;
import lombok.ToString;

import java.math.BigInteger;

/**
 * Model class representing request for offline signature verification.
 *
 * @author Petr Dvorak, petr@wultra.com
 */
@Data
public class VerifyOfflineSignatureRequest {

    private String activationId;
    private String data;
    @ToString.Exclude
    private String signature;
    private BigInteger componentLength;
    private boolean allowBiometry;

}
